package compare.graphics;

import compare.SortCompare;

public class SortCompareGraphics extends SortCompare {

    public static void main(String[] args) {
        String alg1=args[0];
        String alg2=args[1];
        int N=Integer.parseInt(args[2]);
        int T=Integer.parseInt(args[3]);
        timeRandomInput(alg1,N,T);
        try{Thread.sleep(2000);
        }catch(InterruptedException e){}
        timeRandomInput(alg2,N,T);

    }
}
