package mx.edu.j2se.Gaona.tasks;
import java.util.ArrayList;

public class ArrayTaskList extends Task{
    Task task;
    int size;
    ArrayList<Task> lista = new ArrayList<>();
    int i;

    ArrayTaskList(String title, int time) {
        super(title, time);
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Task> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Task> lista) {
        this.lista = lista;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Task getTask(int i){
        return lista.get(i);
    }


    public void add (Task task){
        for(int index=0;index<size;index++){
            if(lista.get(index) ==null){
                lista.set(index, task);
            }
            else{

            }
        }
    }

    public boolean remove(Task task){
        if(task==null){
            for(int index=0;index<size;index++){
                if (lista.get(index) == null){
                    System.out.println("No existe objeto en ste indice");
                    return true;
                }
                else{

                }
            }
        }
        else{
            for(int index=0;index<size;index++){
                if (task.equals(lista.get(index))){
                    lista.set(index, null);
                    return true;
                }
            }

        }
        return false;
    }

    public int size(){
        size = lista.size();
        return size;
    }

    @Override
    public String toString(){
        return title;
    }
}
