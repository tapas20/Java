import java.util.*;
import java.util.function.*;
import java.util.ArrayList;
// public class Java8Features {
//     public static void main(String[] args){

        

// //    @FunctionalInterface
// //     interface A{
// //         public void m1();
// //     }

// //    @FunctionalInterface
// //    interface B extends A{
// //    }



// //-------------------To check even or odd------------------

//         // Predicate<Integer> num = i -> i % 2 == 0;
//         // System.out.println(num.test(10));
//         // System.out.println(num.test(7));
// //--------------------To find Square root------------------

//         /*Function<Integer,Integer> sq =  i -> i*i;
//         System.out.println("The Square of 50 :"+ sq.apply(50));*///New method

//         // System.out.println("The square of 4 :"+squareIt(4));
//         // System.out.println("The square of 5 :"+squareIt(5));
//     }
//     // public static int squareIt(int n){
//     //     return n*n;
//     // }


    // public static void main(String[] args){
    //     // Demo d = new Demo();
    //     // d.m1();
    //     Interf i = () -> System.out.println("Hello...");
    //     i.m1();
    //     i.m1();
    //     i.m1();
    //     i.m1();
    // }
    
    // public static void main(String[] args){
    //     Interf i = (a, b) -> System.out.println("The Sum:"+(a+b));
    //     i.add(10, 20);
    // }
//     public static void main(String[] args){
//         interf i = n -> n*n;
//         System.out.println(i.squareIt(4));
//         System.out.println(i.squareIt(5));
//     }

// }
//     interface interf{
//         public int squareIt(int n);
//     }


// interface Interf{
//     public void m1();
// }
// class Demo implements Interf{
//     public void m1(){
//         System.out.println("Hello...!");
//     }
// }

    


// interface Interf{
//     public void add(int a, int b);
// }


// class Demo implements Interf{
//     public void add(int a, int b){
//         System.out.println("The Sum:"+(a+b));
//     }
// }

// class myRunnable implements Runnable{
//     public void run(){
//         for(int i = 0; i < 10; i++){
//             System.out.println("Child thread");
//         }
//     }
// }
//class MyComparator implements Comparator<Integer>{
    //public int compare(Integer I1, Integer I2){

        //return (I1 < I2) ? -1 : (I1 > I2) ? +1 : 0;

        // if(I1 < I2) {
        //     return -1;
        // }
        // else if(I1 > I2) {
        //     return +1;
        // }
        // else {
        //     return 0;
        // }
    //}
//}
//class Java8Features{
    // public static void main(String[] args){
    //     ArrayList<Integer> l = new ArrayList<>();
    //     l.add(20);
    //     l.add(10);
    //     l.add(25);
    //     l.add(5);
    //     l.add(0);
    //     l.add(15);
    //     System.out.println(l);
    //     Comparator<Integer> c = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? +1 : 0;
    //     Collections.sort(l, c);
    //     System.out.println(l);
    //     l.stream().forEach(System.out::println);
    //}
//     public static void main(String[] args){
//         // Employee e = new Employee("Tapas", 191);
        
//         ArrayList<Employee> l = new ArrayList<Employee>();
//         l.add(new Employee("Tapas", 191));
//         l.add(new Employee("Apu", 121));
//         l.add(new Employee("Jyoti", 111));
//         l.add(new Employee("Mohanta", 001));
//         l.add(new Employee("Sanju", 91));
//         System.out.println(l);
//         // Collections.sort(l, (e1, e2)->(e1.eno < e2.eno)?-1:(e1.eno > e2.eno)?1:0);
//         Collections.sort(l, (e1, e2)->e1.name.compareTo(e2.name));
//         System.out.println(l);
//     }

// }
// class Employee {
//     String name;
//     int eno;
//     Employee(String name, int eno){
//         this.name = name;
//         this.eno = eno;
//     }
//     public String toString(){
//         return eno+":"+name;
//     }
// }


