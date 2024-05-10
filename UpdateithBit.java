public class UpdateithBit {
    public static void getIthbit(int n , int i){
        int BitMask = 1<<i;
        if((n & BitMask)==0){
            System.out.println("The number is at index : "+i+" is : "+"0");
        }else{
            System.out.println("The number is at index : "+i+" is : "+"1");
        }
    }

    public static int SetIthbit(int n , int i){
        int bitMask=1<<i;
        return n | bitMask;
    }


    public static int Clearithbit(int n,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return Clearithbit(n, i);
        // }else{
        //     return SetIthbit(n, i);
        // }
        n=Clearithbit(n, i);
        int BitMask=newBit<<i;
        return n | BitMask;
    }
    public static void main(String[] args){
        System.out.println(updateIthBit(10,2, 1));
    } 
}
