package hashmapshashfunctions.implementcustomhashmap;
public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.get("one")); // Output: 1
        map.remove("one");
        System.out.println(map.get("one")); // Output: null
    }
}

