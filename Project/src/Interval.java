import java.time.Duration;
import java.time.LocalDateTime;

public class Interval {
  private LocalDateTime initialDate;
  private LocalDateTime finalDate;
  private  Clock clock = new Clock(2);

  public Interval() {

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
  public String toString() {
    return "interval:       "  + initialDate + "    " + finalDate + "   " + Duration.between(initialDate, finalDate);
  }
}
