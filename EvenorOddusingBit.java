public class EvenorOddusingBit {
    public static void EvenorOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even number
            System.out.println("Even number");
        }else{
            //odd number
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args){
        EvenorOdd(5);
        EvenorOdd(12);
        EvenorOdd(15);
    }
}
