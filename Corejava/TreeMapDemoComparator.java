import java.util.*;
class Faculty
{
private int id;
private String name;
private int age;
public Faculty(int id,String name,int age)
{
this.id=id;
this.name=name;
this.age=age;
}
public String toString()
{
return "("+id+","+name+","+age+")";
}
public int getId()
{
return id;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
}
class IdComparator implements Comparator<Faculty>
{
public int compare(Faculty f1,Faculty f2)
{
return f1.getId()-f2.getId();
}
}
class NameComparator implements Comparator<Faculty>
{
public int compare(Faculty f1,Faculty f2)
{
String s1=f1.getName();
String s2=f2.getName();
int n=s1.compareTo(s2);
return n;
}
}
class AgeComparator implements Comparator<Faculty>
{
public int compare(Faculty f1,Faculty f2)
{
return f1.getAge()-f2.getAge();
}
}
class TreeMapDemoComparator
{
public static void main(String[] args)
{

IdComparator idc=new IdComparator();
NameComparator nc=new NameComparator();
AgeComparator ac=new AgeComparator();

Faculty f1=new Faculty(1,"nag",25);
Faculty f2=new Faculty(3,"arjun",26);
Faculty f3=new Faculty(2,"raj",18);
TreeMap<Faculty,String> map1=new TreeMap<Faculty,String>(idc);
TreeMap<Faculty,String> map2=new TreeMap<Faculty,String>(nc);
TreeMap<Faculty,String> map3=new TreeMap<Faculty,String>(ac);
map1.put(f1,"java");
map1.put(f2,"advjava");
map1.put(f3,"MTECH");
map2.put(f1,"java");
map2.put(f2,"advjava");
map2.put(f3,"MTECH");
map3.put(f1,"java");
map3.put(f2,"advjava");
map3.put(f3,"MTECH");
System.out.println(map1);
System.out.println(map2);
System.out.println(map3);
}
}
