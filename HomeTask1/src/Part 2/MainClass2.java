public class MainClass2 {


    public static void main(String[] args) {
        Participant participant1 = new Participant(1,14, 8);
        Participant participant2 = new Participant(2,6, 9);
        Participant participant3 = new Participant(3,16, 15);

        participant1.jump();
        participant2.jump();
        participant3.jump();

        participant1.run();
        participant2.run();
        participant3.run();
    }
}
