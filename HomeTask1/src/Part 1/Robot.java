public class Robot implements JumpAndRun{
    @Override
    public void run() {
        System.out.println("Робот бегает");
    }

    @Override
    public void jump(){
        System.out.println("Робот прыгает.");
    }
}
