import java.util.ArrayList;
import java.util.Objects;

public class Employee implements Cloneable {
   private static ArrayList<String> sinList=new ArrayList<>();
   private String name;
   private int age;
   private String department;
   private String job;
   private String description;
   private String SIN;
   private double salary;
   public Employee(){}
   public Employee(String name, int age, String department, String job, String description, String SIN, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.job = job;
        this.description = description;
        this.SIN = SIN;
        this.salary = salary;
        sinList.add(this.SIN);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * modify the condition of equals method to make it determin the equlity based on {SIN} argument
     * and return true if equals other wise return false
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(SIN, employee.SIN);
    }

    /**
     * return an integer that represent the hashcode of the object
     * @return
     */

    @Override
    public int hashCode() {
        return Objects.hash(name, age, department, job, description, SIN, salary);
    }

    /**
     * return the object as a string
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", job='" + job + '\'' +
                ", description='" + description + '\'' +
                ", SIN='" + SIN + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * modify the implementation of clone method to let it make deep copy instead of the default implementation
     * that make shallow  copy;
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
       Employee e=(Employee)super.clone();
       e=new Employee();
       e.name=this.name;
       e.SIN=this.SIN;
       e.salary=this.salary;
       e.department=this.department;
       e.age=this.age;
       e.job=this.job;
        return e;
    }

    /**
     * mehtod that calculate the tax on the salary
     */

    public void calculateTax() throws Exception1 {
        double tax = 0.2;
        double totaltax = this.salary * tax;
        //Exception1 exception1=new Exception1();
        if(totaltax>1000) {
            throw  new Exception1();
        } else {
             System.out.println("The total tax is = "+totaltax);
        }
    }

    /**
     * method that calculates the tax for social  insurance
     */
    public void calculateSIN() throws Eception2 {
        double tax =0.01;
        double totaltax;
        if(sinList.contains(this.SIN)) {
            totaltax = this.salary * tax;
            System.out.println("The social  insurance is = "+totaltax);
        }
        else {
            throw new Eception2();
            //Eception2 eception2 = new Eception2();

        }
    }
}
