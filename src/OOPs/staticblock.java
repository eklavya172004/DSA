package OOPs;

public class staticblock {
    static int a = 5;
    static int b = 6;

    static {
        System.out.println("I am in the static block");
        b = b *4;
    }

    public static void main(String[] args) {
        System.out.println(staticblock.a + " " + staticblock.b);

        staticblock.a +=10;
        staticblock.b += 20;

        System.out.println(staticblock.a+ " " + staticblock.b);
    }
}
