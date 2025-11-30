package base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.LoginRequest;
import request.SignupRequest;

import java.util.HashMap;

public class AuthService extends BaseService{
    //constructor
    public AuthService(RequestSpecification requestSpecification) {
        super(requestSpecification);
    }
    private static final String BASE_PATH = "/api/auth";

    public Response login(LoginRequest payload){
        return postRequest(payload, BASE_PATH + "/login");
    }

    public Response signup(SignupRequest payload){
        return postRequest(payload, BASE_PATH + "/signup");
    }

    public Response forgetPassword(String emailAddress){
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
         return postRequest(payload, BASE_PATH + "/forgot-password");
    }

}
