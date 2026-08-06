package com.hdfc.day4;

public class Song {
    private String title;
    private String artist;

    public Song(String artist, String title){
        this.title =title;
        this.artist=artist;
    }

    public void play(){
        System.out.println(this.artist+" singing the " + title);
    }

    public String getArtist(){
        return this.artist;
    }

    public String getTitle(){
        return this.title;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }

    public void setTitle(String title){
        this.title=title;
    }
}
