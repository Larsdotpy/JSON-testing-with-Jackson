package ModerateJsonTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class JacksonTestModerate {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_moderate.json");
    ModerateJson moderateJson = objectMapper.readValue(file, ModerateJson.class);

    public JacksonTestModerate() throws IOException {
    }

    @Test
    public void assertEqualsStringFromJson() {
        Assertions.assertEquals("Hello, JSON!", moderateJson.getMyString());
    }

    @Test
    public void assertEqualsNumberFromJson() {
        Assertions.assertEquals(42, moderateJson.getMyNumber());
    }

    @Test
    public void assertEqualsBooleanFromJson() {
        Assertions.assertTrue(moderateJson.getMyBoolean());
    }

    @Test
    public void assertEqualsNullValueFromJson() {
        Assertions.assertNull(moderateJson.getMyNullValue());
    }

    @Test
    public void assertEqualsArrayFromJson() {
        Assertions.assertArrayEquals(new Object[]{1, 2, 3, "four", false}, moderateJson.getMyArray());
    }

    @Test
    public void assertEqualsObjectFromJson() {
        Assertions.assertEquals("This is a nested string", moderateJson.getMyObject().getNestedString());
        Assertions.assertEquals(123.45, moderateJson.getMyObject().getNestedNumber());
        Assertions.assertTrue(moderateJson.getMyObject().getNestedBoolean());
    }

    @Test
    public void assertEqualsSpecialCharactersFromJson() {
        Assertions.assertEquals("!@#$%^&*()", moderateJson.getMySpecialCharacters());
    }

    @Test
    public void assertEqualsUnicodeCharacterFromJson() {
        Assertions.assertEquals("\u00A9", moderateJson.getMyUnicodeCharacter());
    }

    @Test
    public void assertEqualsEscapeCharactersFromJson() {
        Assertions.assertEquals("This string has a \"quote\" and a newline\n", moderateJson.getMyEscapeCharacters());
    }

    @Test
    public void assertEqualsDateFromJson() {
        //Datum in JSON ophalen en vervolgens via date format een string datum aanmaken en checken
        String actualDate = moderateJson.getMyDate();
        LocalDate actualDateFormat = LocalDate.parse(actualDate);
        LocalDate expectedDate = LocalDate.parse(LocalDate.of(2023, 7, 20).toString());

        Assertions.assertEquals(expectedDate, actualDateFormat);
    }

    @Test
    public void assertEqualsTimeFromJson() {
        //Tijd in JSON ophalen en vervolgens via time format een string tijd aanmaken en checken
        String actualTime = moderateJson.getMyTime();
        LocalTime actualTimeFormat = LocalTime.parse(actualTime);
        LocalTime expectedTime = LocalTime.parse(LocalTime.of(15, 30, 0).toString());

        Assertions.assertEquals(expectedTime, actualTimeFormat);
    }

    @Test
    public void assertEqualsDateTimeFromJson() {
        //Datumtijd in JSON ophalen en vervolgens via datetime format een string datumtijd aanmaken en checken
        String actualDateTime = moderateJson.getMyDatetime();
        ZonedDateTime actualDateTimeFormat = ZonedDateTime.parse(actualDateTime);
        ZonedDateTime expectedDateTime = ZonedDateTime.parse(ZonedDateTime.of(2023, 7, 20, 15,
                30, 0, 0, ZoneOffset.UTC).toString());

        Assertions.assertEquals(expectedDateTime, actualDateTimeFormat);
    }

    @Test
    public void assertEqualsUrlFromJson() throws MalformedURLException {
        Assertions.assertEquals(new URL("https://example.com").toString(), moderateJson.getMyUrl());
    }

    @Test
    public void assertEqualsArrayFromJsonIsEmpty() {
        Assertions.assertEquals(0, moderateJson.getMyEmptyArray().length);
    }

    // Empty object number is 0.0 and not null. Somehow empty numbers inside the object are always 0.0, and not null
    // Empty object boolean is false and not null. Somehow empty booleans inside the object are always false, and not null.
    @Test
    public void assertEqualsObjectFromJsonIsEmpty() {
        Assertions.assertAll("Empty Object",
                () -> Assertions.assertNull(moderateJson.getMyEmptyObject().getNestedString(), "NestedString should be null"),
                () -> Assertions.assertEquals(0.0, moderateJson.getMyEmptyObject().getNestedNumber(), "NestedNumber should be empty (0.0)"),
                () -> Assertions.assertFalse(moderateJson.getMyEmptyObject().getNestedBoolean(), "NestedBoolean should be empty (false)")
        );
    }

    @Test
    public void assertEqualsNotationFromJson(){
        double expectedNotation = 1.23e6;
        Assertions.assertEquals(expectedNotation, moderateJson.getMyScientificNotation());
    }
}