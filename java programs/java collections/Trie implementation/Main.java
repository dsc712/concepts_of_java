// implementing trie data structure

// 1. Trie is an information retrieval data structure .
// 2. It is called radix/prefix tree .
// 3. It is used for efficient searching of keys in the container . 
//   If the keys are strings , then a particular string can be searched 
//   in O(n) length where n denotes the length of the string to be searched .
// 4. Each node of the trie has multiple branches , a node where a word ends 
//   is marked with isTerminated = true 

import java.util.* ;
import java.io.* ;

class Node {
    
    char data ;
    boolean isTerminated ;
    HashMap< Character , Node > hm  = new HashMap<>(26);
    Node(char ch ){
        this.data = ch ;
        this.isTerminated = false ;
    }
    
}

class Trie{
  Node root ;
  
  Trie(){
      root = new Node('\0') ;
  }
  
  void addWord(String word ){
         Node temp = root ;
         
         char text[] = word.toCharArray() ;
         
         for(int i = 0 ; i < text.length ; i++ ){
             char ch = text[i] ;
             
             // if current node's hashmap does not contain the character ch
             if( !temp.hm.containsKey(ch) ){
                // create new node 
                Node child = new Node(ch) ;
                // create a key for the current character in temp node's hashmap 
                // and set it's value to the new node created 
                temp.hm.put(ch , child );
                temp = child ; // make the new node as temp node 
             }
             else{
                 temp = temp.hm.get(ch);
             }
             
         } // end of for loop 
         
         // when end of word is reached , loop will be terminated 
         temp.isTerminated = true ;
     } // end of addWord() function 
     
     
     boolean search(String word){
         Node temp = root ;
         
         char text[] = word.toCharArray() ;
         
         for(int i = 0 ; i < text.length ; i++){
             
             char ch = text[i] ;
             // if character found , move on to the next pointing node 
             if(temp.hm.containsKey(ch)){
                 temp = temp.hm.get(ch) ;
             }else{ // return false otherwise 
                 return false ;
             }
             
             System.out.print(temp.data + " ");
         }// end of for loop 
         
         return temp.isTerminated;
     }
}

public class Main {
    public static void main(String args[]) {
    
      String words[] = {
        "apple" ,
        "ape" ,
        "coder" ,
        "codemania" ,
        "no" ,
        "noball" ,
        "banana" ,
        "band"
      } ;
      
      Trie t = new Trie() ;
      for(String s : words ){
          t.addWord(s) ;
      }
      
      Scanner sc = new Scanner(System.in) ;
      String searchWord = sc.next() ;
      
      if(t.search(searchWord) ){
          System.out.println("word found ") ;
      }else{
          System.out.println("word not found") ;
      }
      
    }
    
}