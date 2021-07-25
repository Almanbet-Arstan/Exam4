package com.company.dao;

import com.company.model.News;

import java.util.List;

public interface NewsDao {
    void InsertIntoNews(String head, String text_of_news, String publicationTime);
    List<News> OutNews();
    void DeleteNewsById(int id);
    void UpdateNews(String head, String text_of_news, int id);
}
