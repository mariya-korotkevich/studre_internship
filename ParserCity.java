import java.io.InputStream;
import java.util.List;

public interface ParserCity {
    List<City> parseToList(InputStream inputStream);
}
