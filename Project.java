import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private List<Task> tasks;
    
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.tasks = new ArrayList<>();
    }
    
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    public void removeTask(Task task) {
        tasks.remove(task);
    }
    
    public void showTasks() {
        for(Task task : tasks) {
            System.out.println(task);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public List<Task> getTasks() {
        return tasks;
    }
}