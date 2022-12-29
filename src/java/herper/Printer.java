package herper;

import tasks.*;

import java.util.Arrays;

public class Printer {
    public static int taskNum= 0;

    private static final Task1 task1 = new Task1();
    private static final Task2 task2 = new Task2();
    private static final Task3 task3 = new Task3();
    private static final Task4 task4 = new Task4();
    private static final Task5 task5 = new Task5();
    private static final Task6 task6 = new Task6();

    public static void printingTasks() {
        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        System.out.println(Arrays.toString(task1.numsArr()));
        System.out.println(Arrays.toString(task1.floatsArr()));
        System.out.println(Arrays.toString(task1.booleansArr()));
        System.out.println(Arrays.toString(task1.charsArr()));
        System.out.println(Arrays.toString(task1.strArr()));
        System.out.println(Arrays.toString(task1.integersArr()));

        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        System.out.println(Arrays.toString(task2.numsArr(MyArrays.ints)));
        System.out.println(Arrays.toString(task2.floatsArr(MyArrays.floats)));
        System.out.println(Arrays.toString(task2.booleansArr(MyArrays.booleans)));
        System.out.println(Arrays.toString(task2.charsArr(MyArrays.chars)));
        System.out.println(Arrays.toString(task2.strArr(MyArrays.strings)));
        System.out.println(Arrays.toString(task2.integersArr(MyArrays.integers)));

        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        task3.together();
        System.out.println();

        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        System.out.println(Arrays.toString(task4.topUpMyArr(MyArrays.newNumArr )));
        System.out.println(Arrays.toString(task4.changingNum(MyArrays.newNumArr)));
        System.out.println();

        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        System.out.println(task5.anyNumInArr(MyArrays.newNumArr));
        System.out.println();

        System.out.println();
        System.out.println("---------- Task " + ++taskNum + ". ----------");
        System.out.println(Arrays.toString(MyArrays.newNumArr));
        System.out.println("A tömböm számai összeadva: " + task6.addedArrNums(MyArrays.newNumArr));
        System.out.println();

        taskNum = 0;
        System.out.println();
        System.out.println("---------- Diligence task " + ++taskNum + ". ----------");
        System.out.println();
        System.out.println("W = white Field!" + "\nB = black field!");
        System.out.println();
        DiligenceTask1.print(DiligenceTask1.whiteOrBlack1);
        System.out.println();

        System.out.println();
        System.out.println("---------- Diligence task " + ++taskNum + ". ----------");
        System.out.println();
        DiligenceTask2.floorChecker(MyArrays.houseFloors);
        System.out.println();
    }
}
