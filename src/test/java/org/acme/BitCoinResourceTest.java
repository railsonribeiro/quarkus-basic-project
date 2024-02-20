package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class BitCoinResourceTest {
    @Test
    void testBitCoinEndpoint() {
        given()
          .when().get("/bitcoin")
          .then()
             .statusCode(200);
    }

}