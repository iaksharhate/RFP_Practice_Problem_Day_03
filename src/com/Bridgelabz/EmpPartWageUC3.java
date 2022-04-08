package com.Bridgelabz;

public class EmpPartWageUC3 {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int WAGE_PER_HOUR = 20;

        int empHrs = 16;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == FULL_TIME) {
            System.out.println("Employee is present!");
            System.out.println("Total working hours: "+empHrs);
        }else if (empCheck == PART_TIME){
            empHrs = empHrs/2;
            System.out.println("Employee is present part time!");
            System.out.println("Total working hours: "+empHrs);
        }else{
            System.out.println("Employee is absent!");
            empHrs = 0;
        }
        empWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee wage : " + empWage);
    }

}
