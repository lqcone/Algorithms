package compare;

public class Selection extends Example{



    public static void sort(Comparable a[]){
        int N=a.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[i]))
                    exch(a,i,j);
            }
        }
    }

}
