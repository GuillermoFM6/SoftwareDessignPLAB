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
    final int period = 2; // seconds
    Clock clock = new Clock(period);
    Task task = new Task("transportation");
    System.out.println("start test");
    System.out.println(task.getName() + " starts");
    clock.start();
    task.setInitialDate(clock.getDate());
    System.out.println(task.getName());
    wait(4);
    clock.stop();
    task.setFinalDate(clock.getDate());
  }
}
