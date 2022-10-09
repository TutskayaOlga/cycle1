public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    private static void task1() {
        System.out.println("ЗАДАЧА №1");
        System.out.println(" ");
        for (int i = 1; i <= 10; i++){
        System.out.println(i);
        }
        System.out.println(" ");
    }
    private static void task2() {
        System.out.println("ЗАДАЧА №2");
        System.out.println(" ");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" ");
    }
    private static void task3() {
        System.out.println("ЗАДАЧА №3");
        System.out.println(" ");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" ");
    }
    private static void task4() {
        System.out.println("ЗАДАЧА №4");
        System.out.println(" ");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println(" ");
    }
    private static void task5() {
        System.out.println("ЗАДАЧА №5");
        System.out.println(" ");
        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println(i);
        }
        System.out.println(" ");
}
    private static void task6() {
        System.out.println("ЗАДАЧА №6");
        System.out.println(" ");
        for (int i = 1; i < 99; i = i + 7){
            System.out.println(i);
        }
        System.out.println(" ");
    }
    private static void task7() {
        System.out.println("ЗАДАЧА №7");
        System.out.println(" ");
        int i = 1;
        for (int a = i; a < 513; a = a * 2){
            System.out.println(a);
        }
        System.out.println(" ");
    }
    private static void task8() {
        System.out.println("ЗАДАЧА №8");
        System.out.println(" ");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<13; i++){
            total = total + salary;
            int i1 = i + 1;
            //Не понимаю, как сделать так, чтобы первым месяцем не был 0
            System.out.println("Месяц " + i1 + ", сумма накоплений равна " + total + " рублей. ");
        }
        System.out.println(" ");
}
    private static void task9() {
        System.out.println("ЗАДАЧА №9");
        System.out.println(" ");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<13; i++){
            total = total + salary;
            total = total + total/100;
            //Не понимаю, как сделать так, чтобы первым месяцем не был 0
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей. ");
        }
        System.out.println(" ");
    }
}





