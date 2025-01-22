package OOPs.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,23.2f);
        Student rahul = new Student(232,334.3f);
        Student rohit = new Student(12,23.2f);
        Student shaam = new Student(2,3.3f);
        Student krish = new Student(1232,123.2f);
        Student abhiram = new Student(232,3343.3f);

        Student[] student = {krish,kunal,rahul,rohit,shaam,abhiram};

//        Arrays.sort(student);

//        Arrays.sort(student, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(student,(o1,o2) -> (int)(o1.marks - o2.marks));

        System.out.print(Arrays.toString(student));
    }
}
