package JavaStreams;

import DifficultJsonTests.JsonData;
import DifficultJsonTests.Profile;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Peeking {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);
    public Peeking() throws IOException {
    }

    @Test
    public void peekingWithJsonData(){
        List<Users> users = jsonData.getData().getUsers();

        // Utilizing Java streams peeking to print user details
        users.stream()
                .peek(user -> {
                    System.out.println("User ID: " + user.getId());
                    System.out.println("Username: " + user.getUsername());
                    System.out.println("First Name: " + user.getProfile().getFirstName());
                    System.out.println("Last Name: " + user.getProfile().getLastName());
                })
                .forEach(user -> System.out.println("--------------------"));

        // Assertion for the number of users
        Assertions.assertEquals(2, users.size(), "Number of users should be 2");

        // Assertion for the first user's ID and username
        Users firstUser = users.get(0);
        Assertions.assertEquals(1, firstUser.getId(), "First user ID should be 1");
        Assertions.assertEquals("user1", firstUser.getUsername(), "First user username should be 'user1'");

        // Assertion for the first user's first name and last name
        Profile firstUserProfile = firstUser.getProfile();
        Assertions.assertEquals("Alice", firstUserProfile.getFirstName(), "First user's first name should be 'Alice'");
        Assertions.assertEquals("Smith", firstUserProfile.getLastName(), "First user's last name should be 'Smith'");
    }
}