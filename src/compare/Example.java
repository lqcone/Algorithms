package compare;

public class Example {

   public  static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }
   public  static void exch(Comparable a[],int x,int y){
        Comparable tmp=a[x];
        a[x]=a[y];
        a[y]=tmp;
    }
}
