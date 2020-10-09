import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

abstract class Activity {
  private String name;
  protected Project project;
  protected LocalDateTime initialDate;
  protected LocalDateTime finalDate;
  protected long duration;


  public Activity(String name, Project antecesor){
    this.name = name;
    this.project = antecesor;
    this.duration = 0;

  }

  public void setInitialDate(LocalDateTime initialDate) {
    this.initialDate = initialDate;
  }

  public void setFinalDate(LocalDateTime finalDate) {
    this.finalDate = finalDate;
  }

  public String getName(){
    return name;
  }

  @Override
  public String toString() {
    return "activity: " + name + "    " + initialDate + "    " + finalDate + "   " + duration;
  }

}
