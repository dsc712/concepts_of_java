#include <bits/stdc++.h>
using namespace std;

template < typename T> 
class Graph{
    map< T , list<T> > adjList ; 
    
    public : 
      
      void addEdge(T u , T v , bool bidir ){
         adjList[u].push_back(v)  ; 
         
         if(bidir){  // if edge is bidirectional add edge in reverse direction also 
             adjList[v].push_back(u) ;
         }
      }
      
      void printAdjList() {
          
          for(auto row : adjList){
              T key = row.first ;
              cout<<key<<" -> " ;
               
               for(T element : row.second ){
                   cout<<element<<" , " ;
               }
               
               cout<<endl ; 
          }
      }
      
} ;
int main() {
    
    Graph<string> g ;
    
    g.addEdge("Delhi" , "Amritsar" , false ) ;
    g.addEdge("Jaipur" , "Amritsar" , false) ;
    g.addEdge("Delhi" , "Bangalore" , true ) ;
    g.addEdge("Delhi" , "Lucknow" , true  ) ;
    g.addEdge("Jaipur" , "Bangalore" , true ) ;
    g.addEdge("Siachen" , "Amritsar" , false ) ;
    
    g.printAdjList() ;
}
