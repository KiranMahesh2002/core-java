package com.xworkz.batteryapp;

import com.xworkz.batteryapp.dao.BatteryDao;
import com.xworkz.batteryapp.dto.BatteryDto;

public class BatteryRunner {

    public static void main(String[] args) {

        BatteryDto dto = new BatteryDto();
        dto.brand = "EVERYDAY";
        dto.type = "LiTHIUM";
        dto.capacity = 20;
        dto.voltage = 25;
        dto.rechargeable = true;
        dto.price = 15.00;

        BatteryDao dao = new BatteryDao();
        dao.createBattery(dto);
        dao.displayBatteryInfo();
    }
}
