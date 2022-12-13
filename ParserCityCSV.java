import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class ParserCityCSV implements ParserCity{
    @Override
    public List<City> parseToList(InputStream inputStream) {


        Scanner scanner = new Scanner(inputStream);
        return null;
    }
}
