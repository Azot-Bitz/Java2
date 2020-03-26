public class Participants {
    private int id;
    private String name;
    private int age;
    private int maxJumpHeight;
    private int maxRunLength;

    public Participants(int id, String name, int age, int maxJumpHeight, int maxRunLength){
        this.id = id;
        this.name = name;
        this.age = age;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public void setMaxRunLength(int maxRunLength) {
        this.maxRunLength = maxRunLength;
    }
}
