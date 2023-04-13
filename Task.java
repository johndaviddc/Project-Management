public class Task {
    private String name;
    private String description;
    private boolean completed;
    
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
    }
    
    public void markComplete() {
        completed = true;
    }
    
    public void markIncomplete() {
        completed = false;
    }
    
    public String toString() {
        String status = completed ? "Complete" : "Incomplete";
        return name + " (" + status + "): " + description;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isCompleted() {
        return completed;
    }
}
