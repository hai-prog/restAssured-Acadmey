package requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class DeleteRequest {
    private String baseUri ;
    private String endPoint ;
    RequestSpecification requestSpecification;

    public DeleteRequest(String baseUri, String endPoint) {
        this.baseUri = baseUri;
        this.endPoint = endPoint;
        requestSpecification = given().baseUri(baseUri);
    }

    public void addParameter(String key , String value)
    {
        requestSpecification.queryParam(key,value);
    }

    public Response send()
    {
        return requestSpecification.delete(endPoint);
    }

}
