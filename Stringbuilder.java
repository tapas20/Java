import java.util.*;
public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tapas");

        //Char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);


        //Insert a Character
        sb.insert(0,'B');
        System.out.println(sb);

        //Delete a Character
        sb.delete(1,2);
        System.out.println(sb);


        //append(add in the last) a letter
        StringBuilder sb1=new StringBuilder("H");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
