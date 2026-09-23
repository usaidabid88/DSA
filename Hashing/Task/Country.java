
// Country class demonstrating hash table usage with custom objects
public class Country {

    String name;       // Country name
    String language;   // Primary language
    long population;   // Population count

    // Constructor to initialize country attributes
    public Country(String name, String language, long population) {
        this.name = name;
        this.language = language;
        this.population = population;
    }

    public static void main(String[] args) {
        HashMethods ht = new HashMethods();

        // Add countries with country code as key
        ht.put("PK", new Country("Pakistan", "Urdu", 331000000));
        ht.put("IN", new Country("India", "Hindi", 38000000));

        // Retrieve and print country data
        Country pk = (Country) ht.get("PK");
        if (pk != null) {
            System.out.println("Pakistan: " + pk.name + ", " + pk.language + ", " + pk.population);
        }

        Country in = (Country) ht.get("IN");
        if (in != null) {
            System.out.println("India: " + in.name + ", " + in.language + ", " + in.population);
        }

        // Print table size
        System.out.println("Size: " + ht.size());

        // Check hash bucket index for keys
        System.out.println("Hash code of 'PK': " + ht.hash("PK"));
        System.out.println("Hash code of 'IN': " + ht.hash("IN"));

        // Remove an entry and print updated size
        ht.remove("PK");
        System.out.println("After removing Pakistan, Size: " + ht.size());
    }

}
