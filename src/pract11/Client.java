package pract11;

public class Client implements Chair{
    public Chair chair;

    public void sit() {
        System.out.println("Сел на " + this.chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
