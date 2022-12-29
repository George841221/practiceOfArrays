package tasks;

import herper.HelperMethods;
import herper.MyArrays;

import java.util.Arrays;

public class Task3 {

    /** 3.
     Hozz létre egy int[] típusú, 5 elemet tartalmazó tömböt, és mindegyik elemének adj értékül egy-egy véletlenszerű számot!
     Írd ki a képernyőre a tömböt!
     Ezután növeld meg az első elem értékét eggyel!
     Ismét írd ki a képernyőre a tömböt!
     */
   // protected int[] newNumArr;

    private int[] numsArr() {
        for (int i = 0; i < MyArrays.newNumArr.length; i++) {
            MyArrays.newNumArr[i] = HelperMethods.ran().nextInt(200);
        }
        return MyArrays.newNumArr;
    }

    private int[] firstIndexPlus(int[] nums) {
        nums[0]++;
        return nums;
    }

    public void together(){
        System.out.println(Arrays.toString(numsArr()));
        System.out.println(Arrays.toString(firstIndexPlus(MyArrays.newNumArr)));
    }
}
