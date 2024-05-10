public class Oops {
    public static void main(String[] args){
        // Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Red");
        // System.out.println(p1.getColor());

        // BankAccount acc=new BankAccount();
        // acc.UserName="Tapas";
        // acc.setPassword("abcdefghijkl");
        // Student s1=new Student();
        // System.out.println(s1.name);
        // Student s2=new Student("Tapas");
        // Student s3=new Student(191);
        // Student s4=new Student("Tapu",13);
        Student s1=new Student();
        // s1.name="Tapas";
        // s1.roll=191;
        // s1.Password="mnp";
        // Student s2=new Student(s1);
        // s2.Password="xyz";
        s1.name="Tapas";
        s1.roll=456;
        s1.Password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);//copy
        s2.Password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

    class Student{
        String name;
        int roll;
        String Password;
        int marks[];
        // Shallow copy Constructor
        // Student(Student s1){
        //     marks=new int[3];
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }
        //Deep copy constructor
            Student(Student s1){
                marks=new int[3];
                this.name=s1.name;
                this.roll=s1.roll;
                for(int i=0;i<marks.length;i++){
                    this.marks[i]=s1.marks[i];
                }
            }



        Student(){
            // this.name=name;
            marks=new int[3];
            System.out.println("Constructor is called....");
        }
        Student(String name){
            marks=new int[3];
            this.name=name;
        }
        Student(int roll){
            marks=new int[3];
            this.roll=roll;
        }
    }
// class BankAccount{
//     public String UserName;
//     private String Password;
//     void setPassword(String pwd){
//         Password=pwd;
//         System.out.println(Password);
//     }
// }
// class Pen{
//     //properties
//     private String Color;
//     private int tip;

//     String getColor(){
//         return this.Color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     //function
//     void setColor(String newColor){
//         this.Color=newColor;
//     }
//     void setTip(int tip){
//         this.tip=tip;
//     }
// }
