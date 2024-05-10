public class Getithbit {
    public static void getIthbit(int n , int i){
        int BitMask = 1<<i;
        if((n & BitMask)==0){
            System.out.println("The number is at index : "+i+" is : "+"0");
        }else{
            System.out.println("The number is at index : "+i+" is : "+"1");
        }
    }
    public static void main(String[] args){
        getIthbit(15, 2);
        getIthbit(5 , 3);
        getIthbit(7 , 1);
    }
}
