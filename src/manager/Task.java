package manager;

import java.time.LocalDate;

public class Task {
    private String id;
    private String description;
    private Status status;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Task(String id, String description){
        this.id = id;
        setDescription(description);
        status = Status.PENDING;
        createdAt = LocalDate.now();
        updateAt = LocalDate.now();
    }
    //--------------------------------------------------
    public String getId() {
        return id;
    }
    public LocalDate getCreatedAt(){
        return createdAt;
    }
    public Status getStatus(){
        return status;
    }
    //--------------------------------------------------
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setUpdateAt(LocalDate updateAt){
        this.updateAt = updateAt;
    }
    public LocalDate getUpdateAt(){
        return updateAt;
    }

    public void changeStatus(String changeStatusComand){
        switch (changeStatusComand) {
            case "ip":status = Status.IN_PROGRESS; break;
            case "dn":status = Status.DONE; break;
            default: System.out.println("Invalid status command");
        }
    }
}
