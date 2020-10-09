import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Interval implements Observer {
  private Task task;
  private LocalDateTime initialDate;
  private LocalDateTime finalDate;
  private  Clock clock = new Clock(2);

  public Interval(Task task) {
    this.task = task;
  }
  public LocalDateTime getInitialDate() {return initialDate;}

  public LocalDateTime getFinalDate() {return finalDate;}

  public void start(){
    clock.start();
    initialDate = LocalDateTime.now();
  }
  public void stop() {
    clock.stop();
    finalDate = clock.getDate();

  }

  @Override
  public void update(Observable o, Object value) {
    task.duration += 2;

  }
  @Override
  public String toString() {
    return "interval:                   "  + initialDate + "    " + finalDate + "   " + Duration.between(initialDate, finalDate);
  }
}
