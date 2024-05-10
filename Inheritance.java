public class Inheritance {
    public static void main(String[] args){
        peacock p=new peacock();
        p.eat();
        human h = new human();
        h.eat();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void Fly(){
        System.out.println("Fly");
    }
}
class Tuna extends Fish{
    int teeth;
}
class shark extends Fish{
    float size;
}
class peacock extends Bird{
    void dance(){

    }
}
class Dog extends Mammal{
    String breed;
}
class human extends Mammal{
    String leg;
}
class cat extends Mammal{
    String name;
}









// class Fish extends Animal{
//     int respirations;

//     void swim(){
//         System.out.println("Swims");
//     }
// }
