package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Data {
    @JsonProperty("users")
    private List<Users> users;
}
@lombok.Data
@NoArgsConstructor
class Users {
    @JsonProperty("id")
    private int id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("profile")
    private Profile profile;

    @JsonProperty("orders")
    private List<Orders> orders;
}
@lombok.Data
@NoArgsConstructor
class Profile {
    public Profile(String firstName, String lastName, int age, String gender, Contact contact, Preferences preferences, SocialMedia socialMedia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.preferences = preferences;
        this.socialMedia = socialMedia;
    }

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("age")
    private int age;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("contact")
    private Contact contact;

    @JsonProperty("preferences")
    private Preferences preferences;

    @JsonProperty("social_media")
    private SocialMedia socialMedia;
}
@lombok.Data
@NoArgsConstructor
class Preferences {
    public Preferences(String theme, boolean notifications, String language, Settings settings) {
        this.theme = theme;
        this.notifications = notifications;
        this.language = language;
        this.settings = settings;
    }

    @JsonProperty("theme")
    private String theme;

    @JsonProperty("notifications")
    private boolean notifications;

    @JsonProperty("language")
    private String language;

    @JsonProperty("settings")
    private Settings settings;

    public boolean getNotifications() {
        return notifications;
    }
}

@lombok.Data
@NoArgsConstructor
class Settings {

    public Settings(boolean autoLogin, AdvancedOptions advancedOptions) {
        this.autoLogin = autoLogin;
        this.advancedOptions = advancedOptions;
    }

    @JsonProperty("auto-login")
    private boolean autoLogin;

    @JsonProperty("advanced_options")
    private AdvancedOptions advancedOptions;
}

@lombok.Data
@NoArgsConstructor
class AdvancedOptions {
    public AdvancedOptions(boolean showHidden, boolean debugMode, Experimental experimental) {
        this.showHidden = showHidden;
        this.debugMode = debugMode;
        this.experimental = experimental;
    }

    @JsonProperty("show_hidden")
    private boolean showHidden;

    @JsonProperty("debug_mode")
    private boolean debugMode;

    @JsonProperty("experimental")
    private Experimental experimental;
}

@lombok.Data
@NoArgsConstructor
class Experimental {
    public Experimental(boolean feature1, boolean feature2, boolean feature3) {
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
    }

    @JsonProperty("feature1")
    private boolean feature1;

    @JsonProperty("feature2")
    private boolean feature2;

    @JsonProperty("feature3")
    private boolean feature3;
}

@lombok.Data
@NoArgsConstructor
class SocialMedia {
    public SocialMedia(String facebook, String twitter, String instagram, String linkedin) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    @JsonProperty("facebook")
    private String facebook;

    @JsonProperty("twitter")
    private String twitter;

    @JsonProperty("instagram")
    private String instagram;

    @JsonProperty("linkedin")
    private String linkedin;
}

@lombok.Data
@NoArgsConstructor
class Orders {
    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("total")
    private double total;

    @JsonProperty("status")
    private String status;

    @JsonProperty("items")
    private List<Items> items;

    @JsonProperty("shipping")
    private Shipping shipping;

    @JsonProperty("payment")
    private Payment payment;
}

@lombok.Data
@NoArgsConstructor
class Items {
    @JsonProperty("product")
    private String product;

    public Items(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private double price;
}

@lombok.Data
@NoArgsConstructor
class Shipping {
    public Shipping(String method, Address address, TrackingInfo trackingInfo) {
        this.method = method;
        this.address = address;
        this.trackingInfo = trackingInfo;
    }

    @JsonProperty("method")
    private String method;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("tracking_info")
    private TrackingInfo trackingInfo;
}

@lombok.Data
@NoArgsConstructor
class TrackingInfo {
    public TrackingInfo(String carrier, String trackingNumber) {
        this.carrier = carrier;
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("tracking_number")
    private String trackingNumber;
}

@lombok.Data
@JsonSerialize(using = PaymentSerializer.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
class Payment {
    private Payment(String method, CardDetails cardDetails) {
        this.method = method;
        this.cardDetails = cardDetails;
    }

    private Payment(String method, CardDetails cardDetails, String accountEmail) {
        this.method = method;
        this.cardDetails = cardDetails;
        this.accountEmail = accountEmail;
    }

    public static Payment createWithAccountEmail(String method, CardDetails cardDetails, String accountEmail) {
        return new Payment(method, cardDetails, accountEmail);
    }

    public static Payment createWithoutAccountEmail(String method, CardDetails cardDetails) {
        return new Payment(method, cardDetails);
    }

    @JsonProperty("method")
    private String method;

    @JsonProperty("card_details")
    private CardDetails cardDetails;

    @JsonProperty("account_email")
    private String accountEmail;
}

@lombok.Data
@NoArgsConstructor
class CardDetails {
    @JsonProperty("card_number")
    private String cardNumber;

    public CardDetails(String cardNumber, String expiry, String cardholderName, Address billingAddress) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cardholderName = cardholderName;
        this.billingAddress = billingAddress;
    }

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("cardholder_name")
    private String cardholderName;

    @JsonProperty("billing_address")
    private Address billingAddress;
}