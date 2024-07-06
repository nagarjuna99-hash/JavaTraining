interface Project{

int a=10;
  
public void loginPage();
public void creationPage();// public abstract void creationPage()

}

abstract class ProjectImplExp implements Project{

public void loginPage(){
// login page impl
}

}

class PersonProjectImpl implements Project{

public void creationPage(){}
// creation impl
}
