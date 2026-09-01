
// Hash_methods class implements the Hash interface using an array-backed hash table
public class Hash_methods implements Hash {

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

    // Retrieves the value associated with the given key (returns null if key not found)
    public Object get(Object key) {
        int h = hash(key); // Compute the bucket index
        if (entries[h] == null) {
            return null; // Key not present in the table
        }
        return entries[h].value; // Return the value at this slot
    }

    // Inserts or updates a key-value pair in the hash table
    public Object put(Object key, Object value) {
        int h = hash(key); // Compute the bucket index
        if (entries[h] != null) {
            Object oldVal = entries[h].value; // Save existing value
            entries[h] = new Entry(key, value); // Overwrite with new entry
            return oldVal; // Return the previous value
        }
        entries[h] = new Entry(key, value); // Place new entry in empty slot
        size++; // Increment the size counter
        return null; // No previous value existed
    }

    // Removes the key-value pair associated with the given key
    public Object remove(Object key) {
        int h = hash(key); // Compute the bucket index
        if (entries[h] == null) {
            return null; // Key not present in the table
        }
        Object temp = entries[h].value; // Store the value before deletion
        entries[h] = null; // Clear the slot
        size--; // Decrement the size counter
        return temp; // Return the removed value
    }

}
