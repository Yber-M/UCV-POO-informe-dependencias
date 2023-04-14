package client;

import lombok.Getter;
import lombok.Setter;

public class Address {
  @Getter
  @Setter
  private String street;

  @Getter
  @Setter
  private String suite;

  @Getter
  @Setter
  private String city;

  @Getter
  @Setter
  private String zipcode;

  @Getter
  @Setter
  private Geo geo; // Esta clase depende de la clase 'Geo'

  public Address() {
  }

  public Address(String street, String suite, String city, String zipcode, Geo geo) {
    this.street = street;
    this.suite = suite;
    this.zipcode = zipcode;
    this.geo = geo;
  }
}
