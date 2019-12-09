package OOP;

public class StopWatch {
    private long startTime,endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long start(){
            startTime = System.currentTimeMillis();
            return startTime;
    }
    public long stop(){
            endTime = System.currentTimeMillis();
            return endTime;
    }
    public long getElapsedTime(){
            return getEndTime() - getStartTime();
    }

    public static void main(String[] args) {
        StopWatch DH = new StopWatch();
        DH.start();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(i);
        }
        DH.stop();
        System.out.println("Time Count : " + DH.getElapsedTime() + " milli seconds");
    }
}
