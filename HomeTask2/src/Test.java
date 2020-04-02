import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws MyArraySizeException {
        String[][] arr = new String[4][4];
        try {
            arrayMethod(arr);
            throw new MyArrayDataException();
        } catch (MyArrayDataException e){
            System.out.println("Все ОК");
        }

    }


    public static void sumArray(String[][] arr2){
        int sum = 0;
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++) {
                try {
                    int num = Integer.parseInt(arr2[i][j]);
                    sum += num;
                } catch (NumberFormatException ex) {
                    System.out.println("NumberFormatException: " + arr2[i][j]);
                }
//                try {
//                    throw new MyArrayDataException("ParseInt Error");
//                    int awesomeParsedInteger = Integer.parseInt(arr2[i][j]);
//                    if (awesomeParsedInteger != int)
//                        sum += awesomeParsedInteger;
//                    System.out.println(awesomeParsedInteger);
//                }catch (MyArrayDataException e){
//                    System.out.println("Catch block");
                }
        }
        System.out.println("Сумма = " + sum);

    }



    public static void arrayMethod(String[][] arr1) throws MyArraySizeException {
        if (Arrays.deepEquals(arr1, new String[4][4])) {
            System.out.println("Все успешно");
            String[] td = {"12", "6", "435", "11"};
            String[] td2 = {"14", "3", "8", "72"};
            String[] td3 = {"voice", "7", "9", "0"};
            String[] td4 = {"c", "o", "9", "90"};
            arr1[0] = td;
            arr1[1] = td2;
            arr1[2] = td3;
            arr1[3] = td4;
            sumArray(arr1);
        }else {
            throw new MyArraySizeException("Illegal count of bounds in array.");
        }
    }
}
class MyArraySizeException extends Exception{

    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends NumberFormatException{

}
