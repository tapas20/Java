public class Abstractclass {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.eat();
        t.walk();
        System.out.println(t.color);

        Hen h = new Hen();
        h.eat();
        h.walk();
        // Animal a=new Animal();----------------Error-----------------

        Leo l=new Leo();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called.");
    }
    void eat(){
        System.out.println("Animal can eat!");
    }
    abstract void walk();
}
class Tiger extends Animal{
    Tiger(){
        System.out.println("Tiger constructor called .");
    }
    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Walk in 4 legs.");
    }
}
class Leo extends Tiger{
    Leo(){
        System.out.println("Leo constructor called.");
    }
}
class Hen extends Animal{
    void changeColor(){
        color="White";
    }
    void walk(){
        System.out.println("Walk in 2 legs.");
    }
}
