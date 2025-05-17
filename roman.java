import java.util.*;
class Roman{
    public static String intoToRoman(int num){
        String roman="";
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanletter={
            "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                roman=roman+romanletter[i];
                num=num-values[i];
            }
        }
        return roman;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Roman Numeral of Integer is:"+intoToRoman(num));
    }
}
