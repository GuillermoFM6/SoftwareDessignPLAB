import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity {
  private List<Interval> intervals= new ArrayList<Interval>();
  private Interval interval = new Interval(this);
  private boolean firstTime = true;

  public Task(String name, Project antecesor) {
    super(name, antecesor);
  }


  public void start() {
    System.out.println(this.getName() + " starts");
    interval.start();
    if(firstTime) {
      initialDate = interval.getInitialDate();
      firstTime = false;
    }
  }


  public void stop() {
    interval.stop();
    intervals.add(interval);
    System.out.println(this.getName() + " stops");
  }


}
