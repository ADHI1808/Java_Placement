import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=s.nextInt();
        System.out.println(harshad(a)?"Its a Harshad/Joy/Niven Number":"Not a Harshad/Joy/Niven Number");
    }
    public static boolean harshad(int a){
        int temp,sum=0,rem;
        temp=a;
        while(temp>0){
            rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        if(a%sum!=0){
            return false;
        }
        return true;
    }
}
