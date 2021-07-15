package com.calisco;
/*

This Class records Production of employee including their shift and hourly pay rate.
 @author Caleb Danso, 52349

* */
public class ProductionWorker extends Employee {
    // Constant declared variables
    public final int dayShift = 1;
    public final int nightShift = 2;

    // data fields
    private int shift;
    private double hourlyPayRate;

    // Initial Constructor
    public ProductionWorker()
    {
        super();
        shift = 0;
        hourlyPayRate = 0.0;
    }

    /*
        This Constructor sets Employee name, numberr and hiredate.
        @param empName EmployeeName
        @param empNo EmpNo- Employee Number
        @param date hiredate of Employee
        @param sh Employee's day shift
        @param rate hourlyPayRate;
      */
    public ProductionWorker(String empName, String empNo, String date, int sh, double rate)
    {
        super(empName, empNo, date);
        setShift(sh);
        setHourlyPayRate(rate);
    }

    /*
    Getter and setters for accessing Methods
     */

    //get method to return Shift
    public int getShift()
    {
        return shift;
    }

    // get method to return hourlyPayRate
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }


    // set method to set value of shift as sh
    public void setShift(int sh)
    {
        if(sh == dayShift|| sh == nightShift)
            shift = sh;
        else
            shift = 0;
    }

    //  set method to set value of hourlyPayRate as rate
    public void setHourlyPayRate(double rate)
    {
        hourlyPayRate = rate;
    }

    // toString method this is to print in nice format.
    public String toString() {
        String result = "";

        result = super.toString() + "\n";

        if (shift == dayShift)
            result += "Shift: Day\n";
        else if (shift == nightShift)
            result += "Shift: Night\n";
        else
            result += "Shift: Invalid\n";

        result += "Hourly pay rate: " + String.format("$%.2f", hourlyPayRate);

        return result;
    }

}
