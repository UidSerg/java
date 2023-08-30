package controlRab;

public class Toy {
    private int id;
    private String name;
    private int count;
    private int rand;


    public Toy() {
    }

    public Toy(int id, String name, int count, int rand) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.rand = rand;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", rand=" + rand +
                '}';
    }
}
