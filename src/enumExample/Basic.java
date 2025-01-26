package enumExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        Week(){
            System.out.println("Constructor called for "+this);
        }
    //All the enum constants (Monday, Tuesday, Wednesday, ...) are already initialized during the class loading phase, which triggers the constructor calls for each of them.
        //this is not public or protected , only private or default
        //why? we don't want to create new objects
        //this is not the enum concept that's why

        //enum can implements as many interfaces as we wants but it cannot extends classes

        //internally : public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week = Week.Monday;

//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
    }
}
