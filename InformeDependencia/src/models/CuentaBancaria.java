import client.Client;
import lombok.Getter;
import lombok.Setter;

public class CuentaBancaria {
  @Getter
  @Setter
  private String numeroCuenta;
  private double saldo;

  /*
   * Al declar una variable de tipo 'Cliente' estamos indicando que la clase
   * 'CuentaBancaria' depende de 'Cliente' para que pueda funcionar correctamente
   */
  private Client titular;

  public void depositar(double cantidad) {
    saldo += cantidad;
  }

  public void retirar(double cantidad) {
    if (saldo >= 0)
      saldo -= cantidad;
    System.out.println("No cuanta con saldo suficiente");
  }

  public String obtenerNombreTitular() {
    return titular.getName();
  }
}
