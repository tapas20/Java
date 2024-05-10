public class SubString {
    public static String Print_Substring(String str, int si , int ei){
        String substr="";
        for(int i=si;i<ei;i++){
           substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str="TapasJyoti";
        System.out.println(Print_Substring(str, 0, 10));
        
        // System.out.println(str.substring(0,10));  // <---------------This is the Direct Metod.-------------->
    }
}
