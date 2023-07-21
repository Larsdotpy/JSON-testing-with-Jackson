package DifficultJsonTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SimpleAssertions {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);



    public SimpleAssertions() throws IOException {
    }


    @Test
    public void appNameEqualsUltraComplexApp(){
        Assertions.assertEquals("Ultra Complex App", jsonData.getMetadata()
                .getApp()
                .getName());
    }

    @Test
    public void appVersionEqualsThreeZeroOneBeta(){
        Assertions.assertEquals("3.0.1-beta", jsonData.getMetadata()
                .getApp()
                .getVersion());
    }

    @Test
    public void appDescriptionEqualsAHighlyComplexAndDeeplyNestedJsonExampleForDemonstrationPurposes(){
        Assertions.assertEquals("A highly complex and deeply nested JSON example for demonstration purposes.",
                jsonData.getMetadata()
                        .getApp()
                        .getDescription() );
    }

    @Test
    public void authorNameEqualsJaneSmith(){
        Assertions.assertEquals("Jane Smith", jsonData.getMetadata()
                .getAuthor()
                .getName());
    }

    @Test
    public void authorAgeEquals40(){
        Assertions.assertEquals(40, jsonData.getMetadata()
                .getAuthor()
                .getAge());
    }

    @Test
    public void authorContactEmailEqualsJane_smith_example_com(){
        Assertions.assertEquals("jane.smith@example.com", jsonData.getMetadata()
                .getAuthor()
                .getContact()
                .getEmail());
    }

    @Test
    public void authorContactPhoneEquals15559876543(){
        Assertions.assertEquals("+1 (555) 987-6543", jsonData
                .getMetadata()
                .getAuthor()
                .getContact()
                .getPhone());
    }

    @Test
    public void authorContactAddressStreetEquals789ElmSt(){
        Assertions.assertEquals("789 Elm St", jsonData.getMetadata()
                .getAuthor()
                .getContact()
                .getAddress()
                .getStreet());
    }

    @Test
    public void authorContactAddressCityEqualsSanFrancisco(){
        Assertions.assertEquals("San Francisco", jsonData.getMetadata()
                .getAuthor()
                .getContact()
                .getAddress()
                .getCity());
    }

    @Test
    public void authorContactAddressZipcodeEquals94105(){
        Assertions.assertEquals("94105", jsonData.getMetadata()
                .getAuthor()
                .getContact()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void authorContactAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA", jsonData.getMetadata()
                .getAuthor()
                .getContact()
                .getAddress()
                .getCountry());
    }

    @Test
    public void createdAtZonedDateTimeEquals20230720T120000Z(){
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2023-07-20T12:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmX");

        // Format the ZonedDateTime to a string
        String formattedExpectedDateTime = zonedDateTime.format(formatter);

        Assertions.assertEquals(formattedExpectedDateTime, jsonData.getMetadata().getCreatedAt());
    }

    @Test
    public void firstContributorNameEqualsJohnDoe(){
        Assertions.assertEquals("John Doe", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getName());
    }

    @Test
    public void firstContributorAgeEquals35(){
        Assertions.assertEquals(35, jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getAge());
    }

    @Test
    public void firstContributorContractEmailEqualsjohndoeexamplecom(){
        Assertions.assertEquals("john.doe@example.com", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getEmail());
    }

    @Test
    public void firstContributorContractPhoneEquals15551234567(){
        Assertions.assertEquals("+1 (555) 123-4567", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getPhone());
    }

    @Test
    public void firstContributorContractAddressStreetEquals456PineAve(){
        Assertions.assertEquals("456 Pine Ave", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getAddress()
                .getStreet());
    }

    @Test
    public void firstContributorContractAddressCityEqualsLosAngeles(){
        Assertions.assertEquals("Los Angeles", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getAddress()
                .getCity());
    }

    @Test
    public void firstContributorContractAddressZipcodeEquals90001(){
        Assertions.assertEquals("90001", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void firstContributorContractAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA", jsonData.getMetadata()
                .getContributors()
                .get(0)
                .getContact()
                .getAddress()
                .getCountry());
    }

    @Test
    public void secondContributorNameEqualsRobertJohnson(){
        Assertions.assertEquals("Robert Johnson", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getName());
    }

    @Test
    public void secondContributorAgeEquals42(){
        Assertions.assertEquals(42, jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getAge());
    }

    @Test
    public void secondContributorContractEmailEqualsrobertjohnsonexamplecom(){
        Assertions.assertEquals("robert.johnson@example.com", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getEmail());
    }

    @Test
    public void secondContributorContractPhoneEquals15555555555(){
        Assertions.assertEquals("+1 (555) 555-5555", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getPhone());
    }

    @Test
    public void secondContributorContractAddressStreetEquals789OakSt(){
        Assertions.assertEquals("789 Oak St", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getAddress()
                .getStreet());
    }

    @Test
    public void secondContributorContractAddressCityEqualsChicago(){
        Assertions.assertEquals("Chicago", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getAddress()
                .getCity());
    }

    @Test
    public void secondContributorContractAddressZipcodeEquals60601(){
        Assertions.assertEquals("60601", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void secondContributorContractAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA", jsonData.getMetadata()
                .getContributors()
                .get(1)
                .getContact()
                .getAddress()
                .getCountry());
    }


    @Test
    public void tagsArrayEquals_complex_nested_example_json_long_demonstration_ultracomplex(){
        List<String> expectedArray = List.of("complex", "nested", "example", "json", "long", "demonstration", "ultra-complex");;
        Assertions.assertEquals(expectedArray,
                jsonData.getMetadata().getTags());
    }

    @Test
    public void user1IdEquals1(){
        Assertions.assertEquals(1, jsonData.getData()
                .getUsers()
                .get(0)
                .getId());
    }

    @Test
    public void user1UsernameEqualsUser1(){
        Assertions.assertEquals("user1", jsonData.getData()
                .getUsers()
                .get(0)
                .getUsername());
    }

    @Test
    public void user1ProfileFirstNameEqualsAlice(){
        Assertions.assertEquals("Alice", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getFirstName());
    }

    @Test
    public void user1ProfileLastNameEqualsSmith(){
        Assertions.assertEquals("Smith", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getLastName());
    }

    @Test
    public void user1ProfileAgeEquals30(){
        Assertions.assertEquals(30, jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getAge());
    }

    @Test
    public void user1ProfileGenderEqualsFemale(){
        Assertions.assertEquals("female", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getGender());
    }

    @Test
    public void user1ProfileContactEmailEquals_alicesmithexamplecom(){
        Assertions.assertEquals("alice.smith@example.com", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getEmail());
    }

    @Test
    public void user1ProfileContactPhoneEquals15551111111(){
        Assertions.assertEquals("+1 (555) 111-1111", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getPhone());
    }

    @Test
    public void user1ProfileContactAddressStreetEquals123_Main_St(){
        Assertions.assertEquals("123 Main St", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getAddress()
                .getStreet());
    }

    @Test
    public void user1ProfileContactAddressCityEqualsNewYork(){
        Assertions.assertEquals("New York", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getAddress()
                .getCity());
    }

    @Test
    public void user1ProfileContactAddressZipcodeEquals10001(){
        Assertions.assertEquals("10001", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void user1ProfileContactAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getContact()
                .getAddress()
                .getCountry());
    }

    @Test
    public void user1ProfilePreferencesThemeEqualsDark(){
        Assertions.assertEquals("dark", jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getTheme());
    }

    @Test
    public void user1ProfilePreferencesNotificationsEqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getNotifications());
    }


    // Gebleven bij USER1 -> preferences -> languages. Kopieer plak en werk zo alle overige nog uit







    //Assertions doen per elke single node in de JSON file
    //Daarna test cases met het aanpassen van bijvoorbeeld de naam en dan assert equals de nieuwe naam
    //Om te checken of de nieuwe naam goed wordt opgepakt door de json etc.

    @Test
    public void firstUsernameEqualsAlice(){
        Assertions.assertEquals("Alice", jsonData.getData().getUsers().get(0).getProfile().getFirstName());
    }

    @Test
    public void secondUsernameEqualsBob(){
        Assertions.assertEquals("Bob", jsonData.getData().getUsers().get(1).getProfile().getFirstName());
    }



}
