package edu.northeastern.zeyao.Question1;

public class SadObject extends MoodyObject {
    @Override
    public String getMood() {
        System.out.println("I feel sad today");
        return null;
    }

    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    @Override
    public String toString(){
        return "Subject cries a lot";
    }
}
