public class Human implements JumpAndRun {
    @Override
    public void run() {
        System.out.println("Человек бегает");
    }

    @Override
    public void jump(){
        System.out.println("Человек прыгает.");
    }
}
