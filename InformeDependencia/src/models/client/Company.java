package client;

import lombok.Getter;
import lombok.Setter;

public class Company {
  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String catchPhrase;

  @Getter
  @Setter
  private String bs;

  public Company() {
  }

  public Company(String name, String catchPhrase, String bs) {
    this.name = name;
    this.catchPhrase = catchPhrase;
    this.bs = bs;
  }
}
