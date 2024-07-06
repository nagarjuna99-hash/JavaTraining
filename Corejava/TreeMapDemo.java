import java.util.*;

class TreeMapDemo{

public static void main(String[] args){

TreeMap tm=new TreeMap();
tm.put(1,"Naga");
tm.put(3,"Arjun");
tm.put(4,"Raja");
tm.put(3,"Arju");
//tm.put("naga","naga"); // required homo 
tm.put(1,null);
tm.put(2,null);

System.out.println(tm);

}

}