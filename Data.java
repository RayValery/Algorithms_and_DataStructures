public class Data {

    private String name;
    private int course;
    private Boolean army;

    public Data()
    {
        name = "";
        course = 0;
        army = false;
    }

    public Data(String name, int course, Boolean army)
    {
        this.name = name;
        this.course = course;
        this.army = army;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Boolean getArmy() {
        return army;
    }

    public void setArmy(Boolean army) {
        this.army = army;
    }
}

