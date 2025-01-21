package OOPs;

public class day_2_file2 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

            public day_2_file2(int age, String name, int salary, boolean married){
                this.age = age;;
                this.name = name;
                this.salary = salary;
                this.married = married;
                day_2_file2.population += 1;
            }
}
