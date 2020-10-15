public class Printer implements Visitor {
  @Override
  public void visit(Interval interval) {
    System.out.println(interval);
  }

  @Override
  public void visit(Activity activity) {
    System.out.println(activity);
  }
}