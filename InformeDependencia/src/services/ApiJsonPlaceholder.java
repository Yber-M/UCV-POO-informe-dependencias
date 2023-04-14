package services;

import client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class ApiJsonPlaceholder {
  private HttpURLConnection connection;
  // URL donde obtendremos datos de usuarios
  private final String API_URL = "https://jsonplaceholder.typicode.com/users";

  /*
   * Instanciamos nuestra clase 'gson' que nos ayudara a parsear una
   * cadena(String) a un json
   */
  private Gson gson = new Gson();

  /*
   * Creamos un metodo el cual nos retornara un tipo 'ApiResponse' dicha clase no
   * servira para poder tener mayor seguimiento a la respuesta que pueda entregar
   * la api con los datos
   */
  public ApiResponse getUsers() {
    ApiResponse apiResponse = new ApiResponse();
    try {
      URL url = new URL(API_URL);
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Content-Type", "application/json");

      // Verificamos si la conexion con la api fue exitosa(STATUS 200 o HTTP_OK)
      if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = getDataBuffer(bf);
        Client[] clients = gson.fromJson(response, Client[].class);
        apiResponse.setBody(clients);
      }
    } catch (IOException ioex) {
      /*
       * Si ocurre algun problema mientras queremos obtener los datos de la api,
       * imprimiremos el mensaje del error
       */
      System.out.println(ioex.getMessage());
    }
    return apiResponse;
  }

  String getDataBuffer(BufferedReader bufferToRead) {
    String response = "";
    String readline = "";
    try {
      while ((readline = bufferToRead.readLine()) != null) {
        response += readline;
      }
    } catch (IOException ioex) {
      System.out.println(ioex.getMessage());
    }
    return response;
  }
}
