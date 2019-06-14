package cs4330.cs.utep.edu.panicbutton.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyService {
  /*  @POST("register")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("name") String name,
                                    @Field("lastname") String lastname,
                                    @Field("password") String password,
                                    @Field("username")String username);



    @POST("login")
    @FormUrlEncoded
    Observable<String> loginUser(@Field("username")String username,
                                 @Field("password")String password);
                                 */

    @POST("location")
    @FormUrlEncoded
    Observable<String> locationUser(@Field("latitude") double latitude,
                                    @Field("longitude") double longitude,
                                    @Field("timeStamp")long timeStamp);

    

}
