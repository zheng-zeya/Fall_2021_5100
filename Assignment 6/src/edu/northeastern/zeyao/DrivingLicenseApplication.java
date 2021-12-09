package edu.northeastern.zeyao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    long age;

    public static void main(String[] args) {
        DrivingLicenseApplication drivingLicenseApplication = new DrivingLicenseApplication();
        drivingLicenseApplication.getDateOfBirthFromUser();
    }

    public void getDateOfBirthFromUser() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the applicant's date of birth following the format: yyyyMMdd");
            String dateOfBirth = scanner.nextLine();

            Date dateNow = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            long a = simpleDateFormat.parse(dateOfBirth).getTime();
            long now = dateNow.getTime();
            long difference = now - a;
            age = difference/1000/60/60/24/365;
            ageLimit(age);
            System.out.println("The applicant's age is : " + age + ", which is eligible to apply for a driving license");
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (AgeException e) {
            e.errorMessage();
        }

    }
        class AgeException extends Exception {
            public void errorMessage(){
                System.out.println("The age of the applicant is "+ age +", which is too early to apply for a driving license");
                System.out.println();
            }

        }

        public void ageLimit(long age) throws AgeException {
            if(age < 16){
                throw new AgeException();
            }
        }
}

