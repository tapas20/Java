public class SumusingOvl {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("The sum of two number is : "+sum(10,20));
        System.out.println("The sum of three number is : "+sum(10,20,30));
        System.out.println("The sum of two float value is : "+sum(12.4f,8.5f));
    }
}
