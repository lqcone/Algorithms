package compare;
import compare.graphics.InsertionGraphic;
import compare.graphics.SelectionGraphics;
import compare.graphics.ShellGraphics;
import toollib.StdRandom;
import toollib.StopWatch;

import java.util.Arrays;

public class SortCompare {
    public static double timeRandomInput(String alg,int N,int T){
        double total=0;
        Double a[]=new Double[N];
        for(int t=0;t<T;t++){
            //生成一个N大小的随机double型数组
            for(int i=0;i<N;i++){
                a[i]= StdRandom.uniform();
            }
            total+=time(alg,a);
        }
        return total;
    }
    public static double time(String alg,Comparable a[]){
        StopWatch timer=new StopWatch();
        if(alg.equals("Selection")) {
            System.out.println("选择排序之前数组："+ Arrays.toString(a));
            Selection.sort(a);
            System.out.println("选择排序之后的数组"+Arrays.toString(a));
        }
        else if(alg.equals("Insertion")){
            System.out.println("插入排序之前数组："+ Arrays.toString(a));
            Insertion.sort(a);
            System.out.println("插入排序之后的数组"+Arrays.toString(a));
        }
        else if(alg.equals("Shell")) {
            System.out.println("希尔排序之前数组："+ Arrays.toString(a));
            Shell.sort(a);
            System.out.println("希尔排序之后的数组"+Arrays.toString(a));

        }
        else if(alg.equals("InsertionGraphics")) {
            InsertionGraphic.sort(a);
        }
        else if(alg.equals("SelectionGraphics")){
            SelectionGraphics.sort(a);
        }
        else if(alg.equals("ShellGraphics")){
            ShellGraphics.sort(a);
        }


            return timer.elaspsedTime();
    }

    public static void main(String[] args) {


        String alg1=args[0];
        String alg2=args[1];
        int N=Integer.parseInt(args[2]);
        int T=Integer.parseInt(args[3]);

        double t1=timeRandomInput(alg1,N,T);
        double t2= timeRandomInput(alg2,N,T);
        System.out.println(alg1+"："+t1/1000+"秒");
        System.out.println(alg2+"："+t2/1000+"秒");
        System.out.println(alg1+"是"+alg2+"运行速度的 "+t2/t1+"倍");

    }
}
