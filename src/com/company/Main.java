package com.company;

import com.company.dao.NewsDao;
import com.company.dao.NewsDaoImpl;

import java.sql.Timestamp;


public class Main {
    public static void main(String[] args) {
        NewsDao newsDao = new NewsDaoImpl();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        newsDao.InsertIntoNews("Олимпиада", "В Токио прошло открытие олимпиады", timestamp);
        System.out.println(newsDao.OutNews());
        newsDao.UpdateNews("Вакцинация", "В Бишкеке началась вакцинация", 1);
        System.out.println(newsDao.OutNews());
        newsDao.DeleteNewsById(1);
        System.out.println(newsDao.OutNews());
    }
}
