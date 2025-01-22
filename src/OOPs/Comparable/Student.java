package OOPs.Comparable;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student(int roll_no,float marks){
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
