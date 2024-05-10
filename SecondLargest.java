public class SecondLargest {
    public static int Second_largest(int[] a){
        int Max1=0 ,Max2=0;
        if(a[0]>a[1]){
            Max1=a[0];
            Max2=a[1];
        }else{
            Max1=a[1];
            Max2=a[0];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]>Max1){
                Max2=Max1;
                Max1=a[i];
            }
            else if(a[i]>Max2){
                Max2=a[i];
            }
        }
        return Max2;
    }
    public static void main(String[] args){
        int num[]={10,46,21,55,32,99,67};
        System.out.println(Second_largest(num));
    }
}
