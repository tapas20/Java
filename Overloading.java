public class Overloading {
    public static void main(String[] args){
        Calculator cls=new Calculator();
        System.out.println(cls.sum(2, 4));
        System.out.println(cls.sum(2.5f, 4.6f));
        System.out.println(cls.sum(2, 4,6));
    }
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a+b+c;
    }
}
