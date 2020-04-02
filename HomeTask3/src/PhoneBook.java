import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook_1 = new HashMap<>();
    private List <String> phone_number_list;

    public void add(String name, String phoneNumber){
        if(phoneBook_1.containsKey(name)){
            phone_number_list = phoneBook_1.get(name);
            phone_number_list.add(phoneNumber);
            phoneBook_1.put(name, phone_number_list);
        }else{
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phoneNumber);
            phoneBook_1.put(name, phone_number_list);
        }
    }
    public List<String> get (String name){
        return phoneBook_1.get(name);
    }
}
