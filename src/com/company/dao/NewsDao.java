package com.company.dao;

import com.company.model.News;

import java.sql.Timestamp;
import java.util.List;

public interface NewsDao {
    void InsertIntoNews(String head, String text_of_news, Timestamp publicationTime);
    List<News> OutNews();
    void DeleteNewsById(int id);
    void UpdateNews(String head, String text_of_news, int id);
}
