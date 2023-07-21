package DifficultJsonTests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Metadata {
        private App app;
        private Author author;
        private String created_at;
        private List<Contributor> contributors;
        private List<String> tags;

        // Constructors, getters, setters, and toString method
}
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class App {
            private String name;
            private String version;
            private String description;

            // Constructors, getters, setters, and toString method
        }
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Author {
            private String name;
            private int age;
            private Contact contact;

            // Constructors, getters, setters, and toString method
        }
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Contributor {
            private String name;
            private int age;
            private Contact contact;

            // Constructors, getters, setters, and toString method
        }
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Contact {
            private String email;
            private String phone;
            private Address address;

            // Constructors, getters, setters, and toString method
        }
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Address {
            private String street;
            private String city;
            private String zipcode;
            private String country;

            // Constructors, getters, setters, and toString method
}

