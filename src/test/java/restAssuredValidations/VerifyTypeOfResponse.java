package restAssuredValidations;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class VerifyTypeOfResponse {
    public static void main(String[] args) {

        //to verify response is a JSON object i.e Map
        RestAssured.get("https://run.mocky.io/v3/1b8d87b8-452d-48cb-83ea-66da05881a11")
                .then()
                .body("", Matchers.instanceOf(Map.class));

        // to verify state of a property within a json
        RestAssured.get("https://run.mocky.io/v3/1b8d87b8-452d-48cb-83ea-66da05881a11")
                .then()
                .body("mob", Matchers.instanceOf(List.class));

        // to verify response is a json array i.e List
        RestAssured.get("https://run.mocky.io/v3/7e34e53b-defd-430a-b2b2-22421dd7d5de")
                .then()
                .body("", Matchers.instanceOf(List.class));




    }
}
