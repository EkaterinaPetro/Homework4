public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int age = 20;

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int temp = 10;

        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int speed = 65;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int age = 5;

        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");

        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");

        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");

        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 15;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе.");

        } else if (age >=5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении \n" +
                    "            взрослого. Если взрослого нет, то кататься нельзя.");

        } else System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");

    }

    public static void task6 () {
        System.out.println("Задача 6");

        int passenger = 103;

        if (passenger >= 1 && passenger <= 60) {
            System.out.println("Есть свободное сидячее место");

        } else if (passenger > 60 && passenger <= 102) {
            System.out.println("Есть свободное стоячее место");

        } else if (passenger > 102) {
            System.out.println("Свободных мест нет");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
       /* int maxOfOneAndTwo;
        if (one > two) {
            maxOfOneAndTwo = one;
        } else {
            maxOfOneAndTwo = two;
        }
        if (three > maxOfOneAndTwo) {
            System.out.println(three);
        } else {
            System.out.println(maxOfOneAndTwo);
        }*/
    }
}