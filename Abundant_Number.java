import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,sum=0;
        System.out.println("Enter Number");
        a=s.nextInt();
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum>a){
            System.out.println("Yes Abundunt Number");//also known as Exclusive Number
        }
        else{
            System.out.println("Not a Abundunt Number");
        }
        s.close();
    }
}
