public class BinomialCoff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int Binocoff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int bcoff=n_fact/(r_fact*nmr_fact);
        return bcoff;
    }
    public static void main(String[] args){
        System.out.println(Binocoff(5,2));
    }
}
