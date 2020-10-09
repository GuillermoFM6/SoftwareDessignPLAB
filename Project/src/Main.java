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
    Task task = new Task("transportation", null);
    System.out.println("                                          initial date                final date");
    System.out.println("start test");
    task.start();
    wait(4);
    task.stop();



  }
}
