public class BinarySearch {
    public static int Binary_search(int num[],int key){
        int start=0 , end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14,16,18};
        int key=16;
        int position=Binary_search(numbers, key);
        System.out.println("The number is located at : "+position);
    }
}
