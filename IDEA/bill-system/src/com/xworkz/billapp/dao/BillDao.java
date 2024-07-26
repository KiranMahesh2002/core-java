package com.xworkz.billapp.dao;

import com.xworkz.billapp.dto.BillDto;

public class BillDao {

BillDto dto;

    public   boolean    createBill(BillDto dto){
        boolean isBillCreated = false;
        if(dto != null){
            this.dto = dto;

            isBillCreated = true ;    }

        return isBillCreated ;
    }

    public void displayBillInfo(){
        System.out.println("The Bill Id is "+ dto.billId);
        System.out.println("The Bill Issue Date is "+ dto.billIssueDate);
        System.out.println("The Bill Due Date is "+ dto.billDueDate);
        System.out.println("Is Bill Paid "+ dto.isBillPaid);
        System.out.println("Is Bill Latest "+ dto.isLatestBill);
    }
}
