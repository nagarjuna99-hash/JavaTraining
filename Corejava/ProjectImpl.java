interface Project{

int a=10;
  
public void loginPage();
public void creationPage();

}

abstract class ProjectImpl implements Project{

public void loginPage(){
System.out.println("loginPage");

}
}
