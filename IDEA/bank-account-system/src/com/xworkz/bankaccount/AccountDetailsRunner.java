package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDAO;
import com.xworkz.bankaccount.dto.AccountDetailsDTO;

public class AccountDetailsRunner {

    public static void main(String[] args) {

        AccountDetailsDTO dto = new AccountDetailsDTO();
        dto.customerId = 12;
        dto.accountNumber = 1234;
        dto.accounType = "savings";
        dto.address = "bangalore";
        dto.ifscCode = "12tgf";



        AccountDetailsDAO value = new AccountDetailsDAO(dto);
        value.getDetails();




    }
}
