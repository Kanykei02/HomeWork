package com.company;

public class Song {
    private String name;
    private String author;
    private String songText;
    private String genre;

    public Song(){}

    public Song(String name, String author, String songText, String genre) {
        this.name = name;
        this.author = author;
        this.songText = songText;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSongText() {
        return songText;
    }

    public void setSongText(String songText) {
        this.songText = songText;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String fullSong(){
        String text = this.name + "\n" + this.author + "\n" + this.genre + "\n" + this.songText;
        return text;
    }
}
