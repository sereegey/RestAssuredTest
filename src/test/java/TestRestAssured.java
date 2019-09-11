import io.restassured.RestAssured;
import org.junit.Test;

public class TestRestAssured {
    @Test
    public void testRestAssured(){

        RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2/")
                .basePath("store/inventory")
                .when().get()
                .then()
                .statusCode(200);
    }
}