package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ServerExceptionMapperBridgeBugTest {

    @Test
    void genericMapperShouldReturn499() {
        RestAssured.get("/test/generic")
                .then().statusCode(499);
    }

    @Test
    void simpleMapperShouldReturn497() {
        RestAssured.get("/test/non-generic")
                .then().statusCode(497);
    }
}
