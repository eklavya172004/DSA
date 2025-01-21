package AccessModifier_2;

import AccessModifier.Modifier;
//import AccessModifier_2.Modifier_4;
import AccessModifier.Modifier_2;

public class Modifier_5 extends Modifier_4{
//    Modifier obj = new Modifier();

     public void execute(){
         //can access superclass usng an subclass instance and can access directly too using the this.display()
        Modifier_5 obj = new Modifier_5();
        obj.display();
//         this.display();
     }

    public static void main(String[] args) {
        Modifier_5 instance = new Modifier_5();
        instance.execute();
    }
}
