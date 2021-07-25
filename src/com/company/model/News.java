package com.company.model;

public class News {
    private Integer id;
    private String head;
    private String text_of_news;
    private String publicationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getText_of_news() {
        return text_of_news;
    }

    public void setText_of_news(String text_of_news) {
        this.text_of_news = text_of_news;
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }
}
