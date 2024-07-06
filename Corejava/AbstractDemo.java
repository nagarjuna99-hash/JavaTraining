abstract class AbstractDemo{

int a=10;

int b=20;

public AbstractDemo(){

}

abstract void m1();

abstract void m2();

}


abstract class AbstractDemoImpl extends AbstractDemo{
public void m1(){
System.out.println("providing impl");
}
}

class FinalDemo extends AbstractDemoImpl{

public void m2(){
System.out.println("final impl");
}

public static void main(String[] args){

//AbstractDemo a=new AbstractDemo();  

//AbstractDemoImpl ad=new AbstractDemoImpl();

FinalDemo fd=new FinalDemo();

ad.m1();
ad.m2();

}
}










