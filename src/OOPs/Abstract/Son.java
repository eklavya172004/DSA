package OOPs.Abstract;

public class Son extends Abstract{
//    int age;
    public Son(int age) {
        super(age);
    }

//    @Override
//    void normal(int age) {
//        super.normal();
//    }

    @Override
    void normal() {
//        System.out.print();
    super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to career! ");
    }

    @Override
    void partner(String name) {
        System.out.println("hello "+name);
    }
}
