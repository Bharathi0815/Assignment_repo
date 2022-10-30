import java.util.Scanner;

public class Learn3Djagarray {
    public static void main(String[] args) {
        int[][][] ar = new int[3][][];
        ar[0]=new int[2][3];
        ar[1]=new int[3][4];
        ar[2]=new int[1][5];


        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < ar.length; ++i) {
            for(int j = 0; j < ar[i].length; ++j) {
                for(int k = 0; k < ar[i][j].length; ++k) {
                    System.out.println("Enter the House Numbers for Phase " + i + " and Block " + j);

                    ar[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Here is the Result");

        for(int i = 0; i < ar.length; ++i) {
            for(int j = 0; j < ar[i].length; ++j) {
                for(int k = 0; k < ar[i][j].length; ++k) {
                    System.out.print(ar[i][j][k] + " ");
                }

                System.out.println();
            }
        }

    }
}

