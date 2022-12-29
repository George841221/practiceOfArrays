package tasks;

import herper.HelperMethods;

import java.util.Arrays;

public class Task5 {

    /** 5.
     Az előző feladatokban létrehozott tömböt használd!
     Írd ki a képernyőre a tömb egyik véletlenszerűen kiválasztott elemét!
     */

    public int anyNumInArr(int[] arr){
        System.out.println(Arrays.toString(arr));
        int anyNum = HelperMethods.ran().nextInt(4);
        System.out.println("The random index is: " + anyNum);
        int myNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == anyNum) {
                myNum = arr[i];
            }
        }
        System.out.println("the number on the random generated index: " + myNum);
        return myNum;
    }
}
