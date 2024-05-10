public class StaticKeyword {
    public static void main(String[] args){
        Student s1=new Student();
        s1.schoolname="jnv";
        Student s2=new Student();
        System.out.println(s2.schoolname);
    }
}
class Student{
    int returnpercentage(int math,int phy,int cem){
        return(math+phy+cem)/3;
    }
    String name;
    int rollno;
    static String schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
