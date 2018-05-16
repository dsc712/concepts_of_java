// to calculate nth fibonacci number - where n is very large number of order 10^18

// let f(n) be the (n + 1)th fibonacci number, we have two case: n is even and n is odd.

// f(2 * k) = f(k) * f(k) + f(k - 1) * f(k - 1)
// f(2 * k + 1) = f(k) * f(k + 1) + f(k - 1) * f(k)

#include <map>
#include <iostream>
using namespace std;

#define long long long
const long M = 1000000007; // modulo
map<long, long> F;

long f(long n) {
	if (F.count(n)) return F[n];
	long k=n/2;
	if (n%2==0) { // n=2*k
		return F[n] = (f(k)*f(k) + f(k-1)*f(k-1)) % M;
	} else { // n=2*k+1
		return F[n] = (f(k)*f(k+1) + f(k-1)*f(k)) % M;
	}
}

main(){
	long n;
	F[0]=F[1]=1;
	while (cin >> n)
	cout << (n==0 ? 0 : f(n-1)) << endl;
}