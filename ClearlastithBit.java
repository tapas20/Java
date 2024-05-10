public class ClearlastithBit {
    public static int ClearlastIthBit(int n,int i){
        int bitMask=(~0<<i);
        return n & bitMask;
    }
    public static void main(String[] args){
        System.out.println(ClearlastIthBit(15, 2));
    }
}
