package JavaStreams;

import DifficultJsonTests.JsonData;
import DifficultJsonTests.Orders;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCollectors {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);


    public CustomCollectors() throws IOException {
    }



}

