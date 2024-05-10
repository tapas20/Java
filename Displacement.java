import java.util.*;
public class Displacement {
    public static float getShortestPath(String path){
        int x=0 , y=0 ;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //North
            if(dir=='N'){
                y++;
            }
            //South
            else if(dir=='S'){
                y--;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path :) ");   // In capital letter for EX---- E,W,N,S
        String path=sc.next();
        System.out.println(getShortestPath(path));
    }
}
