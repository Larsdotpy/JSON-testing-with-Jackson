package JavaStreams;


import DifficultJsonTests.JsonData;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Distinct {

    @Test
    public void testDistinctUsernames() throws IOException {
        String filePath = "src/test/java/JSON_files/json_example_difficult.json";
        File file = new File("src/test/java/JSON_files/json_example_difficult.json");
        ObjectMapper objectMapper = new ObjectMapper();


        JsonData jsonData = objectMapper.readValue(file, JsonData.class);

        List<String> usernames = jsonData.getData().getUsers().stream()
                .map(Users::getUsername)
                .distinct().toList();

        assertEquals(usernames.size(), jsonData.getData().getUsers().size(), "Usernames are not unique.");
    }

}