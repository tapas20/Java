public class SetIthBit {
    public static int SetIthbit(int n , int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String[] args){
        System.out.println(SetIthbit(10, 2));
    }
}
