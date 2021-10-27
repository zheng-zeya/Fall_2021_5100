package edu.northeastern.zeyao.Question1;

public class Reference extends Book{
    private String category;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String description() {
        return "World Maps(title) all information is real";
    }
}
