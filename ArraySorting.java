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
        int temp=0;
        System.out.println("Array with Unsorted length: "+num.length+" is below");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]>num[j]){ //for decending order---num[i]<num[j]
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Array with sorted length: "+num.length+" is below");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
