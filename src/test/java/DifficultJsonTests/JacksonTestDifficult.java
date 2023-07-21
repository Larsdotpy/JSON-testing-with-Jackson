package DifficultJsonTests;

import ModerateJsonTests.ModerateJson;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JacksonTestDifficult {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);



    public JacksonTestDifficult() throws IOException {
    }


    @Test
    public void appNameEqualsUltraComplexApp(){
        Assertions.assertEquals("Ultra Complex App", jsonData.getMetadata().getApp().getName());
    }

    @Test
    public void appVersionEqualsThreeZeroOneBeta(){
        Assertions.assertEquals("3.0.1-beta", jsonData.getMetadata().getApp().getVersion());
    }

    @Test
    public void appDescriptionEqualsAHighlyComplexAndDeeplyNestedJsonExampleForDemonstrationPurposes(){
        Assertions.assertEquals("A highly complex and deeply nested JSON example for demonstration purposes.",
                jsonData.getMetadata().getApp().getDescription() );
    }

    @Test
    public void authorNameEqualsJaneSmith(){
        Assertions.assertEquals("Jane Smith", jsonData.getMetadata().getAuthor().getName());
    }


    //Assertions doen per elke single node in de JSON file
    //Daarna test cases met het aanpassen van bijvoorbeeld de naam en dan assert equals de nieuwe naam
    //Om te checken of de nieuwe naam goed wordt opgepakt door de json etc.






    @Test
    public void firstUserameEqualsAlice(){
        Assertions.assertEquals("Alice", jsonData.getData().getUsers().get(0).getProfile().getFirstName());
    }

    @Test
    public void secondUserameEqualsBob(){
        Assertions.assertEquals("Bob", jsonData.getData().getUsers().get(1).getProfile().getFirstName());
    }



}
