import java.util.ArrayList;
import java.util.List;

public class ProjectManagementSoftware {
    private List<Project> projects;
    
    public ProjectManagementSoftware() {
        projects = new ArrayList<>();
    }
    
    public void addProject(Project project) {
        projects.add(project);
    }
    
    public void removeProject(Project project) {
        projects.remove(project);
    }
    
    public void showProjects() {
        for(Project project : projects) {
            System.out.println(project.getName());
        }
    }
    
    public List<Project> getProjects() {
        return projects;
    }
}
