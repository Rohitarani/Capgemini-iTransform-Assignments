package CollectionAssignments;

import java.util.HashSet;  
import java.util.Iterator;  
public class A2hash {  
     public static void main(String args[]){    
        HashSet<String> h=new HashSet(); 
               h.add("Apple");  
               h.add("Banana");      
               h.add("Cat");     
               h.add("Dog");    
               h.add("Elephant");  
               Iterator<String> i=h.iterator();  
               while(i.hasNext()) 
               {    
               System.out.println(i.next());
               }    
     
}
     } 



 