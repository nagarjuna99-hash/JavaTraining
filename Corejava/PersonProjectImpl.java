interface Project{

int a=10;
  
public void loginPage();
public void creationPage();// public abstract void creationPage()

}

abstract class ProjectImplExp implements Project{

public void loginPage(){
System.out.println("login impl");

}

}

class PersonProjectImpl extends ProjectImplExp{

public void creationPage(){
System.out.println("creation impl");
}

public static void main(String[] args){

//Project p=new Project();

//ProjectImplExp pp=new ProjectImplExp();

PersonProjectImpl pc= new PersonProjectImpl();

pc.creationPage();
pc.loginPage();


}

}



