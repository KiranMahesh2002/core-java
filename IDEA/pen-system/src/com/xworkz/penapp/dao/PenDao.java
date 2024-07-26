package com.xworkz.penapp.dao;

import com.xworkz.penapp.dto.PenDto;

public class PenDao {

    PenDto dto;

    public PenDao(PenDto dto){
        System.out.println("The Parameterized constructor");
        this.dto = dto;


    }

    public void getDetails(){
        System.out.println("The details are \n " + dto.id + "\n" + dto.name + "\n" + dto.color + "\n" + dto.price);


    }
}
