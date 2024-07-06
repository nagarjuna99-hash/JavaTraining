abstract class Employee{
String name;
int id;

public Employee(String name, int id){
this.name=name;
this.id=id;
}

}

class DeptImpl extends Employee {
String dname;
int did;
public DeptImpl(String name,int id,String dname,int did){
this.dname=dname; // mca
this.did=did; //123
super(name,id);
}

public static void main(String[] args){
DeptImpl di=new DeptImpl("Naga",1,"CE",123);

System.out.println(di.name);
System.out.println(di.id);
System.out.println(di.dname);
System.out.println(di.did);
}
}





