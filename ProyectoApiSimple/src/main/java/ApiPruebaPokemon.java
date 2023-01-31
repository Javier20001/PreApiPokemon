import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ApiPruebaPokemon extends javax.swing.JFrame{

    private static HttpClient httpcliente = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public ApiPruebaPokemon(String pokemon){
        
        final HttpRequest requestPost = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/"+pokemon)).build();
        try {
            final HttpResponse<String> response = httpcliente.send(requestPost, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            Pokemon p = gson.fromJson(response.body(), Pokemon.class); 
            System.out.println(p.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
