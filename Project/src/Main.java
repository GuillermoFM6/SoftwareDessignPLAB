import java.time.LocalDateTime;

public class Main {
  private static void wait(int seconds ) {
    try {
      Thread.sleep(1000 * seconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {

    Task task = new Task("transportation");
    Interval interval = new Interval();
    System.out.println("                                          initial date                final date");
    System.out.println("start test");
    System.out.println(task.getName() + " starts");
    interval.start();
    wait(4);
    interval.stop();
    task.addInterval(interval);
    System.out.println(interval);

  }
}
