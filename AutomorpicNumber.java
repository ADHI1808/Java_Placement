import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, sq;
        System.out.println("Enter Number");
        a = s.nextInt();
        sq = a * a;
        boolean isAutomorphic = true;
        while (a > 0) {
            if (a % 10 != sq % 10) {
                isAutomorphic = false; // if 1st digit itself doesn't match then
                //Mark as not Automorphic and ends  the loop
                break;
            }
            a /= 10; //if 2digit number then after checking 2 number
            //it will became 0,hence loop will end
            //ex for a=25,it will check 5 then comes ro 2 if its ture,then further
            //if 2 matches then 2/10=0 since while(a>0) loop will end 
            sq /= 10;
        }

        if (isAutomorphic) {
            System.out.println("Yes, Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
//OR
//Scanner s = new Scanner(System.in);
//int a, sq;
//String num,last;
//System.out.println("Enter Number");
//a = s.nextInt();
//sq = a * a;
//num=Integer.toString(a);
//last=Integer.toString(sq);
//System.out.println(last.endsWith(num)?"Automorpic":"Not Automorpic");
        s.close();
    }
}
