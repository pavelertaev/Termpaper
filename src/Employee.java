public class Employee {
    private String employee;
    private  int salary;
    private String department;
    private int id;
    static int counter=0;



    Employee(String name , int salary , String department){
        this.employee = name;
        this.salary = salary;
        this.department = department;
        id = counter++;
    }

    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }


    public String getName() {
        return employee;
    }

    public  int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public void setDepartment(String department) {
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name = " + employee + '\'' +
                ", salary = " + salary +
                ", department =" + department + '\'' +
                ", id = " + id ;
    }
}




