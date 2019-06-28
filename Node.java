public class Node extends Data {

    private Node next;
    private Node previous;

    private Data myStudent = new Data();

    public Node(Data Student)
    {
        this.myStudent.setArmy(Student.getArmy());
        this.myStudent.setCourse(Student.getCourse());
        this.myStudent.setName(Student.getName());
        this.next = null;
        this.previous = null;
    }

    public String valueName()
    {
        return myStudent.getName();
    }

    public int valueCourse()
    {
        return myStudent.getCourse();
    }

    public Boolean valueArmy()
    {
        return myStudent.getArmy();
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Data getMyStudent() {
        return myStudent;
    }

    public void setMyStudent(Data myStudent) {
        this.myStudent = myStudent;
    }




    @Override
    public String toString() {
        return "Name: " + myStudent.getName() +
                "\nCourse: " + myStudent.getCourse() +
                "\nArmy: " + myStudent.getArmy() + "\n";
    }
}

