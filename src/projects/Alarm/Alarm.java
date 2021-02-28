package projects.Alarm;

import java.time.LocalDate;
import java.time.LocalDateTime;
//
import java.time.LocalTime;
/**
 *
 * @author Tumi
 */
public abstract class Alarm {
    
   private LocalDate date;
   private LocalDateTime dateAndTime;
   
   private LocalTime time;

   protected void setTime(LocalTime time){
       this.time = time;
   }
   protected void setDate(LocalDate date){
       this.date = date;
   }
   protected void setDateAndTime(LocalDateTime dateAndTime){
       this.dateAndTime = dateAndTime;
   }
   public LocalDate getDate(){
       return this.date;
   }
   public LocalDateTime getDateAndTime(){
       return this.dateAndTime;
   }
   public LocalTime getTime(){
       return this.time;
   }
   @Override
   public String toString(){
       return "date : "+getDate() +"\ndateAndTime : "+ getDateAndTime()
               +"\ntime : "+ getTime();
   }
}
