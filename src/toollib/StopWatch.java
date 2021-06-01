package toollib;

public class StopWatch {
    double startTime;
    public StopWatch(){
        startTime=System.currentTimeMillis();
    }
    public double elaspsedTime(){
        double endTime=System.currentTimeMillis();
        return endTime-startTime;
    }
}
