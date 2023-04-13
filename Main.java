public class Main {
    public static void main(String[] args) {
        ProjectManagementSoftware software = new ProjectManagementSoftware();
        
        Project project1 = new Project("Project 1", "Description for Project 1");
        project1.addTask(new Task("Task 1", "Description for Task 1"));
        project1.addTask(new Task("Task 2", "Description for Task 2"));
        
        Project project2 = new Project("Project 2", "Description for Project 2");
        project2.addTask(new Task("Task 1", "Description for Task 1"));
        project2.addTask(new Task("Task 2", "Description for Task 2"));
        project2.addTask(new Task("Task 3", "Description for Task 3"));
        
        software.addProject(project1);
        software.addProject(project2);
        
        software.showProjects();
        
        project1.showTasks();
        
        Task task1 = project1.getTasks().get(0);
        task1.markComplete();
        
        project1.showTasks();
    }
}
