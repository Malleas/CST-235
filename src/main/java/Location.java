/**
 * All work is created by Matt Sievers on 02-13-2020 for use in CST-105
 */
public class Location {

  private String streetAddress;
  private String city;
  private String state;
  private int zipCode;

  public Location(String streetAddress, String city, String state, int zipCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public Location(){}

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "Location{" +
            "streetAddress='" + streetAddress + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zipCode=" + zipCode +
            '}';
  }
}
