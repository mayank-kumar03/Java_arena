package Oops.basics;

class Subject{
   private int subid;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public Subject(int subid,String name,int maxMarks,int marksObtain){
        this.subid=subid;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }
    boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }

    public String toString(){
        return "Subid: "+subid+"\n"+"Name: "+name+"\n"+"MaxMarks: "+maxMarks+"\n"+"marksObtain: "+marksObtain;

    }

}

class Scholler{
   public  int rollno;
    public String name;
    public String deptname;
   public Subject [] subjects;
    public Scholler(int rollno,String name,String deptname,Subject[] subjects){
        this.rollno=rollno;
        this.name=name;
        this.subjects=subjects;
        this.deptname=deptname;
    }
    public int getTotalMarks() {
        int total = 0;
        for (Subject s : subjects) {
            total += s.getMarksObtain();
        }
        return total;
    }

    public double getAverageMarks() {
        return (double) getTotalMarks() / subjects.length;
    }

    public String toString() {
        String result = "Roll No: " + rollno +
                "\nName: " + name +
                "\nDepartment: " + deptname +
                "\n----------------------------\n";
        for (Subject s : subjects) {
            result += s.toString() + "\n----------------------------\n";
        }
        result += "Total Marks: " + getTotalMarks() +
                "\nAverage Marks: " + String.format("%.2f", getAverageMarks());
        return result;
    }
}

public class Pra1 {
    public static void main(String[] args) {
        Subject[]  subjects=new Subject[3];
        subjects[0] = new Subject(101, "Mathematics", 100, 85);
        subjects[1] = new Subject(102, "Physics", 100, 78);
        subjects[2] = new Subject(103, "Chemistry", 100, 66);
        Scholler st=new Scholler(102,"Mayank Kumar","CS-Ai",subjects);
        System.out.println(st);

    }

}
