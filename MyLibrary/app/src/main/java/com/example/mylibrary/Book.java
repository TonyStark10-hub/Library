package com.example.mylibrary;

public class Book {

    private int id;
    private String name;
    private String auther;
    private int pages;
    private String imageurl;
    private String shortdisc;
    private String longdisc;

    public Book(int id, String name, String auther, int pages, String imageurl, String shortdisc, String longdisc) {
        this.id = id;
        this.name = name;
        this.auther = auther;
        this.pages = pages;
        this.imageurl = imageurl;
        this.shortdisc = shortdisc;
        this.longdisc = longdisc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getShortdisc() {
        return shortdisc;
    }

    public void setShortdisc(String shortdisc) {
        this.shortdisc = shortdisc;
    }

    public String getLongdisc() {
        return longdisc;
    }

    public void setLongdisc(String longdisc) {
        this.longdisc = longdisc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", pages=" + pages +
                ", imageurl='" + imageurl + '\'' +
                ", shortdisc='" + shortdisc + '\'' +
                ", longdisc='" + longdisc + '\'' +
                '}';
    }
}
