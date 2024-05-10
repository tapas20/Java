public class ReverseArray {
    public static void Array_Reverse(int[] number){
        int first=0 , last=number.length-1;
        while(first < last){
            int temp=number[first];
            number[first]=number[last];
            number[last]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int num[]={2,4,6,8,10};
        Array_Reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
