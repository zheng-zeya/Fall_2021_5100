package edu.northeastern.zeyao;

public class Printer {
    public String getConnection = "Default";

    private Printer() {

    }

    private static Printer instance;
    public static Printer printer = new Printer();

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (printer) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }
}




