public class Main {
    public static void main(String[] args) {
        //Введение переменных (Задача 1)
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Сумма (Задача 2)
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Вычитание (Задача 3)
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Деление (Задача 4)
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Все операции (Задача 5)
        var frog = 3.5;
        System.out.println(frog);
        frog = frog  * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Сумма и разница (Задача 6)
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        //Сумма:
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес бойцов - " + totalWeight + "кг");
        //Разница:
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе у бойцов - " + weightDifference + "кг");

        //Разница в весе (Задача 7)
        weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе у бойцов - " + weightDifference + "кг (вычитание из большего веса меньшего)");
        weightDifference = boxerTwo % boxerOne;
        System.out.println("Разница в весе у бойцов - " + weightDifference + "кг (остаток из деления)");
        }
    }