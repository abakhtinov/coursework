package corsework;

import java.util.List;

public class Main {
    private static final Employee[] LIST = new Employee[10];

    public static void main(String[] args) {

        LIST[0] = new Employee("Андрей Викторович Конев", 2, 40000);
        LIST[1] = new Employee("Иван Иванович Иванов", 1, 50000);
        LIST[2] = new Employee("Федор Федорович Федоров", 2, 60000);
        LIST[3]= new Employee("Мария Юрьевна Иванова", 3,70000);
        LIST[4] = new Employee("Ольга Александрвна Сидорова", 4,80000);
        LIST[5] = new Employee("Анастасия Игоревна Некифорова", 5,90000);
        LIST[6] = new Employee("Ольга Ивановна Конева", 1, 35000);
        LIST[7] = new Employee("Никита Андреевич Александров", 3, 45000);
        LIST[8] = new Employee("Андрей Константинович Никитин", 5, 110000);
        LIST[9] = new Employee("Мария Федоровна Юрьева", 2, 95000);
        lists(LIST);
        sumSalary(LIST);
        minSalary(LIST);
        maxSalary(LIST);
        avarageSalary(LIST);
        fioEmployee(LIST);

        System.out.println("Сумма затрат на зарплаты " + sumSalary(LIST) + " руб.");
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary(LIST) + " руб.");
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalary(LIST) + " руб.");
        System.out.println("Средняя зарплата сотрудников равна " + avarageSalary(LIST) + "руб.");
    }

    private static void lists(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    //Сумма затрат на ЗП
    private static int sumSalary(Employee[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getSalary();
        }
        return sum;
    }

    private static int minSalary(Employee[] list) {
        String minSalaryName = null;
        int minSalary = list[0].getSalary();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                minSalaryName = list[i].getName();
            }
        }
        return minSalary;
    }

    private static int maxSalary(Employee[] list) {
        String maxSalaryName = null;
        int maxSalary = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                maxSalaryName = list[i].getName();
            }
        }
        return maxSalary;
    }

    private static float avarageSalary(Employee[] list) {
        float avarageSum = sumSalary(LIST) / list.length;
        return avarageSum;
    }

    private static void fioEmployee(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Ф.И.О. сотрудника - " + list[i].getName());
        }
    }
}
