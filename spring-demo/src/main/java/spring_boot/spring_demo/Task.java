package spring_boot.spring_demo;

public class Task {
    private int id;
    private String name;
    public Task(int i, String string) {
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Task []";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
