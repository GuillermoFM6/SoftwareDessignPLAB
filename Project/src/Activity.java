import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

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

  public void update(LocalDateTime actualDate){
    finalDate = actualDate;
    System.out.println(this);

  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return "activity: " + name + "    " + initialDate.format(formatter) + "    " + finalDate.format(formatter) + "   " + duration;
  }

}
