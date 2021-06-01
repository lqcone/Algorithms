package compare.graphics;

import compare.Example;
import toollib.StdDraw;

import java.awt.*;

public class ExampleGraphics extends Example {
    public static void exchGrapchics(Comparable a[],int x,int y){
        drawClearArray(a,x);
        drawClearArray(a,y);

        exch(a,x,y);
        drawArray(a,x);
        drawArray(a,y);
    }
    public static void drawArray(Comparable a[]){
        try{Thread.sleep(50);
        }catch(InterruptedException e){}
        StdDraw.clear();
        int N=a.length;
        double width = 0.1 / N;

        for (int i = 0; i < N; i++) {
            //乘以1.0为的是将其变为double类型
            double x = 1.0 * i / N;
            double y = (double)a[i]/3;


            double high = (double)a[i]/3;
            StdDraw.filledRectangle(x, y, width, high);
        }
    }
    public static void drawArray(Comparable a[],int f,int s){
        drawClearArray(a,f);

        int N=a.length;
        double width = 1.0 / N;
        double x = 1.0 * f / N;
        double y = (double)a[f]/3;
        double high = y;
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledRectangle(x, y, width, high);

        drawClearArray(a,s);
        x = 1.0 * s / N;
        y = (double)a[s]/3;
        high = y;
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledRectangle(x, y, width, high);
    }
    public static void drawArray(Comparable a[],int n){
        int N=a.length;
        double width = 0.1 / N;
        double x = (1.0 * n / N);
        double y = (double)a[n]/3;
        double high = y;
        StdDraw.setPenColor(Color.blue);
        StdDraw.filledRectangle(x, y, width, high);
        try{Thread.sleep(10);
        }catch(InterruptedException e){}

    }
    public static void drawClearArray(Comparable a[],int f){
        int N=a.length;
        double width = 0.5 / N;
        double x = (1.0 * f / N);
        double y = (double)a[f]/3;
        double high = y;
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledRectangle(x, y, width, high);
    }
}
