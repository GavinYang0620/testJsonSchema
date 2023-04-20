package api.booking.to.test;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JsonProperty("name")
    String name;
    
    @JsonProperty("street")
    String street;
    
    @JsonProperty("streetNumber")
    String streetNumber;
    
    @JsonProperty("floor")
    String floor;
    
    @JsonProperty("postCode")
    String postCode;
    
    @JsonProperty("city")
    String city;
    
    @JsonProperty("stateRegion")
    String stateRegion;
    
    @JsonProperty("country")
    String country;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    public String getFloor() {
        return floor;
    }
    public void setFloor(String floor) {
        this.floor = floor;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateRegion() {
        return stateRegion;
    }
    public void setStateRegion(String stateRegion) {
        this.stateRegion = stateRegion;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
