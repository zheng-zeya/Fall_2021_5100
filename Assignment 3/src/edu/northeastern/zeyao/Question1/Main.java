package edu.northeastern.zeyao.Question1;

import edu.northeastern.zeyao.Question1.HappyObject;
import edu.northeastern.zeyao.Question1.MoodyObject;
import edu.northeastern.zeyao.Question1.Psychiatrist;
import edu.northeastern.zeyao.Question1.SadObject;

public class Main {

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        MoodyObject moodyObject1 = new HappyObject();
        MoodyObject moodyObject2 = new SadObject();

        psychiatrist.examine(moodyObject1);
        System.out.println();
        psychiatrist.observe(moodyObject1);
        System.out.println();
        psychiatrist.examine(moodyObject2);
        System.out.println();
        psychiatrist.observe(moodyObject2);


    }
}
