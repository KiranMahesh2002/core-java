package com.xworkz.passportapp;

import com.xworkz.passportapp.dao.PassportDao;
import com.xworkz.passportapp.dto.PassportDto;

 class PassportRunner {

     public static void main(String[] args) {

        PassportDto dto = new PassportDto();
        dto.cpvLocation ="";
        dto.dcdrLocation = 1;
         dto.fName ="team";
        dto.lName ="david";
         dto.dob ="08/09/1996";
        dto.email ="teamdavid@gmail.com" ;
        dto.loginId = "teamdavid@gmail.com";
         dto.isEmailLoginSame = true;
        dto.password = "team123";
         dto.confirmPassword = "team123";
        dto.hintQue = "batter";
        dto.hintAns = "yes";
         dto.captcha = "12GH7";

         PassportDao dao = new PassportDao();
         dao.createPassport(dto);
         dao.getPassportDetails();
    }
}
