package br.edu.fatecfranca.ex3;

import java.util.ArrayList;

public class Post {
    private int code;
    private String text;
    private String author;
    private int likes;
    
    private ArrayList<Comment> comments;
    
    public Post(){
        this.comments = new ArrayList();
    }

    public Post(int code, String text, String author, int likes, ArrayList<Comment> comments) {
        this.code = code;
        this.text = text;
        this.author = author;
        this.likes = likes;
        this.comments = comments;
    }
    
    public Post(int code, String text, String author) {
        this.code = code;
        this.text = text;
        this.author = author;
        this.comments = new ArrayList();
        this.likes = 0;
    }
    
    public void addComment(Comment comment){
        this.comments.add(comment);
        System.out.println("Comment adicionado com sucesso!");
    }
    
    public void removeComment(Comment comment){
        if(this.comments.remove(comment)){
            System.out.println("Comment removido com sucesso!");
        } else {
            System.out.println("Comment não existe!");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void darLike(){
        this.likes++;
    }
    
    public void tirarLike(){
        this.likes--;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" + "code=" + code + ", text=" + text + ", author=" + author + ", likes=" + likes + ", comments=" + comments + '}';
    }
    
    
}
