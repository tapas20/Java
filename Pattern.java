public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
