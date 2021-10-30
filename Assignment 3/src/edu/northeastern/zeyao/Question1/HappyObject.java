package edu.northeastern.zeyao.Question1;

public class HappyObject extends MoodyObject {
    @Override
    public String getMood() {
        System.out.println("I feel happy today");
        return null;
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }
    public String toString(){
        return "Subject laughs a lot";
    }
}
