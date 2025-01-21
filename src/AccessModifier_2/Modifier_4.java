package AccessModifier_2;

import AccessModifier.Modifier;
import AccessModifier.Modifier_2;

public class Modifier_4 extends Modifier {
//    Modifier obj = new Modifier(); so here only public can access the modifier and not the protected for protected it to access the method we need to extend the modifier


    public void execute(){
        this.display();
    }

    void display2(){
        System.out.print("Hello different package");
    }

}
