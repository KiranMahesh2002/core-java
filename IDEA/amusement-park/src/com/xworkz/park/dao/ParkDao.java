package com.xworkz.park.dao;

import com.xworkz.park.dto.ParkDto;

public class ParkDao {
     ParkDto dto;

    public boolean createPark(ParkDto dto) {
        boolean isParkCreated = false;
        if (dto != null ) {
            this.dto = dto;

            isParkCreated = true;
        }
        return isParkCreated;
    }

    public void displayParkInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("Park Name: " + dto.name);
        System.out.println("Location: " + dto.place);
        System.out.println("Number of Games: " + dto.noOfGames);
        System.out.println("---------------------------------------------");
    }
}
