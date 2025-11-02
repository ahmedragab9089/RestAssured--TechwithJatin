package tests;

import static io.restassured.RestAssured.*;

import base.AuthService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import request.LoginRequest;
import response.LoginResponse;

public class LoginAPItest {
    @Test
    public void loginApiTest(){
        LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
        RequestSpecification requestSpec = given();
        AuthService authService = new AuthService(requestSpec);
        Response response = authService.login(loginRequest);

        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.getId());

        Assert.assertTrue(loginResponse.getToken() != null);
        Assert.assertEquals(loginResponse.getEmail(), "ALOK1234@yahoo.com");
        Assert.assertEquals(loginResponse.getId(), 1);

    }
}

