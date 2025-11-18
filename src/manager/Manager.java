package manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Task> tasks;

    public Manager(){
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks(){
        return tasks;
    }
    //--------------------------------------------------
    public void addNewTask(String id, String description){
        Task task = new Task(id, description);
        tasks.add(task);
    }

    public void deleteTask(String id){
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public void updateTask(String id, String description, String changeStatus, LocalDate updateAt){
        for (Task task : tasks) {
            if(task.getId().equals(id)){
                task.setDescription(description);
                task.changeStatus(changeStatus);
                task.setUpdateAt(updateAt);
            }
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas disponibles.");
            return;
        }
        
        System.out.println("\n=== Lista de Tareas ===");
        for (Task task : tasks) {
            System.out.println("ID: " + task.getId());
            System.out.println("Descripción: " + task.getDescription());
            System.out.println("Estado: " + task.getStatus());
            System.out.println("Creada: " + task.getCreatedAt());
            System.out.println("Actualizada: " + task.getUpdateAt());
            System.out.println("-".repeat(40));
        }
    }
}
