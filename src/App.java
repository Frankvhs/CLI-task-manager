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
        
            default:
                System.out.println("Comando no reconocido: " + args[0]);
                break;
        }
    }
}

