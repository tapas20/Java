public class StringCompression {
    public static String String_Compression(String str){
        // String s="";
        // for(int i=0;i<str.length();i++){
        //     int count=1;
        //     while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     s += str.charAt(i);
        //     if(count > 1){
        //         s += count;
        //     }
        // }
        // return s;

        StringBuilder s=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if(count > 1){
                s.append(count);
            }
        }
        return s.toString();
    }
    public static void main(String[] args){
        String str="aaaabbbbcccdd";
        System.out.println(String_Compression(str));
    }
}
