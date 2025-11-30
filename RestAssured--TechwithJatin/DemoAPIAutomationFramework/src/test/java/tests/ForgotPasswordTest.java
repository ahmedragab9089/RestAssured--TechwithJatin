package tests;

import base.AuthService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import request.SignupRequest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class ForgotPasswordTest {
    @Test(description = "Verify if forgot-password API is working")
    public void forgotPasswordTest(){
        AuthService authService = new AuthService(requestSpecification);
        Response response = authService.forgetPassword("ahmedragab9089@gmail.com");
        System.out.println(response.asPrettyString());

    }
}
