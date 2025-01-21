package OOPs;

import java.util.Arrays;

public class day_1 {
    public static void main(String[] args) {
        Student[] first = new Student[3];
//        System.out.print(Arrays.toString(first));
        Student rahul  = new Student("rahul",23,23.21f);
        System.out.println(rahul.name);
        rahul.changeName("Krish");
        System.out.println(rahul.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void changeName(String name){
        this.name = name;
    }

    Student(String name,int rno,float marks){
        this.name = name;
        this.marks = marks;
        this.rno = rno;
    }
}
