package compare;

public class Shell extends Example{
    static void  sort(Comparable a[]){
        int N=a.length;
        int h=1;
        while(h<N/5) h=h*3+1;
        while(h>=1){
            for(int i=0;i<N;i+=h){
                for(int j=i;j>0&&less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h=h/4;
        }
    }
}
