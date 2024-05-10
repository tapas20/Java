public class MultipleInheritance {
    public static void main(String[] args){
        Beer br=new Beer();
        br.eatgrass();
        br.eatmeat();
    }
}
interface Herbivour{
    void eatgrass();
}
interface Carnivour{
    void eatmeat();
}
class Beer implements Herbivour,Carnivour{
    public void eatgrass(){
        System.out.println("Beer can eat grass.");
    }
    public void eatmeat(){
        System.out.println("Beer can eat meat.");
    }
}

