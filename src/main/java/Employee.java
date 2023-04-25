// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private Date  birthDate;
  private Date  hireDate; 

   // constructor
   public Employee(String firstName, String lastName,String socialSecurityNumber,Date birthDate, Date hireDate) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
   } 

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

  
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

  // return String representation of Employee object
   @Override
   public String toString() {
      return String.format("%s %s%nsocial security number: %s Birthdate: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(),
  getBirthDate(), getHireDate());
   }

   

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} 



