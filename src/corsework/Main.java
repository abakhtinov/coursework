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
        lists();
        sumSalary();
        minSalary();
        maxSalary();
        avarageSalary();
        fioEmployee();

        System.out.println("Сумма затрат на зарплаты " + sumSalary() + " руб.");
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary() + " руб.");
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalary() + " руб.");
        System.out.println("Средняя зарплата сотрудников равна " + avarageSalary() + "руб.");
    }

    private static void lists() {
        for (int i = 0; i < LIST.length; i++) {
            System.out.println(LIST[i]);
        }
    }

    //Сумма затрат на ЗП
    private static int sumSalary(){
        int sum = 0;
        for (int i = 0; i < LIST.length; i++) {
            sum = sum + LIST[i].getSalary();
        }
        return sum;
    }

    private static int minSalary() {
        String minSalaryName = null;
        int minSalary = LIST[0].getSalary();
        for (int i = 0; i < LIST.length; i++) {
            if (LIST[i].getSalary() < minSalary) {
                minSalary = LIST[i].getSalary();
                minSalaryName = LIST[i].getName();
            }
        }
        return minSalary;
    }

    private static int maxSalary() {
        String maxSalaryName = null;
        int maxSalary = 0;
        for (int i = 0; i < LIST.length; i++) {
            if (LIST[i].getSalary() > maxSalary) {
                maxSalary = LIST[i].getSalary();
                maxSalaryName = LIST[i].getName();
            }
        }
        return maxSalary;
    }

    private static float avarageSalary() {
        float avarageSum = (float) sumSalary() / LIST.length;
        return avarageSum;
    }

    private static void fioEmployee() {
        for (int i = 0; i < LIST.length; i++) {
            System.out.println("Ф.И.О. сотрудника - " + LIST[i].getName());
        }
    }
}
