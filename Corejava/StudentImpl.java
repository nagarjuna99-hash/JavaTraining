abstract class Person{

String name;
int age;

}

class StudentImpl extends Person{

int id;
int marks;

public StudentImpl(String name, int age, int id, int marks){
//super(name,age);
this.name=name;
this.age=age;
this.id=id;
this.marks=marks;


}

public static void main(String[] args){
StudentImpl s=new StudentImpl("Naga",35,10,98);
System.out.println(s.name);
System.out.println(s.age);
System.out.println(s.id);
System.out.println(s.marks);


}
}

