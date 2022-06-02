package lesson6;
/*
import com.sun.net.httpserver.Request;
import okhttp3.*;
import java.io.IOException;

public class Booking {
    public static void main(String[] args) throws IOException{
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("restful-booker.herokuapp.com")
                .addPathSegment("auth")
                .build();

        String authBody = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestBody requestAuthBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request requestAuth = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .post(requestAuthBody)
                .build();

        Response responseAuth = okHttpClient.newCall(requestAuth).execute();

        System.out.println(responseAuth.isSuccessful());

        String responseBodyWithToken = responseAuth.body().string();

        System.out.println(responseBodyWithToken);

        String token = responseBodyWithToken.split(":")[1];
        //token = token.replace("\"", "");
        //token = token.replace("}", "");
        token = token.replaceAll("[\"}]", "");
        System.out.println(token);

        //httpUrl.newBuilder().setPathSegment(0, "booking").build();  --

        String createBookingJson = "{\n" +
                "    \"firstname\" : \"Dolly\",\n" +
                "    \"lastname\" : \"Grey\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-08-01\",\n" +
                "        \"checkout\" : \"2022-08-10\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"All\"\n" +
                "}";

        RequestBody requestCreateBookingBody = RequestBody.create(createBookingJson, MediaType.parse("JSON"));

        Request requestCreateBooking = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=%s", token))
                .post(requestCreateBookingBody)
                .build();

        Response createBookingResponse = okHttpClient.newCall(requestCreateBooking).execute();

        System.out.println(createBookingResponse.body().string());



    }
}
*/