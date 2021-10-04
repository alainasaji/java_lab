import java.io.*;
public class Read
{
public static void main(String args[])throws Exception
{
FileOutputStream fout=new FileOutputStream("demo.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeUTF("hey iam alaina");
FileInputStream fin=new FileInputStream("demo.txt");
DataInputStream dis=new DataInputStream (fin);
String str=dis.readUTF();
System.out.println(str);
}}