package tests;

import base.AuthService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import request.SignupRequest;

import static io.restassured.RestAssured.given;

public class AccountCreationTest {
    @Test(description = "Verfiy if Signup API is working")
    public void createAccountTest(){
       SignupRequest signupRequest = new SignupRequest.Builder().userName("AhmedRagab")
                .email("ahmedragab9089@gmail.com")
                .firstName("Ahmed")
                .lastName("Ragab")
                .password("Asd123!@#")
                .mobileNumber("01277410198")
                .build();
        RequestSpecification requestSpec = given();
        AuthService authService = new AuthService(requestSpec);
        Response response =  authService.signup(signupRequest);
        System.out.println(response.asPrettyString());

    }
}
