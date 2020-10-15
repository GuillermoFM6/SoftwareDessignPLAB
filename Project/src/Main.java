
public class Main {
  private static void wait(int seconds ) {
    try {
      Thread.sleep(1000 * seconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  private static void Test() {
    //creating hierarchy of projects and tasks

    Project root = new Project("root", null);
    Project software_design = new Project("software design", root);
    Project software_testing = new Project("software testing", root);
    Project databases = new Project("databases", root);
    Task transportation = new Task("transportation", root);
    Project problems = new Project("problems", software_design);
    Project project_time_tracker = new Project("project time tracker", software_design);
    Task first_list = new Task("first list", problems);
    Task second_list = new Task("second list", problems);
    Task read_handout = new Task("read handout", project_time_tracker);
    Task first_milestone = new Task("first milestone", project_time_tracker);


    System.out.println("                                          initial date                final date");
    System.out.println("start test");
    transportation.start();
    wait(4);
    transportation.stop();
    wait(2);
    first_list.start();
    wait(6);
    second_list.start();
    wait(4);
    first_list.stop();
    wait(2);
    second_list.stop();
    wait(2);
    transportation.start();
    wait(4);
    transportation.stop();
  }

  public static void main(String[] args) {
    Test();
  }
}
