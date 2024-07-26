package com.xworkz.park;

import com.xworkz.park.dao.ParkDao;
import com.xworkz.park.dto.ParkDto;

public class ParkRunner {

    public static void main(String[] args) {

        ParkDto dto = new ParkDto();
        dto.name ="Wonderla";
        dto.place ="Bengaluru";
        dto.noOfGames = 23;

        ParkDao dao = new ParkDao();
        dao.createPark(dto);
        dao.displayParkInfo();
    }
}
