package longChallenge.October2020;

import java.util.Scanner;

public class CHEFEZQ {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            sc.nextLine();
            int N=sc.nextInt();
            int Q=sc.nextInt();
            sc.nextLine();
            System.out.println( returnAns(N,Q,sc));
        }
        sc.close();
    }

    public static int returnAns(int N, int Q, Scanner sc){
        int sum=0;
        int count=1;
        for(int i=0;i<N;i++){
            sum+=sc.nextInt();
            if(sum<Q){
                return count;
            }else{
                count++;
                sum-=Q;
            }
        }
      //  System.out.println("sum "+sum);
        return (count+(sum/Q));
    }
}
