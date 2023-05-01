
import java.time.LocalDate;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00,new Date (07,23,1979),new Date (02,23,2007));    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40,new Date (01,22,1988)
         ,new Date(04,16,2010));  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 10000, .04, new Date (04,25,1999),new Date (03,01,2020));                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .02, 300, new Date (02,14,1969), 
                 new Date (05,15,2006));       
       basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Manpreet", "Virk", "000-00-001", 2000, .02, 400, new Date (007,24,1968), 
                 new Date (05,15,2006));      

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

     // create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;
      employees[4] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

       //generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // get type name of each object in employees array
     //for (int j = 0; j < employees.length; j++) {      
         //System.out.printf("Employee %d is a %s%n", j,  
           // employees[j].getClass().getName());}  
       
           
       
         
       
           
System.out.println(" Question 10.13");
// Manpreet Virk
    //  int currentMonth = LocalDate.now().getMonthValue();
    for (Employee employee : employees) {
     // System.out.printf("%n%s%nearnings: $%,.2f%n", employee, employee.earnings());
if (employee.earnings()  <= 600){
    System.out.printf("%n%s%nearnings: $%,.2f%n", employee, employee.earnings());
    System.out.println(employee.getFirstName() + " " + employee.getLastName() + " Is making less than 600");
}
else {
    System.out.print("These Employees are making more than 600:" + " ");
        System.out.println(employee.getFirstName() + " " + employee.getLastName() );

}
    /*if (employee.getBirthDate().getMonth() == currentMonth) {
         System.out.println("Happy Birthday! You have received a $100 bonus!");
         System.out.printf("New earnings: $%,.2f%n", employee.earnings() + 100);*/
                 
    
      }
      
    }}
   
   


   
