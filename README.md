<h4> Bienvenidos, Aqui estaremos adjuntando lo que vallamos avanzando del informe de dependencias </h4>

![](https://i.blogs.es/53044d/java/1366_521.jpg)

_*Grafico que muestra como funciona una dependencia*_

```mermaid
classDiagram

class A {
  +atributo1
  +atributo2
  +atributo3

  +metodo1()
  +metodo2()
  +metodo3()
}

class B {
  +atributo1
  +atributo2
  +metodo1()
}

class C{
  +atributo1
  +metodo1()
}

A --|> B
A --|> C
```

```
Como podemos ver en el grafico, las clases 'B' y 'C' dependen de 'A', asi que
cualquier cambio que hagamos en la case 'A', las demas clases tambien seran modificadas.
```

Veamos un ejemplo de como funcionan las dependencias

```mermaid
classDiagram

class Client{
  id: int 
  name: String 
  username: String 
  email: String 
  address: Address 
  phone: String 
  website: String 
  company: Company 

  getName(): String
  setName(String value): void

  getUsername(): String
  setUsername(String value): void

  getEmail(): String
  setEmail(String value): void

  getAddress(): Address
  setAddress(Address value): Address

  getPhone(): String
  setPhone(String value): void

  getWebsite(): String
  setWebsite(String value): void

  getCompany(): Company
  setCompany(Company value): void

  Client(): Constructor
}

class Address {
  street: String
  suit: String
  city: String
  zipcode: String
  geo: Geo

  getStreet(): String
  setStreet(String value): void

  getSuite(): String
  setSuite(String value): void

  getCity(): String
  setCity(String value): void

  getZipcode(): String
  setZipcode(String value): void

  getGeo(): Geo
  setGeo(Geo value): void
}

class Geo {
  lat: String
  lng: String

  getLat(): String
  setLat(String value): void

  getLng(): String
  setLng(String value): void
}

class Company {
  name: String
  catchPhrase: String
  bs: String

  getName(): String
  setName(String value): void

  getCatchPhrase(): String
  setCatchPhrase(String value): String

  getBs(): String
  setBs(String value): void
}

class CuentaBancaria {
  numeroCuenta: String  
  saldo: double
  titular: Client

  depositar(int cantidad): void
  retirar(int cantidad): void
  obtenerNombreTitular(): String
}

Client --|> Address
Address --|> Geo
Client --|> Company
CuentaBancaria --|> Client
```

```
En el grafico mostrado anteriormente, podemos observar como estan constituidas las clases,
vemos que en la clase 'Client' depende de dos clases, llamadas 'Address' y 'Company',
entonces si modificamos alguna de estas dos clases, la clase 'Client' tambien se mirara 
afectada, por otro lado la clase 'Address' depende de otra clase, llamada 'Geo', la cual es 
una clase independiente ya que no necesita de otra clase creada por nosotros, ya que 
cualquier clase que creamos es dependiente de la super clase llamada 'Object'
```
