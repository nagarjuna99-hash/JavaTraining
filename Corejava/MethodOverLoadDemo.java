// we can define multiple methods with same name and different arguments list

class MethodOverLoadDemo{


public void m1(float f){
System.out.println("single argument");
}

public void m1(int a, float b){// 10,20.0
System.out.println("two argument");
}

public static void main(String[] args){

MethodOverLoadDemo md=new MethodOverLoadDemo();
md.m1(10,20);

}
}

// > javac MethodOverLoadDemo.java 

- method over loadding is achived with in same class.

float sal=1234.233;
float sal=20000;


Runtime polymorphism:
=====================

- Method Overriding 

 method signature:
 =================

 public void add(int a, int b){

 }

- method overriding can be achived from parent class to child class


interface IBoPremiumCal{

public DbDecimal premiumCal();
public DbDecimal taxCal();
public DbDecimal discountCal();

}

public abstract class BoVertragPremiumCal implements IBoPremiumCal{

public DbDecimal premiumCal(){
// default impl
}
public DbDecimal taxCal(){
// default impl
}
}


UK:











- Method hidding