
package enumclassactivity;


public class Task {
    private String taskName;
    private Priority priority;
    private Status status;

     public Task(String taskName, Priority priority, Status status) {
        this.taskName = taskName;
        this.priority = priority;
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }
@Override
public String toString() {
    return "Task Name: " + taskName + ", Priority: " + priority + ", Status: " + status;
}
     
}

