	#include <bits/stdc++.h>
	using namespace std;
	
	struct comparator{
	    
	    bool operator ()(int a , int b){
	    if(a > b ){
	        return true;
	    }else{
	        return false ;
	    }
	}
	
	};
	
	int main() {
	    // by default priority queue is max_heap , using comparator we can change it to minheap
	    
	    priority_queue< int , vector<int> > maxpq ;
	    priority_queue< int , vector<int> , comparator > minpq ;
	    
	    maxpq.push(10) ;
	    maxpq.push(3) ;
	    maxpq.push(7) ;
	    
	    minpq.push(10) ;
	    minpq.push(3) ;
	    minpq.push(7) ;
	    
	    
	    cout<<maxpq.top()<<endl ;
	    cout<<minpq.top()<<endl ;
	    
	
	return 0 ;
	}
