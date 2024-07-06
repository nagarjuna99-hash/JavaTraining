class Student{

int a;
int b;

public Student(int b){
a=b;
System.out.println(a);
}

public Student(int a,int b){
this.a=a;
this.b=b;
System.out.println(a);
System.out.println(b);
}

public static void main(String[] args){

Student s=new Student(10);
Student s1=new Student(10,20);


System.out.println(s.a);

System.out.println(s1.b);

}
}






