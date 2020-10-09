import java.time.*;
import java.util.*;

public class Project extends Activity{

  private List<Activity> activities = new ArrayList<Activity>();

  public Project(String name, Project antecesor) {
    super(name, antecesor);
  }


  public void addActivity(Activity activity) {
    activities.add(activity);
  }
  public void deleteActivity(Activity activity) {
    activities.remove(activity);
  }



}
