import java.util.*;
import java.time.*;

public class Clock extends Observable{
  private LocalDateTime date;
  private Timer timer;
  private int period; //seconds

  public Clock(int period) {
    this.period = period;
    this.timer = new Timer();
  }

  public void start() {
    TimerTask repeatedTask = new TimerTask() {
      public void run() {
        date = LocalDateTime.now();
        notifyObservers(date);
        System.out.println("run() done on " + date);
      }
    };
    timer.scheduleAtFixedRate(repeatedTask, 0, 1000 * period);
  }
  public void stop() {timer.cancel();}
  public int getPeriod() {return period;}
  public LocalDateTime getDate() {return date;}

}
