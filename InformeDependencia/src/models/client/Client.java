package client;

import lombok.Getter;
import lombok.Setter;

public class Client {
  @Getter
  @Setter
  private int id;

  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private String email;

  @Getter
  @Setter
  private Address address; // Esta clase depende de la clase 'Address'

  @Getter
  @Setter
  private String phone;

  @Getter
  @Setter
  private String website;

  @Getter
  @Setter
  private Company company; // Esta clase depende de la clase 'Company'

  public Client() {
  }

  public Client(int id, String name, String username, String email, Address address, String phone, String website,
      Company company) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.email = email;
    this.address = address;
    this.phone = phone;
    this.website = website;
    this.company = company;
  }
}
