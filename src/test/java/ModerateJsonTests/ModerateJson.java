package ModerateJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;


public class ModerateJson {
    // Private variables representing the JSON data
    @JsonProperty("string")
    private String myString;

    @JsonProperty("number")
    private int myNumber;

    @JsonProperty("boolean")
    private boolean myBoolean;

    @JsonProperty("nullValue")
    private String myNullValue;

    @JsonProperty("array")
    private Object[] myArray;

    @JsonProperty("object")
    private NestedObject myObject;

    @JsonProperty("specialCharacters")
    private String mySpecialCharacters;

    @JsonProperty("unicodeCharacter")
    private String myUnicodeCharacter;

    @JsonProperty("escapeCharacters")
    private String myEscapeCharacters;

    @JsonProperty("date")
    private String myDate;

    @JsonProperty("time")
    private String myTime;

    @JsonProperty("datetime")
    private String myDatetime;

    @JsonProperty("url")
    private String myUrl;

    @JsonProperty("emptyArray")
    private Object[] myEmptyArray;

    @JsonProperty("emptyObject")
    private NestedObject myEmptyObject;

    @JsonProperty("scientificNotation")
    private double myScientificNotation;

    @Override
    public String toString() {
        return "ModerateJsonTests.ModerateJson{" +
                "myString='" + myString + '\'' +
                ", myNumber=" + myNumber +
                ", myBoolean=" + myBoolean +
                ", myNullValue='" + myNullValue + '\'' +
                ", myArray=" + Arrays.toString(myArray) +
                ", myObject=" + myObject +
                ", mySpecialCharacters='" + mySpecialCharacters + '\'' +
                ", myUnicodeCharacter='" + myUnicodeCharacter + '\'' +
                ", myEscapeCharacters='" + myEscapeCharacters + '\'' +
                ", myDate='" + myDate + '\'' +
                ", myTime='" + myTime + '\'' +
                ", myDatetime='" + myDatetime + '\'' +
                ", myUrl='" + myUrl + '\'' +
                ", myEmptyArray=" + Arrays.toString(myEmptyArray) +
                ", myEmptyObject=" + myEmptyObject +
                ", myScientificNotation=" + myScientificNotation +
                '}';
    }

    // Nested class representing the "object" in the JSON
    public static class NestedObject {

        @JsonProperty("nestedString")
        private String nestedString;

        @JsonProperty("nestedNumber")
        private double nestedNumber;

        @JsonProperty("nestedBoolean")
        private boolean nestedBoolean;

        public String getNestedString() {
            return nestedString;
        }

        public void setNestedString(String nestedString) {
            this.nestedString = nestedString;
        }

        public double getNestedNumber() {
            return nestedNumber;
        }

        public void setNestedNumber(double nestedNumber) {
            this.nestedNumber = nestedNumber;
        }

        public boolean getNestedBoolean() {
            return nestedBoolean;
        }

        public void setNestedBoolean(boolean nestedBoolean) {
            this.nestedBoolean = nestedBoolean;
        }

        @Override
        public String toString() {
            return "NestedObject{" +
                    "nestedString='" + nestedString + '\'' +
                    ", nestedNumber=" + nestedNumber +
                    ", nestedBoolean=" + nestedBoolean +
                    '}';
        }
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public boolean getMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public String getMyNullValue() {
        return myNullValue;
    }

    public void setMyNullValue(String myNullValue) {
        this.myNullValue = myNullValue;
    }

    public Object[] getMyArray() {
        return myArray;
    }

    public void setMyArray(Object[] myArray) {
        this.myArray = myArray;
    }

    public NestedObject getMyObject() {
        return myObject;
    }

    public void setMyObject(NestedObject myObject) {
        this.myObject = myObject;
    }

    public String getMySpecialCharacters() {
        return mySpecialCharacters;
    }

    public void setMySpecialCharacters(String mySpecialCharacters) {
        this.mySpecialCharacters = mySpecialCharacters;
    }

    public String getMyUnicodeCharacter() {
        return myUnicodeCharacter;
    }

    public void setMyUnicodeCharacter(String myUnicodeCharacter) {
        this.myUnicodeCharacter = myUnicodeCharacter;
    }

    public String getMyEscapeCharacters() {
        return myEscapeCharacters;
    }

    public void setMyEscapeCharacters(String myEscapeCharacters) {
        this.myEscapeCharacters = myEscapeCharacters;
    }

    public String getMyDate() {
        return myDate;
    }

    public void setMyDate(String myDate) {
        this.myDate = myDate;
    }

    public String getMyTime() {
        return myTime;
    }

    public void setMyTime(String myTime) {
        this.myTime = myTime;
    }

    public String getMyDatetime() {
        return myDatetime;
    }

    public void setMyDatetime(String myDatetime) {
        this.myDatetime = myDatetime;
    }

    public String getMyUrl() {
        return myUrl;
    }

    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }

    public Object[] getMyEmptyArray() {
        return myEmptyArray;
    }

    public void setMyEmptyArray(Object[] myEmptyArray) {
        this.myEmptyArray = myEmptyArray;
    }

    public NestedObject getMyEmptyObject() {
        return myEmptyObject;
    }

    public void setMyEmptyObject(NestedObject myEmptyObject) {
        this.myEmptyObject = myEmptyObject;
    }

    public double getMyScientificNotation() {
        return myScientificNotation;
    }

    public void setMyScientificNotation(double myScientificNotation) {
        this.myScientificNotation = myScientificNotation;
    }
}

// the @JsonProperty annotation is used to map the JSON keys to the corresponding Java variable names.
// Also, for the "object" and "emptyObject" fields,
// we have created a nested class NestedObject to represent the nested JSON object structure.