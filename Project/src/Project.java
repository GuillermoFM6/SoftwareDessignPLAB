import java.time.*;
import java.util.*;

public class Project extends Activity{

  private List<Activity> activities = new ArrayList<Activity>();

  public Project(String name, Project father) {
    super(name, father);
  }


  public void addActivity(Activity activity) {
    activities.add(activity);
  }
  public void deleteActivity(Activity activity) {
    activities.remove(activity);
  }



}
