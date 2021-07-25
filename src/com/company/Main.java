package com.company;

import com.company.dao.NewsDao;
import com.company.dao.NewsDaoImpl;

public class Main {
    public static void main(String[] args) {
        NewsDao newsDao = new NewsDaoImpl();
        newsDao.InsertIntoNews("Олимпиада", "В Токио прошло открытие олимпиады", "2021-07-24 15:30");
        newsDao.OutNews();
//        newsDao.UpdateNews("Вакцинация", "В Бишкеке началась вакцинация", 1);
//        newsDao.OutNews();
//        newsDao.DeleteNewsById(1);
//        newsDao.OutNews();
    }
}
