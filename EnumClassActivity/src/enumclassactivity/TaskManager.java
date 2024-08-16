
package enumclassactivity;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> taskList;
   
    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(String taskName, Priority priority, Status status) {
        Task newTask = new Task(taskName, priority, status);
        taskList.add(newTask);
    }

     public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

  
}
