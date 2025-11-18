import manager.Manager;

public class App {
    public static void main(String[] args){
        Manager manager = new Manager();
        switch (args[0]) {
            case "addTask":
                if (args.length >= 3) {
                    manager.addNewTask(args[1], args[2]);
                    System.out.println("Tarea agregada con éxito!");
                }
                break;
             
                
            case "listTasks":
                manager.listTasks();
                break;
            
            case "listPending":
                manager.listPendingTasks();
                break;
            
            case "listInProgress":
                manager.listInProgressTasks();
                break;
            
            case "listDone":
                manager.listDoneTasks();
                break;
            
            case "changeStatus":
                if (args.length >= 3) {
                    manager.changeTaskStatus(args[1], args[2]);
                } else {
                    System.out.println("Uso: changeStatus <id> <estado>");
                    System.out.println("Estados disponibles: ip (en progreso), dn (completada)");
                }
                break;
        
            default:
                System.out.println("Comando no reconocido: " + args[0]);
                break;
        }
    }
}

