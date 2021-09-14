package espe.edu.coordinador.repository;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import espe.edu.coordinador.entities.Curso;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Repository
public class CursoRep implements ICursoRep {
    @Value("${espe.edu.apiMatriculas}")
    private String baseUri;

    @Value("${espe.edu.apiMatriculasToken}")
    private String token;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private static final HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    @Override
    public Curso findByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException {
        HttpRequest req = HttpRequest.newBuilder(URI.create(baseUri+"/api/cursos/"+nrc+"/find-by-nrc"))
                .header("Authorization", "Bearer "+token)
                .GET().build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(req, HttpResponse.BodyHandlers.ofString());
        response.thenAccept(res-> System.out.println(res));
        Curso curso = objectMapper.readValue(response.get().body(), Curso.class);
        return curso;
    }

    @Override
    public Boolean existsByNrc(String nrc) throws ExecutionException, InterruptedException {
        HttpRequest req = HttpRequest.newBuilder(URI.create(baseUri+"/api/cursos/"+nrc+"/exists-by-nrc"))
                .header("Authorization", "Bearer "+token)
                .GET().build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(req, HttpResponse.BodyHandlers.ofString());
        response.thenAccept(res-> System.out.println(res));
        return Boolean.parseBoolean(response.get().body());
    }
}
