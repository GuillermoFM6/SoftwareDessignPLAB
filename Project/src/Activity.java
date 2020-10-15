import java.time.*;
import java.time.format.DateTimeFormatter;
//lol
abstract class Activity {
  protected String name;
  protected Project project;
  protected LocalDateTime initialDate;
  protected LocalDateTime finalDate;
  protected boolean firstTime;
  protected long duration;


  public Activity(String name, Project antecesor){
    this.name = name;
    this.project = antecesor;
    this.firstTime = true;
    if (project != null) {
      project.addActivity(this);
    }

  }

  public String getName(){
    return name;
  }

  public void update(LocalDateTime actualDate){
    finalDate = actualDate;
    duration += 2;
    if (project != null) {
      this.accept(new Printer());
      project.update(actualDate);
    }
    else {
      this.accept(new Printer());
    }

  }

  protected void InitialTime() {
    if (firstTime) {
      initialDate = LocalDateTime.now();
      firstTime = false;
      if(project != null)
        project.InitialTime();
    }
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return String.format("%-8s%-25s%-30s%-30s%-1s","activity: ", name, initialDate.format(formatter), finalDate.format(formatter), duration);
  }

}
