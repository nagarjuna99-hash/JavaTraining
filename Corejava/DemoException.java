class ToYoungException  extends RuntimeException{

public ToYoungException(String s){ 
super(s);
}
}

class ToOldException  extends RuntimeException{

public ToOldException(String s){ 
super(s);
}
}


class CustomExceptionDemo{

public static void main(String[] args){

int age=Integer.parseInt(args[0]);


if(age < 18){ 

throw new ToYoungException("your not eligable age is less then 18");


}else if(age > 60){

throw new ToOldException("your not eligable age is crossed more then 60");

}else{

System.out.println("your eligable details will share in mail");
}

}
}
