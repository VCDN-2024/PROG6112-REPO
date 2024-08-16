
package enumclassactivity;
 enum Priority {
    LOW, MEDIUM, HIGH;
}

 enum Status {
    NOT_STARTED, IN_PROGRESS, COMPLETED;
}

public class EnumClassActivity {
  public static void main(String[]args)
  {
    TaskManager manager = new TaskManager();

    manager.addTask("Finished Classwork", Priority.HIGH, Status.COMPLETED);
       manager.addTask("Go for Workshop", Priority.MEDIUM, Status.NOT_STARTED);
            manager.addTask("Go to Gym", Priority.LOW, Status.NOT_STARTED);
            
        System.out.println("All Tasks:");
        manager.displayTasks();

  
}
}
