package com.bridgelabz.addressbooksystemday10;

public class EmployeeWageProblem {


        public static void main(String[] args)
        {
            System.out.println("Welcome to Employee Wage Computation Program on Master "
                    + "Branch  ");

            int empPresent = 1;
            int empStatus = (int) (Math.random() * 10) % 2;
            System.out.println(empStatus);
            if (empStatus == empPresent)
            {
                System.out.println("Emp is Present ");
            }
            else
            {
                System.out.println("Emp is not Present ");
            }
        }

    }

