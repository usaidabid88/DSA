// Demo driver testing basic operations on HashMethods implementation
public class Main {
    public static void main(String[] args) {
        // Instantiate hash table
        HashMethods hash = new HashMethods();

        // 1. Test put method — insert key-value pairs
        hash.put("key1", "value1");
        hash.put("key2", "value2");
        hash.put("key3", "value3");

        // 2. Test size method — should report 3 entries
        System.out.println("Size: " + hash.size());

        // 3. Test get method — retrieve values by key
        System.out.println("Get key1: " + hash.get("key1"));
        System.out.println("Get key2: " + hash.get("key2"));
        System.out.println("Get key3: " + hash.get("key3"));

        // 4. Test remove method — delete an existing key
        System.out.println("Remove key2: " + hash.remove("key2"));
        System.out.println("Size after remove: " + hash.size());

        // 5. Test get after remove (safely returns null when key not found)
        Object result = hash.get("key2");
        System.out.println("Get key2 after remove: " + result);
    }
}