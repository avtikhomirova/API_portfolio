package nasa.api.requests.unchecked;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import nasa.api.requests.CRUDInterface;
import nasa.api.requests.Request;

import static io.restassured.RestAssured.given;

public class UncheckedEvents extends Request implements CRUDInterface {
    public UncheckedEvents(RequestSpecification spec) {
        super(spec);
    }
    private static final String EVENTS_ENDPOINT = "/api/v2.1/events";

    @Override
    public Object create(Object obj) {
        return null;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public Object update(String id, Object obj) {
        return null;
    }

    @Override
    public Object delete(String id) {
        return null;
    }

    public Response getAllOpenEvents(){
        return given()
                .spec(spec)
                .get(EVENTS_ENDPOINT + "?status=open");
    }
}
