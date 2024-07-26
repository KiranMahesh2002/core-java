package com.xworkz.atmmachine;

import com.xworkz.atmmachine.dao.AtmDao;
import com.xworkz.atmmachine.dto.AtmDto;

public class AtmRunner {

    public static void main(String[] args) {

        AtmDto dto = new AtmDto();
        dto.bankName = "KOTAK";
        dto.location ="Thindlu";
        dto.withdrawalLimit = 70000;

        AtmDao dao = new AtmDao();
        dao.createAtm(dto);
        dao.displayAtmInfo();
    }
}
