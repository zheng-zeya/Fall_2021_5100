package edu.northeastern.zeyao.Question1;

public class Fiction extends Book implements iBorrowable{

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }


    @Override
    public String description() {
        return "Frankenstein(title) all events are imaginary and not based on real facts";
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
