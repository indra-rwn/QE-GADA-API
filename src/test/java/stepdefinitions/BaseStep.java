package stepdefinitions;

import config.GlobalVariable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class BaseStep {

    public GlobalVariable globalVariable = new GlobalVariable();
    public Response response;

    public RequestSpecification createHeaderHttpRequest(String token) {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Authorization", token);
        return requestSpecification;
    }

    public Response createRequest(String token, String json, String endpoint) {
        return createHeaderHttpRequest(token).body(json).post(globalVariable.environment + endpoint);
    }
}