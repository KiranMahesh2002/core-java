package com.xworkz.gardenapp.dao;

import com.xworkz.gardenapp.dto.GardenDto;

public class GardenDao {

    GardenDto dto;

    public boolean createGarden(GardenDto dto) {
        boolean isGardenCreated = false;
        if (dto != null ) {
            this.dto = dto;

            isGardenCreated = true;
        }
        return isGardenCreated;
    }

    public void displayGardenInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("Garden Name: " + dto.name);
        System.out.println("Location: " + dto.location);
        System.out.println("Size (in acres): " + dto.sizeInAcres);
        System.out.println("---------------------------------------------");

    }
}
