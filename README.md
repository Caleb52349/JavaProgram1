# JavaProgram1
Employee And ProductionWorker Classes And ShiftSupervisor Class

## Employee Class
- Design a class named "Employee." The class should keep the following information in fields:
Employee name
Employee number in the format XXX-L, where each X is a digit within the range (0-9) and the letter L is a letter within the range (A-M).
Hire date
- Write one or more constructors and the appropriate accessor and mutator methods for the class.
- Next, make a class named ProductionWorker that extends the Employee class. The Production Worker class should have fields to hold the following information:
Shift (an integer)
Hourly pay rate (a double)
- The workday is divided into two shifts: day and night. The shift field will be an integer value representing the shift that the employee works. The day shift is shift 1 and the night shift is shift 2. Write one or more constructors and the appropriate accessor and mutator methods for the class. Demonstrate the classes by writing a program that uses a ProductionWorker object.
## ShiftSuperVisor Class
In a particular factory, a shift supervisor is a salaried employee who supervises a shift. In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets production goals.
- Design a ShiftSupervisor class that extends the Employee class you created in Programming Challenge 1.

- The Supervisor class should have a field that holds the annual salary and a field that holds the annual production bonus that a shift supervisor has earned.

- Write one or more constructors and the appropriate accessor and mutator methods for the class.

- Demonstrate the class by writing a program that uses a ShiftSupervisor object.


## Employee
- include default constructor (set fields with placeholder data)
- include additional constructor with 3 arguments
- include appropriate getter and setter methods
- include toString() method to output name, employee number, and hire date to console
## ProductionWorker (extends Employee)
- include constructor with 5 arguments, calls super constructor
- additional getter and setter methods appropriate for subclass
- include toString() method to output ALL information to console
- should display "Day Shift" or "Night Shift", not 1 or 2
## ShiftSupervisor (extends Employee)
- include constructor with 4 arguments, calls super constructor
- additional getter and setter methods appropriate for subclass
- make a method that adds additional 8% of salary as a bonus
- include toString() method to output ALL information to console
- should display salary and bonus with proper symbols and two decimal places
## Main (Demo)
- Your demo program will include two (2) Production Worker objects and one (1) Shift Supervisor object
- Create (i.e. hard code) one (1) Production Worker and one (1) Shift Supervisor in the main() method of the demo program
- e.g. ShiftSupervisor carol = new ShiftSupervisor ("Caleb Danso", "723-D", "09/10/2010", 65000.0);
- Ask the user for information for one (1) additional Production Worker (using a separate method) via the console or input boxes
- Use your name as the Shift Supervisor
- Shift Supervisor earns bonus if both Production Workers are on the same shift
- Display all data for all three employees to the console
- The main() method should only create objects and call methods
