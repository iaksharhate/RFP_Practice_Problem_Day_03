package com.Bridgelabz;

public class EmpDailyWage {
    public static void main(String[] args) {

        int FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == FULL_TIME) {
            System.out.println("Employee is present!");
            empHrs = 8;
        } else {
            System.out.println("Employee is absent!");
            empHrs = 0;
        }
        empWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee daily wage : " + empWage);
    }
}
