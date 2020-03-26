public class MainClass {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();
        human.jump();
        human.run();
        robot.jump();
        robot.run();
        cat.jump();
        cat.run();
    }

}
