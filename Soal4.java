import java.lang.Math;
public class Soal4
{
    public static void main(String [] args)
    {
        int i,j;
        for (i=0; i<11; i++){
            for (j=0; j<5; j++)
            {
                if((i%2)!=1)
                {
                    System.out.print(i*j +"\t");
                }else {
                    System.out.print(Math.pow(i,j) +"\t");
                }
            }
            System.out.println();
        }
    }
}