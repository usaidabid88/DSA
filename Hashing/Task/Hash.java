// Interface defining standard Hash Table operations
public interface Hash {

    Object get(Object key); // Retrieves the value associated with the given key

    Object put(Object key, Object value); // Inserts or updates a key-value pair in the hash table

    Object remove(Object key); // Removes the key-value pair associated with the given key

    int size(); // Returns the number of entries in the hash table

}
