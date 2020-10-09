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
    Project project = new Project("root", null);
    Task task = new Task("transportation", project);
    project.addActivity(task);
    System.out.println("                                          initial date                final date");
    System.out.println("start test");
    System.out.println(task.getName() + " starts");
    task.start();
    wait(4);
    task.stop();



  }
}
