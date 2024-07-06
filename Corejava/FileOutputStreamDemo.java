import java.io.*;


class FileOutputStreamDemo{

public static void main(String[] args)throws IOException{

File file = new File("D:/balaji.jpg");      // img.jpg can be any image file
      
FileInputStream in = new FileInputStream(file);
      
long size = file.length();
      
byte[] temp = new byte[(int)size];
      
in.read(temp);
      
in.close();
     
// The img.jpg image data will be written in a new image File named "output.jpg"
      
DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("D:/output.jpg"))));
      
dos.write(temp);
      
dos.close();



}
}