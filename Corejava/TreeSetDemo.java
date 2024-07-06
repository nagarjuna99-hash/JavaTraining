import java.util.*;

class TreeSetDemo{

public static void main(String[] args){


TreeSet ts=new TreeSet();

ts.add(10); 
// Integer i=new Integer(10);
// int - java 5(Auto boxing(primitive to object ) and auto un boxing(Object to primitive))

ts.add(40);

ts.add(30);

ts.add(2);

ts.add(1);

ts.add(30);

ts.add(2);




System.out.println(ts);

}
}

// its is child class of Set interface
// duplicates are not allowed
// homogenious objects
// null insertion is possible possible as first object entry but after we cant add any objects (java 1.6) from java 7.O onwords null entry is not allowed
// insertion is follwed some sorting order (asc/dsc) - default asc
// if any class is following natural sorting order that class must be homogenious and Comparable(all the Wrapper classes and String class already //implementedd Comparable interface)