package CollectionAssignments;

import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class A2Link {   
     public static void main(String args[]){    
            LinkedHashSet<String> lh=new LinkedHashSet();    
                   lh.add("A");     
                   lh.add("B");      
                   lh.add("C");     
                   lh.add("D");    
                   lh.add("E");    
                   Iterator<String> i=lh.iterator();   
                   while(i.hasNext())    
                   {    
                   System.out.println(i.next());    
                   }    
     }    
    }  
