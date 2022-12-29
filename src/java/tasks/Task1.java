package tasks;

import herper.MyArrays;

public class Task1 {

    /** 1.
     Hozz létre az alábbi típusú tömbökből egyet-egyet! Mindegyik hossza legyen legalább 2.
     ●	int[] ints = new int[2];
     ●	float[] floats = new float[2];	// és így tovább
     ●	boolean[]
     ●	char[]
     ●	String[]
     ●	Integer[]

     Írd ki a képernyőre mindegyik tömb első és utolsó elemét!
     Mit ír ki a program? És miért?
     */

    public int[] numsArr() {
        return MyArrays.ints;
    }

    public float[] floatsArr() {
        return MyArrays.floats;
    }

    public boolean[] booleansArr() {
        return MyArrays.booleans;
    }

    public char[] charsArr() {
        return MyArrays.chars;
    }

    public String[] strArr() {
        return MyArrays.strings;
    }

    public Integer[] integersArr() {
        return MyArrays.integers;
    }
}
