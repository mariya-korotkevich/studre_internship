import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ParserCity parserCity = new ParserCityCSV();
        parserCity.parseToList(new FileInputStream("")).forEach(System.out::println);
    }
}
