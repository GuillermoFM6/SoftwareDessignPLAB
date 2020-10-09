import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity {
  private Interval interval = new Interval(this);

  public Task(String name, Project antecesor) {
    super(name, antecesor);
  }

  public Interval getInterval(){
    return interval;
  }

  public void start() {
    interval.start();
    initialDate = interval.getInitialDate();
  }

  public void stop() {
    interval.stop();
    finalDate = interval.getInitialDate();

  }


}
