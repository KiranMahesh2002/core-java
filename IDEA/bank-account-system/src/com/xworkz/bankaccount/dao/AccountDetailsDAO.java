package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDTO;

public class AccountDetailsDAO {

    AccountDetailsDTO dto;

    public AccountDetailsDAO( AccountDetailsDTO dto){
        System.out.println("This is parameterized constructor");
        this.dto = dto;


    }
    public void getDetails(){

        System.out.println("-----------------------------------------");
        System.out.println("The Customer Id is = "+dto.customerId);
        System.out.println("The Name of the Bank is = "+dto.bankName);
        System.out.println("The Name of the Branch is = "+dto.branchName);
        System.out.println("The IFSC code is = "+dto.ifscCode);
        System.out.println("The Account Number is = "+dto.accountNumber);
        System.out.println("The Address is = "+dto.address);
        System.out.println("The Type Of Acoount is = "+dto.accounType);
        System.out.println("-----------------------------------------");


    }
}
