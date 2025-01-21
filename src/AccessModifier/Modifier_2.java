package AccessModifier;

public class Modifier_2 {
//    public class Modifier_2 extends Modifier{
    Modifier obj = new Modifier();

    public void execute(){
        obj.display();
    }

    public static void main(String[] args) {
        Modifier_2 modifier2 = new Modifier_2();
        modifier2.execute();
    }

}

