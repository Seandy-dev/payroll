/*Employee.java
  Entity for the Employee
  Author: Sindiswa Nomusa Mbhele (219279616)
  Date: 23 June 2021
 */


package za.ac.cput.Entity;

public class Employee {

    private String employeeNumber, firstName, lastName;

    public Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }
    private class Builder{
   private String employeeNumber, firstName, lastName;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee build(){
          return new Employee(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "employeeNumber='" + employeeNumber + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        public Employee buid(){
            return new Employee(this);
        }

        private Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }
    }

}
