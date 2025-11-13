package manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Task> tasks;

    public Manager(){
        tasks = new ArrayList<>();
    }

    public void addNewTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(int id){
        tasks.removeIf(task -> task.getId() == id);
    }

    public void updateTask(int id, String description, String changeStatus, LocalDate updateAt){
        for (Task task : tasks) {
            if(task.getId() == id){
                task.setDescription(description);
                task.changeStatus(changeStatus);
                task.setUpdateAt(updateAt);
            }
        }
    }
}
