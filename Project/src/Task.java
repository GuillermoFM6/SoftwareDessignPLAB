import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity {
  private List<Interval> intervals= new ArrayList<Interval>();
  private Interval interval = new Interval(this);

  public Task(String name, Project antecesor) {
    super(name, antecesor);
  }


  public void start() {
    interval.start();
  }


  public void stop() {
    interval.stop();
    intervals.add(interval);
  }


}
