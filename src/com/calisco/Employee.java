package com.calisco;
/*

This Program illustrates The Employee Details such as
Names,employeeNumber and hireDate.
 @author Caleb Danso, 52349
*/

public class Employee {
    //data fields of employee
    private String employeeName,employeeNo,hireDate;

    //Constructor which runs as a default
    public Employee (){
        employeeName ="first Name has not been set";
        employeeNo="Number for employee has not been set";
        hireDate = "Date has not been set Yet";
    }

    /*
     This Constructor sets  EmployeeName, Number and date
     @param empName EmployeeName
     @param empNo EmpNo- Employee Number
     @param date hireDate of Employee
   */
    public Employee (String empName,String empNo ,String date)
    {
        setEmployeeName(empName);
        setEmployeeNumber(empNo);
        setHireDate(date);
    }

    /*
    Getter and setters for accessing Methods
    */

    // set method to set value of  employeeName as empName
    public void setEmployeeName(String empName) {
        employeeName=empName;

    }
    //get method to return employeeName
    public String getEmployeeName()  {
        return  employeeName;
    }

    // set method to set value of hireDate as date
    public void setHireDate(String date) {
        hireDate=date;
    }

    //get method to return hireDate
    public String getHireDate() {
        return hireDate;
    }


    // Ues if statement to set employeeNo as No. if not valid the sets "Invalid Number"
    public void setEmployeeNumber(String No) {
        if(isValidEmpNum(No))
            employeeNo=No;
        else
            employeeNo="Invalid Number";
    }

    //get method to return employeeNo
    public String getEmployeeNumber() {
        return employeeNo;
    }


  /* public void setEmployeeNumber(String empNo) {
       if (empNo.length() == 5
               && Character.isDigit(empNo.charAt(0))
               && Character.isDigit(empNo.charAt(1))
               && Character.isDigit(empNo.charAt(2))
               && empNo.charAt(3) == '-'
               && (empNo.charAt(4) <= 'A' && empNo.charAt(4) >= 'M')) {
           employeeNo = empNo;
       } else {
           employeeNo = "Invalid number";
       }
   }

   For this code i kept receiving invalid number even if number was valid so i changed
   my implementation to a boolean to record invalid numbers. This worked so i kept this
   new change.
   */
 /*
    SetEmployee Number uses If statements to validate 0-9 for the XXX part of empNO and validates
    A-M for for to other part of empNo
     */




    //This boolean is to validate the XXX-L (X-digits 0-9 and L in range of A-M)
    //isValidEmpNum is a validator boolean to ensure User Inputs corrects format for EmployeeNumber
    private boolean isValidEmpNum(String empNo)
    {
        boolean status = true;

        if (empNo.length() != 5)
            status = false;
        else
        {
            if ((!Character.isDigit(empNo.charAt(0)))               ||
                    (!Character.isDigit(empNo.charAt(1)))                  ||
                    (!Character.isDigit(empNo.charAt(2)))                  ||
                    (empNo.charAt (3) != '-')                                      ||
                    (Character.toUpperCase(empNo.charAt(4)) < 'A')  ||
                    (Character.toUpperCase(empNo.charAt(4)) > 'M'))
                status = false;
        }

        return status;
    }



    //To String method Illustration which concatenates EmpName,No and hire date .
    public  String toString() {
        String result = "";
        result = "Employee name: " + employeeName + "\n"
                + "Employee number: " + employeeNo + "\n"
                + "Employee hire date: " + hireDate;
        return result;

    }
}
