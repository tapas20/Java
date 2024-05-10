import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");

        int num=sc.nextInt();


    //1.  Using algorithim

        /*int rev=0,rem;
        while(num>0){           //or//num!=0
            rem=num%10;
            rev=rev*10+rem;         // or //rev=rev*10+num%10;
            num=num/10;
        }*/

    //2. Using StringBuffer classes
    
        /*StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();*/


    //3. Using StringBuilder class
    
    
    StringBuilder sbl=new StringBuilder();
    sbl.append(num);
    StringBuilder rev=sbl.reverse();
        
        System.out.println("Reverse number is:"+rev);
    }
}