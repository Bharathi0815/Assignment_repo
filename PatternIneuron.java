
public class PatternIneuron {

    public static void main(String[] args) {
        int n=10;

        for(int i=0;i<=n;i++)
        {

            for(int j=0;j<=n;j++)
            {
                if(i==0 || i==n|| j==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");


            for(int j=0;j<=n;j++)
            {
                if(j==0|| j==n || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }

            System.out.print("  ");



            for(int j=0;j<=n;j++)
            {

                if(i==0||i==n || j==0 && i<=n || (i==n/2 && j<=n/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");
            for(int j=0;j<=n;j++)
            {
               // if(j==n/4 && i<(3*n)/4 || j==(3*n)/4 && i<(3*n)/4 || j>n/4 && j<(3*n)/4 && i==(3*n)/4)
                   // if (j == 0 && i < (3 * n) / 4 || j == (3 * n) / 4 && i < (3 * n) / 4 || j > 0 && j < (3 * n) / 4 && i == (3 * n) / 4)
               // if (j == 0 && i < (3 * n) / 4 || j == n && i < (3 * n) / 4 || j > 0 && j<n && i == (3 * n) / 4)
                if (j == 0 && i < n-1 || j == n && i < n-1 || j > 0 && j<n && i == n-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            for(int j=0;j<=n;j++)
            {
                if(j==0||i==0 && j<n/2 || j==n/2 && i<n/2 && i>0 || i==n/2 && j<n/2|| i-j==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print(" ");

            for(int j=0;j<=n;j++)
            {
                // if((j>n/4 && j<(3*n)/4 && i==n/4) || (i==(3*n)/4 && j>n/4 && j<(3*n)/4) || (i>n/4 && i<(3*n)/4 && j==n/4)
              // if((i==n/4 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>n/4 && i<(3*n)/4)||(i==(3*n)/4 && j>n/4 && j<(3*n)/4)
                //        ||(j==(3*n)/4 && i>n/4 && i<(3*n)/4))
               // if((i==0 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>0 && i<(3*n)/4)||(i==(3*n)/4 && j>n/4 && j<(3*n)/4)
                 //       ||(j==(3*n)/4 && i>0 && i<(3*n)/4))
                if((i==0 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>0 && i<n)||(i==n && j>n/4 && j<(3*n)/4)
                        ||(j==(3*n)/4 && i>0 && i<n))

                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print(" ");

            for(int j=0;j<=n;j++)
            {
                if(j==0|| j==n || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }



            System.out.println();

        }





    }

}
