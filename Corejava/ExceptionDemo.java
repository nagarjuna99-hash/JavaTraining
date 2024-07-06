class ExceptionDemo{

public static void main(String[] args)  throws InterruptedException , IOException{
m1();
}


public static void m1() throws InterruptedException,IOException{
m2();
}
public static void m2() throws InterruptedException,IOException{
m3();
}
public static void m3() throws InterruptedException,IOException{
Thread.sleep(100);
}


}







