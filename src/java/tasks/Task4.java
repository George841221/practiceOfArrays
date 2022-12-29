package tasks;

import herper.HelperMethods;
import herper.MyArrays;

public class Task4 {

    /** 4.
     Az előző feladat megoldását módosítsd úgy, hogy nem véletlenszerű számokat adsz hozzá a tömbhöz,
     hanem a felhasználótól kérsz öt számot, és a tömb elemei legyenek ezek a számok.
     Ezután írd ki a képernyőre a tömb elemeit, és kérdezd meg a felhasználót,
     hogy melyik elemet szeretné felcserélni és milyen számmal! Végezd el a cserét!
     (Például a felhasználó azt írja, hogy az 1. elemet szeretné felcserélni az 5-ös számmal.)
     */

    public int[] topUpMyArr(int[] arr) {
        int number = 0;
        System.out.println("Please, enter five numbers: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(++number + ". number: ");
            arr[i] = HelperMethods.sc().nextInt();
        }

        return arr;
    }



    public int[] changingNum(int[] arr) {
        System.out.print("which index would you like to change: ");
        int index = HelperMethods.sc().nextInt();;
        index--;
        System.out.print("which number would you like? ");
        int otherNum = HelperMethods.sc().nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = otherNum;
            }
        }
            return arr;
    }
}
