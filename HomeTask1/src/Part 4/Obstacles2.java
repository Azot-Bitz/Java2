public class Obstacles2 {
    private String name;
    private int length;
    private int height;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Obstacles2(int id){
        if(id == 1){
            this.name = "Moat";
            this.length = 12;
            this.height = 4;
        }else if(id == 2){
            this.name = "Treadmill";
            this.length = 17;
        }else if (id == 3){
            this.name = "Wall";
            this.height = 13;
        }
    }
}

