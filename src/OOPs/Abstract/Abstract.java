package OOPs.Abstract;

public abstract class Abstract {
    int age;

    public Abstract(int age){
        this.age = age;
//        this.dsas = dsas;
    }

    void normal(){
        System.out.print("this is a normal! ");
    }

//    public abstract void normal(int age);

    abstract void career();
    abstract void partner(String name);
}
