package StringBuffer;

import Trees.SegmentTrees;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor 2
        StringBuffer sb2 = new StringBuffer("eklavya");

        //constructor 3
        StringBuffer sb3 = new StringBuffer(23);

        sb.append("hello");
        sb.insert(2," very nice ");
        sb.delete(1,10);
        System.out.println(sb);

        //this will generate an random strong of size => size
        int n = 10;
        String name = RandomString.generate(n);
        System.out.println(name);

        //remove widespaces
        String sentence = " Hi I am Very Happy For You ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s",""));

        //split the array
        String arr = "Ekavya Nath studies";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off

    }
}
