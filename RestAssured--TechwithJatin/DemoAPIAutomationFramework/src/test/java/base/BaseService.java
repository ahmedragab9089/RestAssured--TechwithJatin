package base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.LoginRequest;

public class BaseService {
    //base uri
    //creating the request
    //handling the response
    private static final String BASE_URL = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService(RequestSpecification requestSpecification) {
        this.requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object payload, String endpoiunt){
        return requestSpecification.contentType(ContentType.JSON)
                .body(payload)
                .post(endpoiunt);
    }




}
