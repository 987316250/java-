import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public double perfectNumber()
    {
        for(int i=1;i<=1000;++i)
        {
            int sum=0;
            for(int j=1;j<i;++j)
            {
                if(i%j==0)
                    sum+=j;
            }
            if(sum==i)
            {
                System.out.println(sum);
            }

        }
        return 1;
    }
    public double divide () throws Exception
    {
        Scanner in=new Scanner(System.in);
        double A=in.nextDouble();
        double B=in.nextDouble();
        double C=0;
        return A/B;
    }

    public void compute()
    {
        double sum=0;
        for(int i=1;i<=2018;++i)
        {
            sum+=1/i;
        }
        System.out.println(sum);
    }
    public void computer()
    {
        Random random=new Random();
         int A[][]=new int[6][5];
         int B[][]=new int[6][5];
         int C[][]=new int[6][5];
         for(int i=0;i<6;++i)
         {
             for(int j=0;j<5;++j)
             {
                 A[i][j]=random.nextInt();
                 B[i][j]=random.nextInt();
             }
         }
        for(int i=0;i<6;++i)
        {
            for(int j=0;j<5;++j)
            {
                C[i][j]=A[i][j]-B[i][j];
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Main m=new Main();
        m.perfectNumber();

    }
}
