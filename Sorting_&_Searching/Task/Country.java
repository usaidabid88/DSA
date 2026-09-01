
// Country class representing country data and demonstrating hash table storage
public class Country {

    String name;       // Name of the country
    String language;   // Official/primary language
    long population;   // Total population

    // Constructor to initialize Country attributes
    public Country(String name, String language, long population) {
        this.name = name;
        this.language = language;
        this.population = population;
    }

    public static void main(String[] args) {
        // Create hash table instance for storing country records
        Hash_methods ht = new Hash_methods();

        // 1. Insert country records with ISO country code as key
        ht.put("PK", new Country("Pakistan", "Urdu", 331000000));
        ht.put("IN", new Country("India", "Hindi", 38000000));

        // 2. Retrieve and print country details by key
        Country pk = (Country) ht.get("PK");
        if (pk != null) {
            System.out.println("Pakistan: " + pk.name + ", " + pk.language + ", " + pk.population);
        }

        Country in = (Country) ht.get("IN");
        if (in != null) {
            System.out.println("India: " + in.name + ", " + in.language + ", " + in.population);
        }

        // 3. Display current size of the hash table
        System.out.println("Size: " + ht.size());

        // 4. Inspect calculated hash bucket index for each key
        System.out.println("Hash code of 'PK': " + ht.hash("PK"));
        System.out.println("Hash code of 'IN': " + ht.hash("IN"));

        // 5. Test removing an entry (safe removal of non-existing key returns null)
        ht.remove("Canada");
        System.out.println("After removing Canada, Size: " + ht.size());
    }

}
