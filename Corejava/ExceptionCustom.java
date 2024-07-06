class ToYoungException extends RuntimeException{

ToYoungException(String s){
super(s);
}

}

class ToOldException extends RuntimeException{

ToOldException(String s){
super(s);
}

}

class ExceptionCustom{
public static void main(String[] args){
int age=Integer.parseInt(args[0]);
if(age > 60){
throw new ToOldException(" age is already crossed you are not eligable to get term insurance");
}
else if(age < 18){
throw new ToYoungException(" please wait some more time age is less then 18 to get term insurance");
}
else{
System.out.println("you will get term insuracne opening details in mail");
}
}
}



