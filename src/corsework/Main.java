package corsework;

public class Main {
    public static Employee[] list = new Employee[10];

    public static void main(String[] args) {

        list[0] = new Employee("Андрей Викторович Конев", 2, 40000);
        list[1] = new Employee("Иван Иванович Иванов", 1, 50000);
        list[2] = new Employee("Федор Федорович Федоров", 2, 60000);
        list[3]= new Employee("Мария Юрьевна Иванова", 3,70000);
        list[4] = new Employee("Ольга Александрвна Сидорова", 4,80000);
        list[5] = new Employee("Анастасия Игоревна Некифорова", 5,90000);
        list[6] = new Employee("Ольга Ивановна Конева", 1, 35000);
        list[7] = new Employee("Никита Андреевич Александров", 3, 45000);
        list[8] = new Employee("Андрей Константинович Никитин", 5, 110000);
        list[9] = new Employee("Мария Федоровна Юрьева", 2, 95000);
        lists(list);
        sumsalary(list);
        minsalary(list);
        maxsalary(list);
        avarageSalary(list);
        fioEmployee(list);
    }

    private static void lists(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    //Сумма затрат на ЗП
    public static int sumsalary(Employee[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты равна " + sum + "руб.");
        return sum;
    }

    public static int minsalary(Employee[] list) {
        String minSalaryName = null;
        int minsalary = list[1].getSalary();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minsalary) {
                minsalary = list[i].getSalary();
                minSalaryName = list[i].getName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalaryName);
        return minsalary;
    }

    public static int maxsalary(Employee[] list) {
        String maxSalaryName = null;
        int maxsalary = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxsalary) {
                maxsalary = list[i].getSalary();
                maxSalaryName = list[i].getName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalaryName);
        return maxsalary;
    }

    public static int avarageSalary(Employee[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getSalary();
        }
        int avaragesum = sum / list.length;
        System.out.println("Средняя зарплата сотрудников равна " + avaragesum + "руб.");
        return avaragesum;
    }

    public static void fioEmployee(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Ф.И.О. сотрудника - " + list[i].getName());
        }
    }



}
