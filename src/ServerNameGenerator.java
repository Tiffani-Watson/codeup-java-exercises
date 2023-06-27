import java.util.Random;
public class ServerNameGenerator {
    private static final String[] adjectives = {
            "dedicated", "powerful", "secure", "reliable", "efficient",
            "innovative", "agile", "dynamic", "resilient", "scalable"
    };

    private static final String[] nouns = {
            "server", "network", "cloud", "data", "system",
            "application", "database", "firewall", "storage", "router"
    };

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;

        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }

    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}


