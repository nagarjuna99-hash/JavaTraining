class NonStaticDemo{

 int a=10;

public static void main(String[] args){

NonStaticDemo nd=new NonStaticDemo();
NonStaticDemo nd1=new NonStaticDemo();
NonStaticDemo nd2=new NonStaticDemo();

nd.a=20;
nd1.a=40;
nd2.a=90;

System.out.println(nd.a);

System.out.println(nd1.a);

System.out.println(nd2.a);


}

}