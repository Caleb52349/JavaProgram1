package com.calisco;

public class ShiftSupervisor extends  Employee {
    private double annualSalary,yearlyBonus;

    /*
      This Constructor sets Employee name, number and hireDate.
      @param empName EmployeeName
      @param empNo EmpNo- Employee Number
      @param hireDate hireDate of Employee
      @param Salary Employee' annual salary
      @param Bonus employee yearly bonus
    */

    public  ShiftSupervisor(String empName,String empNo ,String hireDate,double salary, double bonus)
    {
        super(empName,empNo,hireDate);
        this.annualSalary = salary;
        this.yearlyBonus = bonus;
    }

    //Getters and setters
    //gets annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // set method to set value of annualSalary as Salary
    public void  setAnnualSalary(double salary)
    {
        this.annualSalary=salary;
    }

    //gets yearlyBonus
    public double getYearlyBonus() {
        return yearlyBonus;
    }

    // set method to set value of yearlyBonus as bonus
    public  void  setYearlyBonus(double bonus)
    {
        this.yearlyBonus = bonus;
    }

    //To string Method. this is to print in a nice format
    //ss- shiftSupervisor
    public String toString() {
        String ss = super.toString();
        ss += "\nEmployee Annual Salary : " + annualSalary +
                "\nEmployee Yearly Bonus: " + yearlyBonus;
        return ss;
    }
}
