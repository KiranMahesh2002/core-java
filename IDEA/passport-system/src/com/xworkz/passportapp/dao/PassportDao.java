package com.xworkz.passportapp.dao;

import com.xworkz.passportapp.dto.PassportDto;

public class PassportDao {

   PassportDto dto;

   public  boolean createPassport( PassportDto dto ){
      boolean isPassportCreated = false;

      if( dto != null){
         this.dto = dto;

         isPassportCreated =true;
      }else{
         System.out.println("Please Provide Valid Details ............");
      }

      return isPassportCreated;

   }
   public  void getPassportDetails(){
      System.out.println("---------------------------------------");
      System.out.println("The cpv Location is : " +dto.cpvLocation);
      System.out.println("The dcdr Location is : " +dto.dcdrLocation);
      System.out.println("The First Name is : "+ dto.fName);
      System.out.println("The Last Name is : "+ dto.lName);
      System.out.println("The Date of Birth is : " +dto.dob);
      System.out.println("The Mail is : " +dto.email);
      System.out.println("The Login ID is : " +dto.loginId);
      System.out.println("is Email and Login is Same : " +dto.isEmailLoginSame);
      System.out.println("The Password is : "+ dto.password);
      System.out.println(" The Confirm password is : " +dto.confirmPassword);
      System.out.println(" the Hint Question Is : " +dto.hintQue);
      System.out.println(" The Hint Answer is : " +dto.hintAns);
      System.out.println(" The Captcha is : " +dto.captcha);
      System.out.println("-------------------------------------------");


   }
}
