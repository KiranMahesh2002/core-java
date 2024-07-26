package com.xworkz.penapp;

import com.xworkz.penapp.dao.PenDao;
import com.xworkz.penapp.dto.PenDto;

public class PenRunner {

    public static void main(String[] args) {

        PenDto dto = new PenDto();
        dto.id =12;
        dto.name = "Brite";
        dto.color = "black";
        dto.price = 10.00;

        PenDao dao = new PenDao(dto);

        dao.getDetails();


    }
}
