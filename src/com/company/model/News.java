package com.company.model;

import java.sql.Timestamp;

public class News {
    private Integer id;
    private String head;
    private String text_of_news;
    private Timestamp publicationTime;

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

    public Timestamp getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Timestamp publicationTime) {
        this.publicationTime = publicationTime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", head='" + head + '\'' +
                ", text_of_news='" + text_of_news + '\'' +
                ", publicationTime=" + publicationTime +
                '}';
    }
}
