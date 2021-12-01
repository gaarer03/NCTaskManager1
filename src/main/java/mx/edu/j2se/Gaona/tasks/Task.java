package mx.edu.j2se.Gaona.tasks;
import java.util.Scanner;
import java.util.*;

public class Task {
    String title;
    boolean active;
    int start;
    int time;
    int end;
    int veces;
    int current;
    int interval;

    Task(String title, int time){
        this.title=title;
        this.time=time;
    }

    Task(String title, int start, int end, int interval){
        this.title=title;
        this.start=start;
        this.end=end;
    }

    String getTitle(){
        return title;
    }

    void setTitle(String title){

    }

    boolean isActive(){
        return active;
    }

    void setActive(boolean active){

    }

    int getTime(){
        return start;
    }

    void setTime(int time){

    }

    int getStartTime(){
        return time;
    }

    int getEndTime(){
        return end;
    }

    int getRepeatInterval(){
        if (end==0){
            return 0;
        }else{
            return 1;
        }
    }

    void setTime(int start, int end, int interval){

    }

    public boolean isRepeated(){
        return isActive();
    }

    public int nextTimeAfter(int current){
        this.current = current;
        if(time==0){
            if(current > start && current < end){
                System.out.println("Cuantas repeticiones faltan: ");
                Scanner console = new Scanner(System.in);
                veces = Integer.parseInt(console.nextLine());
                if (veces>0){
                    current=start + interval;
                    if(current > 2400){
                        current = current - interval;
                        System.out.println("La actividad empezará a las: " + current);

                    }else{
                        System.out.println("La actividad empezará a las: " + current);
                    }
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }else{
            return 0;
        }
        return 0;
    }

}
