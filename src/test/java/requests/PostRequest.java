package requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PostRequest {

    private String baseUri ;
    private String endPoint ;
    RequestSpecification requestSpecification;

    public PostRequest(String baseUri, String endPoint) {
        this.baseUri = baseUri;
        this.endPoint = endPoint;
        requestSpecification = given().baseUri(baseUri);
    }

    public void addParameters(String key , String value)
    {
        requestSpecification.queryParam(key,value);
    }

    public void addBody(String body)
    {
        requestSpecification.body(body);
    }

    public Response send()
    {
        return requestSpecification.post(endPoint);
    }
}
