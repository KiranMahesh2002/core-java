package com.xworkz.billapp;

import com.xworkz.billapp.dao.BillDao;
import com.xworkz.billapp.dto.BillDto;

public class BillRunner {

    public static void main(String[] args) {

        BillDto dto = new BillDto();
        dto.billId = 12;
        dto.billDueDate = "12/2/2023";
        dto.isBillPaid = true;
        dto.isLatestBill = false;
        dto.billIssueDate = "1/2/2023";

        BillDao dao = new BillDao();
        dao.createBill(dto);
        dao.displayBillInfo();
    }
}
