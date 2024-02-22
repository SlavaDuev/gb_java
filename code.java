import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        // Создание и заполнение телефонной книги
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Alice", Arrays.asList("123456", "789012"));
        phoneBook.put("Bob", Arrays.asList("789012"));
        phoneBook.put("Charlie", Arrays.asList("111111", "222222", "333333"));
        phoneBook.put("Alice", Arrays.asList("999999")); // Добавление ещё одного номера для Алисы

        // Создание списка для сортировки
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        // Сортировка списка по убыванию количества телефонных номеров
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Вывод отсортированных результатов
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
