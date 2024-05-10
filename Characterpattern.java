public class Characterpattern {
    public static void main(String[] args){
        int n=4;
        char ch='A';
        
        //outer loop
        for(int line=1;line<=4;line++){
            //inner loop
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
