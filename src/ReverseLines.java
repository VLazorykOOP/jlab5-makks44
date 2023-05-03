import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ReverseLines {

    public static void main(String[] args) {

        // Ввід та зчитування рядків з файлу в список LinkedList
        LinkedList<String> linesList = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Виведення рядків в файл у зворотному порядку
        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = linesList.size() - 1; i >= 0; i--) {
                String line = linesList.get(i);
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
