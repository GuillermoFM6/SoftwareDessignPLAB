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
    clock.start();
    wait(11);
    clock.stop();
  }
}
