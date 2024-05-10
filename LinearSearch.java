public class LinearSearch {
    public static int Linear_search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[]={2,14,16,20,10,5,8,9};
        int key=10;
        int index=Linear_search(num,key);
        if(index==-1){
            System.out.print("Not found");
        }else{
            System.out.println("Index number is :"+index);
        }
    }
}
