import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Interval implements Observer {
  private Task task;
  private LocalDateTime initialDate;
  private LocalDateTime finalDate;
  private  Clock clock = new Clock(2);
  private long duration;

  public Interval(Task task) {
    this.task = task;
    clock.addObserver(this);
  }
  public LocalDateTime getInitialDate() {return initialDate;}

  public LocalDateTime getFinalDate() {return finalDate;}

  public void start(){
    clock.start();
    initialDate = LocalDateTime.now();
  }
  public void stop() {
    clock.stop();
  }

  @Override
  public void update(Observable o, Object value) {
    task.duration += 2;
    finalDate = clock.getDate();
    duration += 2;
    System.out.println(this);
    task.update(finalDate);

  }
  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return "interval:                   "  + initialDate.format(formatter) + "    " + finalDate.format(formatter) + "   " + duration;
  }
}
