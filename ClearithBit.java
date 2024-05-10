public class ClearithBit {
    public static int Clearwithbit(int n,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }
    public static void main(String[] args){
        System.out.println(Clearwithbit(10, 1));
    }
}
