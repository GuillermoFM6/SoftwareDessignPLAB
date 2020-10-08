import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity {
  private List<Interval> intervals = new ArrayList<Interval>();
  private double duration;

  public Task(String name) {
    super(name);
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public long CalculateTaskDuration() {
    long sum = 0;
    for (Interval interval : intervals) {
      sum += Duration.between(interval.getInitialDate(), interval.getFinalDate()).getSeconds();
    }
    return sum;
  }

  public void addInterval(Interval interval) {
    intervals.add(interval);
  }


}
