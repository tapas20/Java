public class Swapping2Number {
    public static void main(String[] args){



        int a=10,b=20;
        System.out.println("Before swapping the values:"+a+"  "+b);

        //Logic-1-Third variable


        /*int t=a;
        a=b;
        b=t;*/

        //Logic-2-Using + & - Operator

        /*a=a+b;      //10+20=30
        b=a-b;      //30-20=10
        a=a-b;      //30-10=20*/

        //Logic-3-Using * & / Operator
        // a and b value should not be zero.

        /*a=a*b;       //10*20=200
        b=a/b;          //200/20=10
        a=a/b;  */      //200/10=20               

        //Logic-4- Using Bitwise XOR(^) Operator

        /*a=a^b;      //10^20=30  
        b=a^b;      //30^20=10
        a=a^b;*/      //30^10=20

        //Logic-5- Single Statement
        //a=10,b=20

        /*b=a+b-(a=b); */


        System.out.println("After swapping the values:"+a+"  "+b);
    }
    
}
