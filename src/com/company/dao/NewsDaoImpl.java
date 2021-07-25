package com.company.dao;

import com.company.model.News;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl extends BaseDao implements NewsDao{
    @Override
    public void InsertIntoNews(String head, String text_of_news, String publicationTime) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("insert into news (head, text_of_news, publication_time)\n" +
                    "values (?, ?, ?);")){
            statement.setString(1, head);
            statement.setString(2, text_of_news);
            statement.setString(3, publicationTime);
            statement.executeUpdate();
            System.out.println("Данные успешно внесены в базу данных");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public List<News> OutNews() {
        List<News> newsAll = new ArrayList<>();
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select * from news;");
             ResultSet resultSet = statement.executeQuery()){

            while (resultSet.next()){
                News news = new News();
                news.setId(resultSet.getInt("id"));
                news.setHead(resultSet.getString("head"));
                news.setText_of_news(resultSet.getString("text_of_news"));
                news.setPublicationTime(resultSet.getString("publication_time"));
                newsAll.add(news);
            }
            System.err.println("Получение данных прошло успешно");
        }catch (Exception e){
            e.printStackTrace();
        }
        return newsAll;
    }

    @Override
    public void DeleteNewsById(int id) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("delete * from news where id = ?;")){
            statement.setInt(1, id);
            statement.executeUpdate();
            System.err.println("Данные успешно удалены");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void UpdateNews(String head, String text_of_news, int id) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("update news set head = ?\n" +
                    "        where id = ?;\n" +
                    "        update news set text_of_news = ?\n" +
                    "        where id = ?;")){
            statement.setString(1, head);
            statement.setInt(2, id);
            statement.setString(3, text_of_news);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.err.println("Изменение текста в таблице произошло успешно");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}