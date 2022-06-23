package corsework;

public class Employee {

    private String name;
    private int departments;
    private int id;
    private static int count = 1;
    private int salary;

    public Employee(String name, int departments, int salary) {
        this.name = name;
        this.departments = departments;
        this.salary = salary;
        id = count++;

        }

        public String getName() {
            return name;
        }

        public int getDepartments() {
            return departments;
        }

        public int getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        public void setDepartments(int departments) {
        this.departments = departments;
        }

        public void setSalary() {
            this.salary = salary;
        }

    public String toString() {
        return getId() + ". " +  "ФИО: " + getName() +" Отдел: "+ getDepartments() + " Зарплата: " + getSalary() + "руб.";
    }

}
