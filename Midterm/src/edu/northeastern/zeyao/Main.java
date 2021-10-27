package edu.northeastern.zeyao;

public class Main {

    public static void main(String[] args) {

        System.out.println("==== Question 2 ====");
        Printer p1 = Printer.getInstance();
        p1.getConnection = "Your printer P1 is working";
        System.out.println(p1.getConnection);

        Printer p2 = Printer.getInstance();
        p2.getConnection = "Your printer P2 is working";
        System.out.println(p2.getConnection);
        System.out.println(p1.getConnection);

        System.out.println("==== Question 3 ====");
        int[] q3 = {1,3,-1,3,4,-1};
        System.out.println(Question3.sumOfRepeatedNumber(q3));

        System.out.println("==== Question 4 ====");
        System.out.println(Question4.findLongestSubstring("abcabcbb"));
    }
}
