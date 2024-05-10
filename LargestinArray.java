public class LargestinArray {
    public static int get_Largest(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("The smallest Number is : "+smallest);

        return largest;
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,1,7,9,3};
        int large=get_Largest(numbers);
        System.out.println("The largest Number is : "+large);
    }
}
