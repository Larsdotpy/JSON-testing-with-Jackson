package JavaStreams;

import DifficultJsonTests.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class WindowedOperations {

    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public WindowedOperations() throws IOException {
    }


}