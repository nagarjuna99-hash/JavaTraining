class Parent{

public void gold(){
System.out.println("2 Kg gold");
}

public void flat(){
System.out.println("6 Bhk");
}

public static void marry(){
System.out.println("dipika");
}
}

class Child extends Parent{

@Override
public static void marry(){
System.out.println("aish");
}
}

class OverrideDemo{

public static void main(String[] args){

Child c=new Child();

c.gold(); // 2 kg
c.flat();  // 6 bhk
c.marry();
}
}

// until java 1.4
// java 5.0 co-varient return type
// object , String , Interger
// primitives (short,byte,int,long,float,double,char,boolean)




// method over loading 
// method hiding  


// method overrding  



















