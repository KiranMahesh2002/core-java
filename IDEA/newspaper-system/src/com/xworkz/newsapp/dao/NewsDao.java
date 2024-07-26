package com.xworkz.newsapp.dao;

import com.xworkz.newsapp.dto.NewsDto;

public class NewsDao {

    NewsDto dto ;

    public boolean createNews(NewsDto dto) {
        boolean isGardenCreated = false;
        if (dto != null ) {
            this.dto = dto;

            isGardenCreated = true;
        }
        return isGardenCreated;
    }

    public void displayGardenInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("The Newspaper Name is: " + dto.name);
        System.out.println("The Editor is: " + dto.editor);
        System.out.println("The Circulation is: " + dto.circulation);
        System.out.println("The Language is: " + dto.language);
        System.out.println("The Price is: " + dto.price);
        System.out.println("The Issue Date is: " + dto.issueDate);
        System.out.println("---------------------------------------------");

    }
}
