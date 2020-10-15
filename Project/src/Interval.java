import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Interval implements Observer {
  private final Task task;
  private LocalDateTime initialDate;
  private LocalDateTime finalDate;
  private final Clock clock = new Clock(2);
  private long duration;

  public Interval(Task task) {
    this.task = task;
    clock.addObserver(this);
  }

  public void start(){
    clock.start();
    initialDate = LocalDateTime.now();
  }
  public void stop() {
    clock.stop();
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public void update(Observable o, Object value) {
    finalDate = clock.getDate();
    duration += 2;
    this.accept(new Printer());
    task.update(finalDate);

  }
  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return String.format("%-35s%-30s%-30s%-1s","interval: ", initialDate.format(formatter), finalDate.format(formatter), duration);
  }
}
