/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Minh
 */
public class Book {
    private String Title;
    private String Categories;
    private String Author;
    private String Publisher;
    private int PublishYear;

    //Getter and Setter
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String Categories) {
        this.Categories = Categories;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getPublishYear() {
        return PublishYear;
    }

    public void setPublishYear(int PublishYear) {
        this.PublishYear = PublishYear;
    }

    //Constructor
    public Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }
    
    //In thông tin
    public void getInfo() {
        System.out.println(Title + " " + Author);
        System.out.println(Publisher + " " + PublishYear);
    }
    
}
