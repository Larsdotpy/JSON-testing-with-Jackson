package DifficultJsonTests;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Data {
        private List<User> users;

        // Constructors, getters, setters, and toString method
    }
    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class User {
        private int id;
        private String username;
        private Profile profile;
        private List<Order> orders;

        // Constructors, getters, setters, and toString method
    }
    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Profile {
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private Contact contact;
        private Preferences preferences;
        private SocialMedia social_media;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Preferences {
        private String theme;
        private boolean notifications;
        private String language;
        private Settings settings;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Settings {
        private boolean auto_login;
        private AdvancedOptions advanced_options;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class AdvancedOptions {
        private boolean show_hidden;
        private boolean debug_mode;
        private Experimental experimental;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Experimental {
        private boolean feature1;
        private boolean feature2;
        private boolean feature3;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class SocialMedia {
        private String facebook;
        private String twitter;
        private String instagram;
        private String linkedin;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Order {
        private String order_id;
        private double total;
        private String status;
        private List<Item> items;
        private Shipping shipping;
        private Payment payment;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Item {
        private String product;
        private int quantity;
        private double price;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Shipping {
        private String method;
        private Address address;
        private TrackingInfo tracking_info;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class TrackingInfo {
        private String carrier;
        private String tracking_number;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Payment {
        private String method;
        private CardDetails card_details;
        private String account_email;

        // Constructors, getters, setters, and toString method
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    class CardDetails {
        private String card_number;
        private String expiry;
        private String cardholder_name;
        private Address billing_address;

        // Constructors, getters, setters, and toString method
    }
