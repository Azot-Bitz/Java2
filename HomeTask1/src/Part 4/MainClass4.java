public class MainClass4 {
    public static int counter;
    public static int counter2;
    public static int counter3;


    public static void main(String[] args) {
        Participants2 [] participantsArray = new Participants2[3];
        participantsArray[0] = new Participants2(1, "James Wood", 26, 10, 20);
        participantsArray[1] = new Participants2(2, "Michael Ray", 34, 10, 13);
        participantsArray[2] = new Participants2(3, "David Kooper", 30, 8, 16);

        Obstacles2 [] obstaclesArray = new Obstacles2[3];
        obstaclesArray[0] = new Obstacles2(1);
        obstaclesArray[1] = new Obstacles2(2);
        obstaclesArray[2] = new Obstacles2(3);

        for (int i = 0; i < obstaclesArray.length; i++) {
            if(participantsArray[0].getMaxJumpHeight() > obstaclesArray[i].getHeight() &&
                    participantsArray[0].getMaxRunLength() > obstaclesArray[i].getLength()){
                counter++;
                System.out.println("Участник " + participantsArray[0].getName() + " прошел препятсвие " + obstaclesArray[i].getName());
            }else{
                System.out.println("Участник " + participantsArray[0].getName() + " не прошел препятсвие " + obstaclesArray[i].getName());
                break;
            }
        }
        System.out.println("Участник " + participantsArray[0].getName() + " прошел " + counter + " препятствия.");

        for (int i = 0; i < obstaclesArray.length; i++) {
            if(participantsArray[1].getMaxJumpHeight() > obstaclesArray[i].getHeight() &&
                    participantsArray[1].getMaxRunLength() > obstaclesArray[i].getLength()){
                counter2++;
                System.out.println("Участник " + participantsArray[1].getName() + " прошел препятсвие " + obstaclesArray[i].getName());
            }else{
                System.out.println("Участник " + participantsArray[1].getName() + " не прошел препятсвие " + obstaclesArray[i].getName());
                break;
            }
        }
        System.out.println("Участник " + participantsArray[1].getName() + " прошел " + counter2 + " препятствия.");

        for (int i = 0; i < obstaclesArray.length; i++) {
            if(participantsArray[2].getMaxJumpHeight() > obstaclesArray[i].getHeight() &&
                    participantsArray[2].getMaxRunLength() > obstaclesArray[i].getLength()){
                counter3++;
                System.out.println("Участник " + participantsArray[2].getName() + " прошел препятсвие " + obstaclesArray[i].getName());
            }else{
                System.out.println("Участник " + participantsArray[2].getName() + " не прошел препятсвие " + obstaclesArray[i].getName());
                break;
            }
        }
        System.out.println("Участник " + participantsArray[2].getName() + " прошел " + counter3 + " препятствия.");
//        for (int i = 0; i < participantsArray.length; i++) {
//            if(participantsArray[i].getMaxRunLength() > obstaclesArray[1].getLength()){
//                System.out.println("Участник " + participantsArray[i].getName() + " прошел препятсвие " + obstaclesArray[1].getName());
//            }else{
//                System.out.println("Участник " + participantsArray[i].getName() + " не прошел препятсвие " + obstaclesArray[1].getName());
//            }
//        }
//
//        for (int i = 0; i < participantsArray.length; i++) {
//            if(participantsArray[i].getMaxJumpHeight() > obstaclesArray[2].getHeight()){
//                System.out.println("Участник " + participantsArray[i].getName() + " прошел препятсвие " + obstaclesArray[2].getName());
//            }else{
//                System.out.println("Участник " + participantsArray[i].getName() + " не прошел препятсвие " + obstaclesArray[2].getName());
//            }
//        }

    }
}

