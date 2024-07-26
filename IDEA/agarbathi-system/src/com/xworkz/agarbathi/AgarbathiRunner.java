package com.xworkz.agarbathi;

import com.xworkz.agarbathi.dao.AgarbathiDao;
import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiRunner {

    public static void main(String[] args) {

        AgarbathiDto dto = new AgarbathiDto();
        dto.brandName = "Cycle";
        dto.qty = 12;
        dto.fragrance = "sandal";
        dto.price = 250.0;
        dto.mgfDate = "21/05/2024";
        dto.expDate = "21/06/2024";

        AgarbathiDao dao = new AgarbathiDao();
        dao.createAgarbathi(dto);
        dao.displayAgarbathiInfo();

    }
}
