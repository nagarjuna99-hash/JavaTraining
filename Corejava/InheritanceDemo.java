class Inherit{

int a=10;

public void m1(){
System.out.println("premium logic");
}
}

class InheritanceDemo extends Inherit{

int b=20;

public void m2(){
System.out.println("tax logic");
}

public static void main(String[] args){

Inherit i=new Inherit();
//System.out.println(i.a);
//i.m1();


//System.out.println(i.b);
//i.m2();

/*InheritanceDemo id=new InheritanceDemo();

System.out.println(id.a);
id.m1();
System.out.println(id.b);
id.m2();*/


Inherit i1 = new InheritanceDemo();
System.out.println(i1.a);
i1.m1();


//System.out.println(i1.b);
//i1.m2();

InheritanceDemo id1=new Inherit();

}
}

Modifers:
=========

public - with in class, with package , out side package and out side class
private - with in same class
protected - with in class, with in package , out side package child class reference
<default> - with class, with in same packge all the classes.


public <- protected <- <default> <- private









package com;
 class A{

 private int a=10;

 private A(){
 
 }

 private void m1(){

 }

}

class B{

A a=new A();

a.m1();

}



package in;
class C extends A{

A a=new A();
a.m1();
}
