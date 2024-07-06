// Interface

interface InterfaceDemo{

int a=10;

}

interface InterfaceExp{

int a=10;

}
 
class InterfaceDemoImpl implements InterfaceDemo,InterfaceExp{

public static void main(String[] args){

System.out.println(InterfaceDemo.a);
System.out.println(InterfaceExp.a);


}

}


