import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,temp,rem=0,sum=0,rev=0;
        System.out.println("Enter numbers");
        a=s.nextInt();
        temp=a;
        while(temp>0){
            rev=(rev*10)+(temp%10); //TO reverse and palindrom
            rem=temp%10; //To sum
            temp=temp/10;
            sum=sum+rem;
        }
        System.out.println("sum of numbers:"+sum);
        System.out.println("Reverse of numbers:"+rev);
        if(rev==a){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Palindrom");
        }
    }
}
