import java.util.ArrayList;
import java.util.List;

public class Task extends Activity {
  private final List<Interval> intervals;
  private Interval interval;
  public Task(String name, Project antecesor) {
    super(name, antecesor);
    intervals = new ArrayList<>();
  }


  public void start() {
    System.out.println(this.getName() + " starts");
    InitialTime();
    interval = new Interval(this);
    interval.start();
    intervals.add(interval);
  }


  public void stop() {
    interval.stop();
    System.out.println(this.getName() + " stops");
  }


}
