package longChallenge.October2020;

import java.util.Scanner;

public class CVDRUN {

    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] N = new int[T];
        int[] K = new int[T];
        int[] X = new int[T];
        int[] Y = new int[T];
        for(int i=0;i<T;i++){
            sc.nextLine();
            N[i]=sc.nextInt();
            K[i]=sc.nextInt();
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
        }
        for(int i=0;i<T;i++){
            if(returnAns(N[i],K[i],X[i],Y[i])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();

    }
    public static boolean returnAns(int N,int K, int X, int Y){
        int temp=(X+K)%N;
      //  System.out.println("Inside Condition: "+ temp);
        while((temp!=X) && (temp!=Y)){
            temp=(temp+K)%N;
       //     System.out.println("temp: "+temp);
        }
        return temp != X;
    }
}
