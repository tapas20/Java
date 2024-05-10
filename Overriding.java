public class Overriding {
    public static void main(String[] args){
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat any things!");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass!");
    }
}