// interface I {
//     // public void m1();
//     // public void m2();
//     // public void m3();
//     default void m1(){
//         System.out.println("Default Method");
//     }
//     // default int hashCode(){

//     // }
// }
// class Java8Features implements I{
//     // public void m1() {
//     //     System.out.println("Overriding version version of default method");
//     // }
//     // // public void m2() {}
//     // public static void main(String[] args){
//     //     Java8Features t = new Java8Features();
//     //     t.m1();
//     // }
// }

// class Java8Features1 implements I{
//     public void m1() {}
//     public void m2() {}
// }
// class Java8Features2 implements I{
//     public void m1() {}
//     public void m2() {}
// }
// class Java8Features50 implements I{
//     public void m1() {}
//     public void m2() {}
// }
// class Java8Features100 implements I{
//     public void m1() {}
//     public void m2() {}
// }

// interface Left {
//     default void m1() {
//         System.out.println("Left Interface m1 method");
//     }
// }
// interface Right {
//     default void m1() {
//         System.out.println("Right Interface m1 method");
//     }
// }
// class Java8Features implements Left, Right{
//     public void m1(){
//         // System.out.println("Our own m1 method");
//         // Left.super.m1();
//         Right.super.m1();
//     }
//     public static void main(String[] args){
//         Java8Features t  = new Java8Features();
//         t.m1();
//     }
// }


// interface Interf {
//     public static void m1() {
//         System.out.println("Interface static method");
//     }
// }
// class Java8Features {
//      public static void main(String[] args){
//         Interf.m1();
//         // m1();
//         // Test.m1();
//         // Test t = new Test();
//         // t.m1();
//      }
// }

// interface Interf {
//     public static void main(String[] args) {
//         System.out.println("Interface main method");
//     }
// }

// class Java8Features{
//     public static void main(String[] args){
//         Predicate<Integer> p1 = i->i%2==0;
//         System.out.println(p1.test(10));
//         System.out.println(p1.test(15));
//     }
// }

// class Java8Features {
//     public static void main(String[] args){
//         String[] s = {"Tapas", "Tapu", "Jacky", "Sanjay", "Jyoti"};
//         Predicate<String> p = str->str.length()%2==0;
//         for(String s1:s){
//             if(p.test(s1)){
//                 System.out.println(s1);
//             }
//         }
//     }
// }

// class Employee {
//     String name;
//     double salary;
//     Employee(String name, double salary){
//         this.name = name;
//         this.salary = salary;
//     }
// }
// class Java8Features {
//     public static void main(String[] args) {
//         ArrayList<Employee> l = new ArrayList<>();
//         l.add(new Employee("Tapas", 1000));
//         l.add(new Employee("jacky", 2000));
//         l.add(new Employee("adi", 3000));
//         l.add(new Employee("sanjay", 4000));
//         l.add(new Employee("rajat", 5000));

//         Predicate<Employee> p = e->e.salary>3000;
//         for(Employee e1 : l){
//             if(p.test(e1)){
//                 System.out.println(e1.name+":"+e1.salary);
//             }
//         }
//     }
// }

// class Java8Features {
//     public static void main(String[] args) {
//         Function<Integer, Integer> f = i->i*i;
//         System.out.println(f.apply(4));
//     }
// }


// class Java8Features {
//     public static void main(String[] args) {
//         Function<String, Integer> f = s->s.length();
//         System.out.println(f.apply("Tapas Jyoti Mohanta"));
//     }
// }

// class Java8Features {
//     public static void main(String[] args) {
//         Function<String, String> f = s->s.toUpperCase();
//         System.out.println(f.apply("Tapas Jyoti Mohanta"));
//     }
// }


// class Student {
//     String name;
//     int marks;
//     Student(String name, int marks){
//         this.name = name;
//         this.marks = marks;
//     } 
// }
// class Java8Features {
//     public static void main(String[] args){
//         Function<Student, String> f = s->{
//             int marks = s.marks;
//             String grade = "";
//             if(marks >= 80) grade = "A";
//             else if(marks >= 60) grade = "B";
//             else if(marks >= 50) grade = "c";
//             else if(marks >= 35) grade = "D";
//             else grade = "E(Failed)";
//             return grade;
//         };
//         Predicate<Student> p = s->s.marks >= 60;

