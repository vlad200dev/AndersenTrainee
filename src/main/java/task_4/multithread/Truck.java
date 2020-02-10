package task_4.multithread;

public class Truck {
    private int id;
    private String good;

    public Truck(int id, String good) {
        this.id = id;
        this.good = good;
    }

    public int getId() {
        return id;
    }

    public String getGood() {
        return good;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", good='" + good + '\'' +
                '}';
    }
}
