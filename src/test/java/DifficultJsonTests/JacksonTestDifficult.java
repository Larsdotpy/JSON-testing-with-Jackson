package DifficultJsonTests;

import ModerateJsonTests.ModerateJson;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonTestDifficult {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    ModerateJson moderateJson = objectMapper.readValue(file, ModerateJson.class);

    public JacksonTestDifficult() throws IOException {
    }




}
