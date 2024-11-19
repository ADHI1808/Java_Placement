import java.util.Scanner;
import java.io.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String a,rev="";
    char temp;
    System.out.println("Enter String");
    a=s.nextLine();
    for(int i=0;i<a.length();i++){
        temp=a.charAt(i);
        rev=temp+rev; //since we need to add char in front of each other 
                      //i.e let a="ADHI",rev="" each "loop-rev=temp+rev" 
                      //loop1-temp=A & rev=A+"",loop2-temp=D & rev=D+A,loop3- temp=H & H+DA,loop4-temp=I & rev=I+HDA
    }
    System.out.println("Reverse:"+rev);
    }
}
