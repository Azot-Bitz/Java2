public class Participant {
    private int maxJumpHeight;
    private int maxRunLength;
    private int id;

    public Participant(int id, int maxJumpHeight, int maxRunLength){
        this.id = id;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public boolean jump(){
        if (this.maxJumpHeight >= Wall.getWallHeight()) {
            System.out.println("Участник " + this.id + " перепрыгнул");
            return true;
        }else{
            System.out.println("Участнику " + this.id + " не удалось перепрыгнуть");
            return false;
        }
    }

    public boolean run(){
        if(this.maxRunLength >= Treadmill.getTreadmillLength()){
            System.out.println("Участник " + this.id + " пробежал");
            return true;
        }else{
            System.out.println("Участнику " + this.id + " не удалось пробежать");
            return false;
        }
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
