public class InvertedandrotateHfLetters {
    public static void Inverted_Letters(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Inverted_Letters(6);
    } 
}
