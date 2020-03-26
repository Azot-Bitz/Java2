public class MainClass3 {


    public static void main(String[] args) {
        Participants [] participantsArray = new Participants[3];
        participantsArray[0] = new Participants(1, "James Wood", 26, 10, 20);
        participantsArray[1] = new Participants(2, "Michael Ray", 34, 9, 13);
        participantsArray[2] = new Participants(3, "David Kooper", 30, 14, 7);

        Obstacles [] obstaclesArray = new Obstacles[3];
        obstaclesArray[0] = new Obstacles(1);
        obstaclesArray[1] = new Obstacles(2);
        obstaclesArray[2] = new Obstacles(3);

        for (int i = 0; i < participantsArray.length; i++) {
            if(participantsArray[i].getMaxJumpHeight() > obstaclesArray[0].getHeight() &&
                    participantsArray[i].getMaxRunLength() > obstaclesArray[0].getLength()){
                System.out.println("Участник " + participantsArray[i].getName() + " прошел препятсвие " + obstaclesArray[0].getName());
            }else{
                System.out.println("Участник " + participantsArray[i].getName() + " не прошел препятсвие " + obstaclesArray[0].getName());
            }
        }

        for (int i = 0; i < participantsArray.length; i++) {
            if(participantsArray[i].getMaxRunLength() > obstaclesArray[1].getLength()){
                System.out.println("Участник " + participantsArray[i].getName() + " прошел препятсвие " + obstaclesArray[1].getName());
            }else{
                System.out.println("Участник " + participantsArray[i].getName() + " не прошел препятсвие " + obstaclesArray[1].getName());
            }
        }

        for (int i = 0; i < participantsArray.length; i++) {
            if(participantsArray[i].getMaxJumpHeight() > obstaclesArray[2].getHeight()){
                System.out.println("Участник " + participantsArray[i].getName() + " прошел препятсвие " + obstaclesArray[2].getName());
            }else{
                System.out.println("Участник " + participantsArray[i].getName() + " не прошел препятсвие " + obstaclesArray[2].getName());
            }
        }

    }
}
