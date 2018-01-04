public class Soal3
{
    public static void main (String [] args)
    {
        int i,j,k;
        k=6;
        for (i=0; i<=3; i++){
            for (j=(0+k); j<7; j++)
            {
                System.out.print("*");
            }
            k--;
            k--;
            System.out.println();
        }
    }
}