//         Student[] s = { new Student("Tapas", 99),
//         new Student("Jyoti", 62),
//         new Student("Mohanta", 55),
//         new Student("Mr", 40),
//         new Student("Adarsh", 25),
//         };
//         for(Student s1 : s){
//             if(p.test(s1)){
//                 System.out.println("Student Name:"+s1.name);
//                 System.out.println("Student Marks:"+s1.marks);
//                 System.out.println("Student Grade:"+f.apply(s1));
//                 System.out.println("");
//             }
//         }
//     }
// }

// class Java8Features {
//     public static void main(String[] args){
//         Function<Integer, Integer> f1 = i->2*i;
//         Function<Integer, Integer> f2 = i->i*i*i;
//         System.out.println(f1.andThen(f2).apply(2));
//         System.out.println(f1.compose(f2).apply(2));
//     }
// }

// import java.util.Date;
// class Java8Features{
//     public static void main(String[] args){
//         Supplier<Date> s = ()-> new Date();
//         System.out.println(s.get());
//         System.out.println(s.get());
//         System.out.println(s.get());
//     }
// }

// class Java8Features{
//     public static void main(String[] args){
//         Supplier<String> s = ()->{
//             String OTP = "";
//             for(int i=0; i<6; i++){
//                 OTP += (int)(Math.random()*10);
//             }
//             return OTP;
//         };
//         System.out.println(s.get());
//         System.out.println(s.get());
//         System.out.println(s.get());
//         System.out.println(s.get());
//     }
// }


// class Java8Features{
//     public static void main(String[] args){
//         BiPredicate<Integer, Integer> p = (a, b)->(a+b) % 2==0;
//         System.out.println(p.test(10, 20));
//         System.out.println(p.test(15, 20));
//     }
// }


// class Employee{
//     int eno;
//     String name;
//     Employee(int eno, String name){
//         this.eno = eno;
//         this.name = name;
//     }
// }
// class Test{
//     public static void main(String[] args){
//         ArrayList<Employee> l = new ArrayList<>();
//         BiFunction<Integer, String, Employee> f = (eno, name)-> new Employee(eno, name);
//         l.add(f.apply(100, "Tapas"));
//         l.add(f.apply(200, "Tapas"));
//         l.add(f.apply(300, "Tapas"));
//         l.add(f.apply(400, "Tapas"));
//         for(Employee e : l){
//             System.out.println("Employee Number:"+e.eno);
//             System.out.println("Employee Name:"+e.name);
//             System.out.println();
//         }
//     }
// }



// class Employee {
//     String name;
//     double salary;
//     Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//     }
// }
// class Java8Features {
//     public static void main(String[] args) {
//         ArrayList<Employee> l = new ArrayList<Employee>();
//         populate(l);
//         BiConsumer<Employee, Double> c = (e, d)->e.salary = e.salary+d;
//         for(Employee e:l){
//             c.accept(e,500.0);
//         }
//         for(Employee e:l){
//             System.out.println("Employee Name:"+e.name);
//             System.out.println("Employee Salary:"+e.salary);
//             System.out.println();
//         }
        
//     }
//     public static void populate(ArrayList<Employee> l){
//         l.add(new Employee("Tapas", 1000));
//         l.add(new Employee("Hari", 2000));
//         l.add(new Employee("Nata", 3000));
//         l.add(new Employee("Jata", 4000));
//     }
// }

// class Java8Features{
//     public static void main(String[] args){
//         IntUnaryOperator f = i -> i*i;
//         System.out.println(f.applyAsInt(6));
//     }
// }


class Java8Features{
    public static void main(String[] args){
        IntBinaryOperator b = (i1,i2) -> (i1*i2);
        System.out.println(b.applyAsInt(10,20));
    }
}