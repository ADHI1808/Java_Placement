import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0,x;
        System.out.println("Enter value");
        x=s.nextInt();
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                sum+=i;
            }else{
                continue;
            }
        }
        System.out.println(x==sum?"It is a Perfect Number":"Not a Perfect Number");
    }
}
