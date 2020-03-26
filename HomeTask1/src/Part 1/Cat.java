public class Cat implements JumpAndRun{
    @Override
    public void run() {
        System.out.println("Кот бегает");
    }

    @Override
    public void jump(){
        System.out.println("Кот прыгает.");
    }
}
