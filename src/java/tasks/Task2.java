package tasks;

public class Task2 {

    /**2.
     Módosítsd az előző feladatot úgy, hogy mindegyik tömb első elemének te adsz értéket!
     Írd ki a képernyőre újra a tömbök első és utolsó elemeit! Mi változott?
     Például:
     int[] ints = new int[2];
     ints[0] = 42;
     */

    public int[] numsArr(int[] arr) {
        arr[0] = 12;
    return arr;
    }

    public float[] floatsArr(float[] arr) {
        arr[0] = 18;
        return arr;
    }

    public boolean[] booleansArr(boolean[] arr) {
        arr[0] = true;
        return arr;
    }

    public char[] charsArr(char[] arr) {
        arr[0] = 'b';
        return arr;
    }

    public String[] strArr(String[] arr) {
        arr[0] = "tralalala";
        return arr;
    }

    public Integer[] integersArr(Integer[] arr) {
        arr[0] = 5478;
        return arr;
    }
}
