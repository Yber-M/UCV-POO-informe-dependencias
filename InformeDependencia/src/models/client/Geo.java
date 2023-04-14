package client;

import lombok.Getter;
import lombok.Setter;

public class Geo {
  @Getter
  @Setter
  private String lat;

  @Getter
  @Setter
  private String lng;

  public Geo() {
  }

  public Geo(String lat, String lng) {
    this.lat = lat;
    this.lng = lng;
  }
}