package ss4_class_object_in_java.bai_tap.bai_2_xay_dung_lop_stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
    
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        setStartTime(System.currentTimeMillis());
    }
    public void stop() {
        setEndTime(System.currentTimeMillis());
    }
    public long getElapsedTime() {
        return getEndTime()-getStartTime();
    }
    
}
