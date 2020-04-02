import java.util.*;

public class MainClass {


    public static void main(String[] args) {
        List<String> arrayOfWords = new ArrayList<>(Arrays.asList("Животное", "Человек", "Машина", "Сказка", "Площадь", "Работа",
                "Бульдог", "Окорок", "Объект", "Логопед", "Кролик", "Человек", "Сказка", "Грузовик", "Гриб", "Работа", "Жук",
                "Логопед", "Волейбол", "Шайба", "Роль", "Площадь", "Повар", "Шоколад", "Гриб", "Бульдог", "Кровать", "Ложка",
                "Подушка", "Трон", "Машина", "Животное", "Окунь", "Правда", "Роль", "Логопед", "Жук", "Ложка"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : arrayOfWords){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println();

        Set<String> stringHashSet = new HashSet<>(arrayOfWords);
        System.out.println(stringHashSet);

//        HashMap<String, String> clients = new HashMap<>();
//        clients.put("Agureev", "89105674352");
//        clients.put("Loskov", "89107894323");
//        clients.put("Eremeev", "89108995432");
//        clients.put("Loskov", "89103124564");
//        clients.put("Andreev", "89107890090");
//        clients.put("Agureev", "89167445888");
//        clients.put("Korolev", "89108906543");
//        System.out.println(clients.get("Agureev"));
//

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Agureev", "89105674352");
        phoneBook.add("Loskov", "89107894323");
        phoneBook.add("Eremeev", "89108995432");
        phoneBook.add("Loskov", "89103124564");
        phoneBook.add("Andreev", "89107890090");
        phoneBook.add("Agureev", "89167445888");
        phoneBook.add("Korolev", "89108906543");

        System.out.println(phoneBook.get("Agureev"));
        System.out.println(phoneBook.get("Loskov"));
        System.out.println(phoneBook.get("Korolev"));
    }
}