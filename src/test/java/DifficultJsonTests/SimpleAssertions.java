package DifficultJsonTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
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
    public void user1OrdersOrder2IdEqualsXYZ789(){
        Assertions.assertEquals("XYZ789",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getOrderId());
    }

    @Test
    public void user1OrdersOrder2TotalEquals75Dot0(){
        Assertions.assertEquals(75.0,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getTotal());
    }

    @Test
    public void user1OrdersOrder2StatusEqualsDelivered(){
        Assertions.assertEquals("delivered",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getStatus());
    }

    @Test
    public void user1OrdersOrder2FirstItemProductEqualsWidgetC(){
        Assertions.assertEquals("Widget C",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getItems()
                .get(0)
                .getProduct());
    }

    @Test
    public void user1OrdersOrder2FirstItemQuantityEquals3(){
        Assertions.assertEquals(3,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getItems()
                .get(0)
                .getQuantity());
    }

    @Test
    public void user1OrdersOrder2FirstItemPriceEquals15Dot0(){
        Assertions.assertEquals(15.0,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getItems()
                .get(0)
                .getPrice());
    }

    @Test
    public void user1OrdersOrder2ShippingMethodEqualsStandard(){
        Assertions.assertEquals("standard",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getMethod());
    }

    @Test
    public void user1OrdersOrder2ShippingAddressStreetEquals456_Elm_St(){
        Assertions.assertEquals("456 Elm St",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getAddress()
                .getStreet());
    }

    @Test
    public void user1OrdersOrder2ShippingAddressCityEqualsLosAngeles(){
        Assertions.assertEquals("Los Angeles",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getAddress()
                .getCity());
    }

    @Test
    public void user1OrdersOrder2ShippingAddressZipcodeEquals90001(){
        Assertions.assertEquals("90001",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void user1OrdersOrder2ShippingAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getAddress()
                .getCountry());
    }

    @Test
    public void user1OrdersOrder2ShippingTrackingInfoCarrierEqualsFedEx(){
        Assertions.assertEquals("FedEx",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getTrackingInfo()
                .getCarrier());
    }

    @Test
    public void user1OrdersOrder2ShippingTrackingInfoTrackingNumberEquals987654321(){
        Assertions.assertEquals("987654321",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getShipping()
                .getTrackingInfo()
                .getTrackingNumber());
    }


    @Test
    public void user1OrdersOrder2PaymentMethodEqualsPaypal(){
        Assertions.assertEquals("paypal",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getPayment()
                .getMethod());
    }

    @Test
    public void user1OrdersOrder2PaymentAccountEmailEqualsAliceDotSmithAtExampleDotcom(){
        Assertions.assertEquals("alice.smith@example.com",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(1)
                .getPayment()
                .getAccountEmail());
    }

    // USER 2

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

    @Test
    public void user1ProfilePreferencesLanguageEqualsEn_US(){
        Assertions.assertEquals("en-US",jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getLanguage());
    }

    @Test
    public void user1ProfilePreferencesSettingsAutoLoginEqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .isAutoLogin());
    }

    @Test
    public void user1ProfilePreferencesSettingsAdvancedOptionsShowHiddenEqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .isShowHidden());
    }

    @Test
    public void user1ProfilePreferencesSettingsAdvancedOptionsDebugModeEqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .isDebugMode());
    }

    @Test
    public void user1ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature1EqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature1());
    }

    @Test
    public void user1ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature2EqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature2());
    }

    @Test
    public void user1ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature3EqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature3());
    }

    @Test
    public void user1ProfileSocialMediaFacebookEqualsAliceDotSmith(){
        Assertions.assertEquals("alice.smith",jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getSocialMedia()
                .getFacebook());
    }

    @Test
    public void user1ProfileSocialMediaTwitterEqualsAtAlice_Smith(){
        Assertions.assertEquals("@alice_smith",jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getSocialMedia()
                .getTwitter());
    }

    @Test
    public void user1ProfileSocialMediaInstagramEqualsAliceDotSmith(){
        Assertions.assertEquals("alice.smith",jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getSocialMedia()
                .getInstagram());
    }


    @Test
    public void user1ProfileSocialMediaLinkedinEqualsInSlashAlice_smith(){
        Assertions.assertEquals("in/alice_smith",jsonData.getData()
                .getUsers()
                .get(0)
                .getProfile()
                .getSocialMedia()
                .getLinkedin());
    }

    @Test
    public void user1OrdersOrder1IdEqualsABC123(){
        Assertions.assertEquals("ABC123",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getOrderId());
    }

    @Test
    public void user1OrdersOrder1TotalEquals100Dot5(){
        Assertions.assertEquals(100.5,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getTotal());
    }

    @Test
    public void user1OrdersOrder1StatusEqualsShipped(){
        Assertions.assertEquals("shipped",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getStatus());
    }

    @Test
    public void user1OrdersOrder1FirstItemProductEqualsWidgetA(){
        Assertions.assertEquals("Widget A",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getProduct());
    }

    @Test
    public void user1OrdersOrder1FirstItemQuantityEquals2(){
        Assertions.assertEquals(2,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getQuantity());
    }

    @Test
    public void user1OrdersOrder1FirstItemPriceEquals25Dot25(){
        Assertions.assertEquals(25.25,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getPrice());
    }

    @Test
    public void user1OrdersOrder1SecondItemProductEqualsWidgetB(){
        Assertions.assertEquals("Widget B",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(1)
                .getProduct());
    }

    @Test
    public void user1OrdersOrder1SecondItemQuantityEquals1(){
        Assertions.assertEquals(1,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(1)
                .getQuantity());
    }

    @Test
    public void user1OrdersOrder1SecondItemPriceEquals50Dot0(){
        Assertions.assertEquals(50.0,jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getItems()
                .get(1)
                .getPrice());
    }

    @Test
    public void user1OrdersOrder1ShippingMethodEqualsExpress(){
        Assertions.assertEquals("express",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getMethod());
    }

    @Test
    public void user1OrdersOrder1ShippingAddressStreetEquals123_Main_St(){
        Assertions.assertEquals("123 Main St",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getStreet());
    }

    @Test
    public void user1OrdersOrder1ShippingAddressCityEqualsNewYork(){
        Assertions.assertEquals("New York",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getCity());
    }

    @Test
    public void user1OrdersOrder1ShippingAddressZipcodeEquals10001(){
        Assertions.assertEquals("10001",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void user1OrdersOrder1ShippingAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getCountry());
    }

    @Test
    public void user1OrdersOrder1ShippingTrackingInfoCarrierEqualsUPS(){
        Assertions.assertEquals("UPS",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getTrackingInfo()
                .getCarrier());
    }

    @Test
    public void user1OrdersOrder1ShippingTrackingInfoTrackingNumberEquals123456789(){
        Assertions.assertEquals("123456789",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getShipping()
                .getTrackingInfo()
                .getTrackingNumber());
    }


    @Test
    public void user1OrdersOrder1PaymentMethodEqualsCredit_Card(){
        Assertions.assertEquals("credit_card",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getMethod());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsCardNumberEquals12TimesStar1234(){
        Assertions.assertEquals("**** **** **** 1234",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getCardNumber());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsExpiryEquals08_25(){
        Assertions.assertEquals("08/25",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getExpiry());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsCardholderNameEqualsAliceSmith(){
        Assertions.assertEquals("Alice Smith",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getCardholderName());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsBillingAddressStreetEquals123Mainst(){
        Assertions.assertEquals("123 Main St",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getStreet());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsBillingAddressCityEqualsNewYork(){
        Assertions.assertEquals("New York",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getCity());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsBillingAddressZipcodeEquals10001(){
        Assertions.assertEquals("10001",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getZipcode());
    }

    @Test
    public void user1OrdersOrder1PaymentCardDetailsBillingAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA",jsonData.getData()
                .getUsers()
                .get(0)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getCountry());
    }

    @Test
    public void user2IdEquals2(){
        Assertions.assertEquals(2, jsonData.getData()
                .getUsers()
                .get(1)
                .getId());
    }

    @Test
    public void user2UsernameEqualsUser2(){
        Assertions.assertEquals("user2", jsonData.getData()
                .getUsers()
                .get(1)
                .getUsername());
    }

    @Test
    public void user2ProfileFirstNameEqualsBob(){
        Assertions.assertEquals("Bob", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getFirstName());
    }

    @Test
    public void user2ProfileLastNameEqualsJohnson(){
        Assertions.assertEquals("Johnson", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getLastName());
    }

    @Test
    public void user2ProfileAgeEquals35(){
        Assertions.assertEquals(35, jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getAge());
    }

    @Test
    public void user2ProfileGenderEqualsMale(){
        Assertions.assertEquals("male", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getGender());
    }

    @Test
    public void user2ProfileContactEmailEquals_bobDotjohnsonAtexampleDotcom(){
        Assertions.assertEquals("bob.johnson@example.com", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getEmail());
    }

    @Test
    public void user2ProfileContactPhoneEquals15552222222(){
        Assertions.assertEquals("+1 (555) 222-2222", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getPhone());
    }

    @Test
    public void user2ProfileContactAddressStreetEquals789_Oak_St(){
        Assertions.assertEquals("789 Oak St", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getAddress()
                .getStreet());
    }

    @Test
    public void user2ProfileContactAddressCityEqualsChicago(){
        Assertions.assertEquals("Chicago", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getAddress()
                .getCity());
    }

    @Test
    public void user2ProfileContactAddressZipcodeEquals60601(){
        Assertions.assertEquals("60601", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void user2ProfileContactAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getContact()
                .getAddress()
                .getCountry());
    }

    @Test
    public void user2ProfilePreferencesThemeEqualsLight(){
        Assertions.assertEquals("light", jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getTheme());
    }

    @Test
    public void user2ProfilePreferencesNotificationsEqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getNotifications());
    }

    @Test
    public void user2ProfilePreferencesLanguageEqualsEn_GB(){
        Assertions.assertEquals("en-GB",jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getLanguage());
    }

    @Test
    public void user2ProfilePreferencesSettingsAutoLoginEqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .isAutoLogin());
    }

    @Test
    public void user2ProfilePreferencesSettingsAdvancedOptionsShowHiddenEqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .isShowHidden());
    }

    @Test
    public void user2ProfilePreferencesSettingsAdvancedOptionsDebugModeEqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .isDebugMode());
    }

    @Test
    public void user2ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature1EqualsFalse(){
        Assertions.assertFalse(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature1());
    }

    @Test
    public void user2ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature2EqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature2());
    }

    @Test
    public void user2ProfilePreferencesSettingsAdvancedOptionsExperimentalFeature3EqualsTrue(){
        Assertions.assertTrue(jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getPreferences()
                .getSettings()
                .getAdvancedOptions()
                .getExperimental()
                .isFeature3());
    }

    @Test
    public void user2ProfileSocialMediaFacebookEqualsBobDotJohnson(){
        Assertions.assertEquals("bob.johnson",jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getSocialMedia()
                .getFacebook());
    }

    @Test
    public void user2ProfileSocialMediaTwitterEqualsAtBob_Johnson(){
        Assertions.assertEquals("@bob_johnson",jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getSocialMedia()
                .getTwitter());
    }

    @Test
    public void user2ProfileSocialMediaInstagramEqualsBobDotJohnson(){
        Assertions.assertEquals("bob.johnson",jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getSocialMedia()
                .getInstagram());
    }


    @Test
    public void user2ProfileSocialMediaLinkedinEqualsInSlashBob_johnson(){
        Assertions.assertEquals("in/bob_johnson",jsonData.getData()
                .getUsers()
                .get(1)
                .getProfile()
                .getSocialMedia()
                .getLinkedin());
    }

    @Test
    public void user2OrdersOrder1IdEqualsPQR456(){
        Assertions.assertEquals("PQR456",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getOrderId());
    }

    @Test
    public void user2OrdersOrder1TotalEquals45Dot0(){
        Assertions.assertEquals(45.0,jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getTotal());
    }

    @Test
    public void user2OrdersOrder1StatusEqualsProcessing(){
        Assertions.assertEquals("processing",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getStatus());
    }

    @Test
    public void user2OrdersOrder1FirstItemProductEqualsWidgetA(){
        Assertions.assertEquals("Widget A",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getProduct());
    }

    @Test
    public void user2OrdersOrder1FirstItemQuantityEquals1(){
        Assertions.assertEquals(1,jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getQuantity());
    }

    @Test
    public void user2OrdersOrder1FirstItemPriceEquals25Dot25(){
        Assertions.assertEquals(25.25,jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getItems()
                .get(0)
                .getPrice());
    }

    @Test
    public void user2OrdersOrder1ShippingMethodEqualsStandard(){
        Assertions.assertEquals("standard",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getMethod());
    }

    @Test
    public void user2OrdersOrder1ShippingAddressStreetEquals789_Oak_St(){
        Assertions.assertEquals("789 Oak St",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getStreet());
    }

    @Test
    public void user2OrdersOrder1ShippingAddressCityEqualsChicago(){
        Assertions.assertEquals("Chicago",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getCity());
    }

    @Test
    public void user2OrdersOrder1ShippingAddressZipcodeEquals60601(){
        Assertions.assertEquals("60601",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getZipcode());
    }

    @Test
    public void user2OrdersOrder1ShippingAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getAddress()
                .getCountry());
    }

    @Test
    public void user2OrdersOrder1ShippingTrackingInfoCarrierEqualsUSPS(){
        Assertions.assertEquals("USPS",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getTrackingInfo()
                .getCarrier());
    }

    @Test
    public void user2OrdersOrder1ShippingTrackingInfoTrackingNumberEquals777777777(){
        Assertions.assertEquals("777777777",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getShipping()
                .getTrackingInfo()
                .getTrackingNumber());
    }


    @Test
    public void user2OrdersOrder1PaymentMethodEqualsCredit_Card(){
        Assertions.assertEquals("credit_card",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getMethod());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsCardNumberEquals12TimesStar5678(){
        Assertions.assertEquals("**** **** **** 5678",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getCardNumber());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsExpiryEquals12_26(){
        Assertions.assertEquals("12/26",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getExpiry());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsCardholderNameEqualsBobJohnson(){
        Assertions.assertEquals("Bob Johnson",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getCardholderName());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsBillingAddressStreetEquals789_Oak_St(){
        Assertions.assertEquals("789 Oak St",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getStreet());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsBillingAddressCityEqualsChicago(){
        Assertions.assertEquals("Chicago",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getCity());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsBillingAddressZipcodeEquals60601(){
        Assertions.assertEquals("60601",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getZipcode());
    }

    @Test
    public void user2OrdersOrder1PaymentCardDetailsBillingAddressCountryEqualsUSA(){
        Assertions.assertEquals("USA",jsonData.getData()
                .getUsers()
                .get(1)
                .getOrders()
                .get(0)
                .getPayment()
                .getCardDetails()
                .getBillingAddress()
                .getCountry());
    }



    //Assertions doen per elke single node in de JSON file
    //Daarna test cases met het aanpassen van bijvoorbeeld de naam en dan assert equals de nieuwe naam
    //Om te checken of de nieuwe naam goed wordt opgepakt door de json etc.
    //Daarna experimenteren met Java streams

}
