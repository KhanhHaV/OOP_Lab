package aims.media;


import aims.media.*;
import java.util.ArrayList;
import java.util.List;
import aims.cart.*;

public class Book extends Media {
    private int token;
    private List<String> authors;

    public Book(String title, String category, String author, float cost, int token){
        super(title,category, cost);
        this.token = token;
        this.authors.add(author);
    }
    public Book(int id, String title, String category, float cost, int token){
        super(title,category, cost);
        this.token = token;
    }
    public Book(String title, String category, float cost, int token){
        super(title,category, cost);
        this.token = token;

    }
    public int getToken(){
        return token;
    }

    // Getters and setters
    
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    
    public void addAuthor(String authorName) {
        if (!this.authors.contains(authorName)) {
            this.authors.add(authorName);
        }
    }
    
    public void removeAuthor(String authorName) {
        if (this.authors.contains(authorName)) {
            this.authors.remove(authorName);
        } else {
            System.out.println("Author " + authorName + " is not found in the list of authors for this book.");
        }
    }

    public String toString(int order){
        return(order + ".Book - " +  this.title+ " - " + this.getCategory()  + " - " + this.getToken() + " - " + this.getCost() + " $");
    }

    
}