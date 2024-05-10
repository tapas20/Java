public class SuperiorElements {
    public static void Superior_Elements(int a[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>maxi){
                maxi=a[i];
                System.out.println(maxi);
            }
        }
        
    }
    public static void main(String[] args){
        int a[]={10,20,12,3,0,6};
        Superior_Elements(a);
    }
}
