package compare.graphics;

import toollib.StdDraw;

public class SelectionGraphics extends ExampleGraphics{
    public static void sort(Comparable a[]){
        StdDraw.clear();
        drawArray(a);
        int N=a.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[i]))
                    exchGrapchics(a,i,j);
            }
        }
    }
}
