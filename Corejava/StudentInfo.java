import java.util.*;

	class Student implements java.io.Serializable
	{
	private int id ;
	private String name;
	public Student(int id , String name)
	{
		this.id	= id;
		this.name = name;		
	}


	public String toString()
	{
		return id+": "+name;
	}

                    


	public int hashCode(){
	return id; 
	}
	}



	class StudentInfo
	{
	public static void main(String[] args)
	{
		Student s1=new Student(1,"nag"); 
		Student s2=new Student(2,"arjun");
		Student s3=new Student(1,"nag");
		Student s4=new Student(1,"arjun");
		Student s5=new Student(2,"nag");
		Student s6=new Student(3,"Arun");
	
		HashSet hs=new HashSet();

		hs.add(s1); //1
		hs.add(s2); //2
		hs.add(s3); 
		hs.add(s4); 
		hs.add(s5);  
		hs.add(s6); // 3

		System.out.println(hs); 		
}
	}











