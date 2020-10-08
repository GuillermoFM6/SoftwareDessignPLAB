import java.time.LocalDateTime;
import java.util.*;

abstract class Activity {
  private String name;
  private LocalDateTime initialDate;
  private LocalDateTime finalDate;
  private double duration;


  public Activity(String name){
    this.name = name;

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

}
