package compare.graphics;

import toollib.StdDraw;

public class ShellGraphics extends ExampleGraphics{
    public static void  sort(Comparable a[]){
        StdDraw.clear();
        drawArray(a);
        int N=a.length;
        int h=1;
        while(h<N/3) h=h*3+1;
        while(h>=1){
            for(int i=0;i<N;i+=h){
                for(int j=i;j>0&&less(a[j],a[j-h]);j-=h){
                    exchGrapchics(a,j,j-h);
                }
            }
            h=h/3;
        }
    }
}
