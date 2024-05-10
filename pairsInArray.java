public class pairsInArray {
    public static void Array_pairs(int num[]){
        for(int i=0;i<num.length;i++){
            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+current+" ,"+num[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int number[]={2,4,6,8,10};
        Array_pairs(number);
    }
}
