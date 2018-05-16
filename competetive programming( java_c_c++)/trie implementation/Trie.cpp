// implementing trie data structure

// 1. Trie is an information retrieval data structure .
// 2. It is called radix/prefix tree .
// 3. It is used for efficient searching of keys in the container . 
//   If the keys are strings , then a particular string can be searched 
//   in O(n) length where n denotes the length of the string to be searched .
// 4. Each node of the trie has multiple branches , a node where a word ends 
//   is marked with isTerminal = true 
   

#include <iostream>
#include <unordered_map>
using namespace std;

#define hashmap unordered_map<char , node* >

// each node of the trie should be like this  
class node {
    public : 
    char data ;
    hashmap h ; 
    bool isTerminal ;
    
    // initializer list improves performance 
    node(char d) : data(d) , isTerminal(false)
    { }
    
    
} ;


class Trie {
    node *root ;
    
    public:
     Trie(){
        root = new node('\0') ;
     }
     
     void addWord(char *word ){
         node *temp = root ;
         for(int i = 0 ; word[i] != '\0' ; i++ ){
             char ch = word[i] ;
             
             // if current node's hashmap does not contain the character ch
             if(temp->h.count(ch) == 0 ){
                // create new node 
                node *child = new node(ch) ;
                // create a key for the current character in temp node's hashmap 
                // and set it's value to the new node created 
                temp->h[ch] = child ;
                temp = child ; // make the new node as temp node 
             }
             else{
                 temp = temp->h[ch] ;
             }
             
         } // end of for loop 
         
         // when end of word is reached , loop will be terminated 
         temp->isTerminal = true ;
     } // end of addWord() function 
     
     bool search(char *word){
         node *temp = root ;
         for(int i = 0 ; word[i] != '\0' ; i++){
             char ch = word[i] ;
             // if character found , move on to the next pointing node 
             if(temp->h.count(ch)){
                 temp = temp->h[ch] ;
             }else{ // return false otherwise 
                 return false ;
             }
             
             cout<<temp->data<<" " ;
         }// end of for loop 
         
         return temp->isTerminal ;
     }
     
} ;

int main() {
    char word[10][100] = {
        "apple" ,
        "ape" ,
        "coder" ,
        "codemania" ,
        "no"
        "noball"
        "banana"
        "band"
    } ;
    
    Trie t  ;
    for(int i=0 ; i<5 ; i++ ){
        t.addWord(word[i]) ;
    }
    char searchWord[100] ;
    cin.getline(searchWord , 100 ) ;
    
    if(t.search(searchWord) ){
        cout<<searchWord<<" found ... " <<endl ;
    }else{
        cout<<"not found"<<endl ;
    }
    
return 0 ;
}
