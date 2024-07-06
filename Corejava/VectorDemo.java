import java.util.*;

class VectorDemo{

public static void main(String[] args){

Vector<Integer> ll=new Vector<Integer>(); 


ll.add(10);

ll.add(20);

ll.add(30);

System.out.println(ll); //[10,20,30] 

Enumeration e=ll.elements();

while(e.hasMoreElements()){

System.out.println(e.nextElement());

}
}
}



