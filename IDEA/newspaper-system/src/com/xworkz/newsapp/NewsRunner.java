package com.xworkz.newsapp;

import com.xworkz.newsapp.dao.NewsDao;
import com.xworkz.newsapp.dto.NewsDto;

public class NewsRunner {

    public static void main(String[] args) {

        NewsDto dto = new NewsDto();
        dto.name = "VK";
        dto.editor = "Someone";
        dto.circulation = 2854147;
        dto.language = "English";
        dto.price = 5.00;
        dto.issueDate = "01/01/2023";

        NewsDao dao = new NewsDao();
        dao.createNews(dto);
        dao.displayGardenInfo();
    }

}
