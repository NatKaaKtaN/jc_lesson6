package lesson6;

import okhttp3.*;

import java.io.IOException;

public class AccuWeather {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("developer.accuweather.com")
                .addPathSegment("user")
                .build();

        String authBody = "{\n" +
                "    \"username\" : \"natanata\",\n" +
                "    \"password\" : \"mihruta\"\n" +
                "}";
        RequestBody requestAuthBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request requestAuth = new Request.Builder()
                .url(httpUrl)
                .post(requestAuthBody)
                .build();

        Response responseAuth = okHttpClient.newCall(requestAuth).execute();
       System.out.println(responseAuth.isSuccessful());


        Request requestWeather = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/27497")
                .addHeader("apikey", "F2lTmyDwxzA67DWVS3qN1XkGVd52dgJ2")
                .get()
                .build();


        Response requestWeatherBody = okHttpClient.newCall(requestWeather).execute();

        System.out.println(requestWeatherBody.body().string());


    }
}
