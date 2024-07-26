package com.xworkz.gardenapp;

import com.xworkz.gardenapp.dao.GardenDao;
import com.xworkz.gardenapp.dto.GardenDto;

public class GardenRunner {

    public static void main(String[] args) {

        GardenDto dto = new GardenDto();
        dto.location = "Bangalore";
        dto.name = "LalBag";
        dto.sizeInAcres= 250.00;

        GardenDao dao = new GardenDao();
        dao.createGarden(dto);
        dao.displayGardenInfo();
    }
}
