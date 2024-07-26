package com.xworkz.atmmachine.dao;

import com.xworkz.atmmachine.dto.AtmDto;

public class AtmDao {

    AtmDto dto;

    public boolean createAtm(AtmDto dto) {
        boolean isAtmCreated = false;
        if (dto != null ) {
            this.dto = dto;

            isAtmCreated = true;
        }
        return isAtmCreated;
    }

    public void displayAtmInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("Bank Name: " + dto.bankName);
        System.out.println("Location: " + dto.location);
        System.out.println("Withdrawal Limit: Rs." + dto.withdrawalLimit);
        System.out.println("---------------------------------------------");
    }
}
