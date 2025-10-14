package Oops.basics;
class Student{
    public int rollno;
   public String name;
    public String course;
    public int m1,m2,m3;
    public  Student(){
        System.out.println("I am from default constructor");
    }
    public  Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
//        this.m1=m1;
//        this.m2=m2;
//        this.m3=m3;

    }

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }else{
            return 'B';
        }
    }
    public String toString(){
        return "Roll No: "+rollno+"\n" +"Name: "+name+"\n"+"Course: "+course+"\n";
    }



}

public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.rollno=1;
        s.name="Jahn";
        s.course="cse";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.average());
        System.out.println("Details: "+s);
        System.out.println("GRade: "+s.grade());
        Student s1=new Student(2,"Rockey","dbms");
        s1.m1=70;
        s1.m2=80;
        s1.m3=65;


        System.out.println("Total: "+s1.total());
        System.out.println("Average: "+s1.average());
        System.out.println("Details: "+s1);
        System.out.println("GRade: "+s1.grade());

    }
}
