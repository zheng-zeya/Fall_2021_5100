package edu.northeastern.zeyao.Question1;

public class NonFiction extends Book implements iBorrowable{

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return "Anne Frank(title) all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {

    }

    @Override
    public void setReturnDate(int day) {

    }

    @Override
    public boolean isAvailable(int day) {
        return false;
    }
}
