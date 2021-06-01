package compare.graphics;

import compare.Example;
import toollib.StdDraw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class InsertionGraphic extends ExampleGraphics {
    public static void sort(Comparable a[]){
        StdDraw.clear();
        drawArray(a);
        int N=a.length;
        for(int i=0;i<N;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exchGrapchics(a,j,j-1);
            }
        }
    }

}
