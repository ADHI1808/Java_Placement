import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=s.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
        System.out.println("Enter value for Index "+i);
            num[i]=s.nextInt();
            
        }
        System.out.println("Array with length:"+num.length+" is below");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
