import java.util.HashMap;
import java.util.Map;

public class home_5 {
    public static void main(String[] args) {
        Map<String, String> telekniga = new HashMap<>();
        telekniga.put("9155550255", "Sergey");
        telekniga.put("9250181109", "Sergey");
        telekniga.put("9873239099", "Sergey");
        telekniga.put("9157771234", "Anton");
        telekniga.put("9134550255", "Pavel");
        telekniga.put("9185340255", "Sergey");
        telekniga.put("9189991123", "Anton");
        telekniga.put("9298341276", "Pavel");
        telekniga.put("9287771236", "Pavel");
        telekniga.put("9903338171", "Igor");
        telekniga.put("9876663124", "Igor");
        telekniga.put("9092311131", "Anna");
        telekniga.put("9098743376", "Anna");
        System.out.println(telekniga.toString());
        System.out.println();
        telekniga.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
