package edu.upc.dsa.dsa_error404_android;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @POST("api/game/users/register")
    Call<User> registerUser(@Body Credentials credentials);

    @POST("api/game/users/login")
    Call<User> loginUser(@Body Credentials credentials);

    @POST("api/game/users/objects/buy")
    Call<User> comprarItem(@Body CompraRequest request);

    @GET("api/game/shop/objects")
    Call<List<GameObject>> getALLGameObjects();

    @GET("api/game/users/{username}")
    Call<User> getUser(@Path("username") String username);

    @GET("api/game/users/objects/list")
    Call<List<GameObject>> getUserObjects(@Query("nombre") String nombre);

    @GET("api/game/events")
    Call<List<Evento>> getEventos();

    @POST("api/game/events/{id}/register")
    Call<Void> registerEvento(@Path("id") String id, @Body RegistroEventoRequest request);
}

