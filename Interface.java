public class Interface {
    public static void main(String[] args){
        King k = new King();
        k.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,bottom, Diagonal(in all 4 Direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,bottom)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,bottom , Diagonal(by 1 step)");
    }
}
