package com.Bridgelabz;

public class EmpWageMonthlyUC5 {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;

        int empHrs = 16;
        int empDays = 0;
        int monthlyWage = 0;
        int presentDays = 0;
        int absentDays = 0;

        for (int i = 0; i <= 30; i++) {
            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == FULL_TIME) {
                empHrs = 16;
                empDays++;
                presentDays++;
            }else{
                absentDays++;
            }
        }
        monthlyWage = empDays * (empHrs * WAGE_PER_HOUR);
        System.out.println("Employee's monthly salary : "+monthlyWage);
        System.out.println("Total present days : "+presentDays);
        System.out.println("Total absent days : "+absentDays);
    }
}
