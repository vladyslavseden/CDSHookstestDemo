package Help.services.rest;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Map;

import static io.restassured.RestAssured.given;

@Component
@Lazy
@Getter
@Setter
@Slf4j
public class RestService {
    protected Response response;
    protected ValidatableResponse json;
    protected RequestSpecification request;

    public RestService() {

        request = new RequestSpecBuilder().addHeader("X-ACCEPTANCE-TEST","TRUE")
                .setConfig(new RestAssuredConfig().sslConfig(new SSLConfig().allowAllHostnames().relaxedHTTPSValidation("TLSv1.2"))
                .logConfig(new LogConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .build();
    }

    public RequestSpecification setPreemptiveBasicAuth(String username, String password) {
        return given().spec(request).auth().preemptive().basic(username, password);
    }

    public RequestSpecification setBasicAuth(String username, String password) {
        return given().spec(request).auth().basic(username, password);
    }

    public RequestSpecification setQueryParam(String parameter, Object... values) {
        return given().spec(request).queryParam(parameter, values);
    }

    public RequestSpecification setParam(String parameter, Object... values) {
        return given().spec(request).param(parameter, values);
    }

    public RequestSpecification setPathParam(String pathParameterName, Object pathParameterValue) {
        return given().spec(request).pathParam(pathParameterName, pathParameterValue);
    }

    public Response sendPostRequest(String endPoint, Map<String, String> body) {
        return response = given().spec(request).body(body).post(endPoint);
    }

    public Response sendPostRequest(String endPoint, String body) {
        return response = given().spec(request).body(body).post(endPoint);
    }

    public Response sendPostRequest(String endPoint, String body, String parameterName, String parameterValue) {
        return response = given().spec(request).pathParam(parameterName, parameterValue).body(body).post(endPoint);
    }

    public Response sendPostRequest(String endPoint, Object object) {
        return response = given().spec(request).body(object).post(endPoint);
    }

    public Response sendPutRequest(String endPoint, Object object) {
        return response = given().spec(request).body(object).put(endPoint);
    }

    public Response sendGetRequest(String endPoint) {
        return response = given().spec(request).get(endPoint);
    }

    public Response sendGetRequest(String endPoint, String parameterName, String parameterValue) {
        return response = given().spec(request).param(parameterName, parameterValue).get(endPoint);
    }

    public Response sendGetRequest(String endPoint, String parameterName1, String parameterValue1, String parameterName2, String parameterValue2) {
        return response = given().spec(request).param(parameterName1, parameterValue1).param(parameterName2, parameterValue2).get(endPoint);
    }

    public Response sendDeleteRequest(String endPoint) {
        return response = given().spec(request).delete(endPoint);
    }

    public RequestSpecification cleanBasicAuth() {
        request = new RequestSpecBuilder()
                .setConfig(new RestAssuredConfig().sslConfig(new SSLConfig().allowAllHostnames().relaxedHTTPSValidation("TLSv1.2"))
                .logConfig(new LogConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .addHeader("X-ACCEPTANCE-TEST","TRUE")
                .build();
        return given().spec(request).auth().none();
    }

    public RequestSpecification setJSONWebTokenAuth(String token) {
        request = new RequestSpecBuilder()
                .setConfig(new RestAssuredConfig().sslConfig(new SSLConfig().allowAllHostnames().relaxedHTTPSValidation("TLSv1.2"))
                .logConfig(new LogConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .addHeader("Authorization", "Bearer "+token)
                .build();
        return given().spec(request);
    }
}
