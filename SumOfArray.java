public class SumOfArray {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        int sum=0;

        //First Approach

        /*for(int i=0;i<=a.length-1;i++){   //a.length-1=5-1=4
            sum=sum+a[i];
        }*/

        //Second Approach----(Enhanced Forloop)

        for(int value:a){
            sum=sum+value;
        }


        System.out.println("The sum of Array Elements is:"+sum);
    }
}
