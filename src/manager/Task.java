package manager;

import java.time.LocalDate;

enum Status {
    PENDING,
    IN_PROGRESS,
    DONE
}

public class Task {
    private int id;
    private String description;
    private Status status;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Task(int id, String description){
        this.id = id;
        setDescription(description);
        status = Status.PENDING;
        createdAt = LocalDate.now();
        updateAt = LocalDate.now();
    }
    //--------------------------------------------------
    public int getId() {
        return id;
    }
    public LocalDate getCreatedAat(){
        return createdAt;
    }
    //--------------------------------------------------
    public void setDescription(String description){
        this.description = description;
    }
    public String getDesCription(){
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
        }
    }
}
