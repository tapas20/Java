public class PrintSubArray {
    public static void Sub_Array(int[] num){
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum= start==0 ? prefix[start] : prefix[end]-prefix[start-1];
                if(MaxSum<currSum){
                    MaxSum=currSum;
                }
            }
        }
       System.out.println("The Maximum Sum is : "+MaxSum);
    }
    public static void main(String[] args){
        int num[]={1,-2,6,-1,3};
        Sub_Array(num);
    }
}
