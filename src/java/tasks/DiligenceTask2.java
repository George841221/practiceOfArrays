package tasks;

import herper.HelperMethods;

public class DiligenceTask2 {

    /**
     * 2. (Tömb és elágazás)
     * Egy utcában 10 ház van, a házak mindegyike 1 vagy 5 emeletből állnak.
     * Készítsd el ezt az utcán a programban úgy, hogy a házak emeletének véletlenszerűen
     * generálsz emeleteket.
     * Menj végig az utcán (egyesével végiglépkedhetsz a tömbön), és ha olyan házhoz érsz, ahol
     * páros számú emelet van, akkor írd ki a képernyőre, hogy “szeretem a páros számot!” - ha
     * pedig páratlan számú emelet van, akkor azt, hogy “ó jaj”.
     */

    public static void floorChecker(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
            int houseNumber = i + 1;
            arr[i] = HelperMethods.ran().nextInt(5) + 1;
            System.out.println();
            if (arr[i] % 2 == 0) {
                System.out.print("Az utca " + houseNumber + ". házában " + arr[i] +
                        " emelet található!" + " Szeretem a páros számot!");
            }else System.out.print("Az utca " + houseNumber + ". házában " + arr[i] +
                    " emelet található!" + " Ó jaj");
        }

    }
}
