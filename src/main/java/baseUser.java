/**
 * All work is created by Matt Sievers on 02-13-2020 for use in CST-105
 */
public class baseUser {

  private String role;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private Location location;
  private String userName;
  private String password;

  public baseUser(String role, String firstName, String lastName, String phoneNumber, Location location, String userName, String password) {
    this.role = role;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.location = location;
    this.userName = userName;
    this.password = password;
  }

  public baseUser(){}


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "baseUser{" +
            "role='" + role + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", location=" + location +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
