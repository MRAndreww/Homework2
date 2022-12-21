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
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat+ 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat+ 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friends = 19;
        System.out.println(friends);
        friends = friends * 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
            }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Вес первого боксера равен " + boxerWeight1 + " кг");
        System.out.println("Вес второго боксера равен " + boxerWeight2 + " кг");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Вес двух боксеров равен " + totalWeight + " кг");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе равна " + weightDifference + " кг");
                   }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference = boxerWeight2 - boxerWeight1;
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе равна " + weightDifference + " кг");
        System.out.println("Разница в весе равна " + weightDifference2 + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalTime = 640;
        var personalTime = 8;
        var personalTotal = totalTime / personalTime;
        System.out.println("Всего работников в компании - " + personalTotal + " человек");
        var newPersonalTotal = personalTotal + 94;
        var newTotalTime = personalTime * newPersonalTotal;
        System.out.println("Если в компании работает " + newPersonalTotal + " человек, то всего " + newTotalTime + " часов работы может быть поделено между сотрудниками" );

    }
}