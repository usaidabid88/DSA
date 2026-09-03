// HashMethods class implements the Hash interface using an array-backed hash table


public class HashMethods implements Hash {

    // Inner class Entry to store key-value pairs in the hash table
    private class Entry {
        private Object key;   // Stores the key for this entry
        private Object value; // Stores the value associated with the key

        // Constructor to create an Entry with a key-value pair
        public Entry(Object key, Object value) {
            this.key = key;      // Initialize the key
            this.value = value;  // Initialize the value
        }

    }

    // Sentinel value to represent a deleted entry
    private final Entry NIL = new Entry(null, null);

    // Array to store Entry objects (fixed size hash table with 11 slots)
    private Entry[] entries = new Entry[11];

    // Counter to track the number of entries currently in the hash table
    private int size;

    // Hash function to calculate the array index for a given key
    public int hash(Object key) {
        // Use bitwise AND with 0x7fffffff to ensure positive hash code, then modulo by array length
        return (key.hashCode() & 0x7fffffff) % entries.length;
    }

    // Returns the current number of entries in the hash table
    public int size() {
        return size; // Return the size counter
    }

    // Inserts or updates a key-value pair in the hash table
    public Object put(Object key, Object value) {
       int h = hash(key); // Compute the bucket index
       for(int i = 0; i < entries.length; i++){
        int j = (h + i) % entries.length; // Linear probing to find the next available slot
        Entry entry = entries[j]; // Get the entry at the computed index
        if(entry == null){ // If the slot is empty
            entries[j] = new Entry(key, value); // Create a new entry and place it in the slot
            size++; // Increment the size counter
            return null; // No previous value existed
        }
        throw new RuntimeException("Hash table is full"); // If the table is full, throw an exception
       }
       return null; // This line is unreachable but required for compilation
    }

    // Retrieves the value associated with the given key (returns null if key not found)
    public Object get(Object key) {
        int h = hash(key);
        for(int i = 0; i < entries.length; i++){
            int j = (h + i) % entries.length;
            Entry entry = entries[j];
            if(entry == null) break;
            if(entry == NIL) continue;
            if(entry.key.equals(key)) 
                return entry.value;
        }
        return null; 
    }

    // Removes the key-value pair associated with the given key
    public Object remove(Object key) {
        int h = hash(key);
        for(int i = 0; i < entries.length; i++){
            int j = (h + i) % entries.length;
            Entry entry = entries[j];
            if(entry == null) break;
            if(entry == NIL) continue;
            if(entry.key.equals(key)) {
                Object value = entry.value;
                entries[j] = NIL; // Mark as deleted
                size--;
                return value;
            }
        }
        return null; 
    }

}
