public class ReverseString {
    public static void main(String[] args){

        //1. Using +(String concatenation) operator

        String s="Tapas";
        String rev="";
        /* 
        int length=s.length(); //5
        for(int i=length-1;i>=0;i--){  //4 3 2 1 0
            rev=rev+s.charAt(i);// s a p a T
        }
        System.out.println("Reverse String is:"+rev);*/

        //2. Using character arrray

        /*char a[]=s.toCharArray();
        int length=a.length; //4
        for(int i=length-1;i>=0;i--){ // 3 2 1 0
            rev=rev+a[i];  //s a p a T
        }
        System.out.println("Reverse String:"+rev);*/

        //3. Using String Buffer class
        
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
