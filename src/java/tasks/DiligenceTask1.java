package tasks;

public class DiligenceTask1 {

    private static final char[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    public static char[] whiteOrBlack1 = new char[8];

    private static char[][] chessboard(){
        return new char[8][8];
    }

    private static void columnName(){
        System.out.print("   ");
        for (char value : DiligenceTask1.columns) {

            System.out.print("  " + value);
        }
    }

    public static void print(char[] columns2) {
        columnName();
        System.out.println();
        System.out.print("   --------------------------");
        System.out.println();

        for (int i = 0; i < chessboard().length; i++) {
            int columname = i + 1;
            System.out.print(columname + " |");

            for (int j = 0; j < columns2.length; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    columns2[j] = 'B';
                }else if (i % 2 == 0) {
                    columns2[j] = 'W';
                } else if(j % 2 == 0) {
                    columns2[j] = 'B';
                }else {
                    columns2[j] = 'W';
                }

                System.out.print("  " + columns2[j]);
            }
            System.out.print("  | " + columname );
            System.out.println();
        }
        System.out.print("   --------------------------");
        System.out.println();
        columnName();
    }
}
