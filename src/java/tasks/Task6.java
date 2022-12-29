package tasks;

public class Task6 {

    /** 6.
     Használhatod újra az előző feladatokban létrehozott tömböt.
     Add össze a tömb minden elemét, és az eredményt írd ki a képernyőre!
     */

    public int addedArrNums(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            counter += i;
        }
        return counter;
    }
}
