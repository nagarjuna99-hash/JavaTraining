class P{

P(){
System.out.println(this.hashCode());
}
}

class C extends P{
C(){
System.out.println("Hi");
}
}

class Demo{

public static void main(String[] args){

C c=new C();
System.out.println(c.hashCode());
}

}