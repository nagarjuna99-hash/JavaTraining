import java.util.*;  
	import java.io.*;  
	public class PropertiesDemo {  
	public static void main(String[] args)throws Exception{  
	Properties p=new Properties();  
	p.setProperty("name","nag");  
	p.setProperty("email","nagarjunajava3@gmail.com");  
	p.store(new FileWriter("D:/Arjun.properties")," Properties File Data ");  
            System.out.println("File created successfully");
	}  
	}
