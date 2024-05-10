public class SelectionSort {
    public static void Selection_Sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[index]){
                    index=j;
                }
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={7,8,5,4,6,2,1,3,9};
        Selection_Sort(arr);
    }
}
