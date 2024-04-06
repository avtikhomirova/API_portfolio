package nasa.api.requests.checked;

import io.restassured.specification.RequestSpecification;
import nasa.api.models.Events;
import nasa.api.requests.CRUDInterface;
import nasa.api.requests.Request;
import nasa.api.requests.unchecked.UncheckedEvents;
import org.apache.http.HttpStatus;

public class CheckedEvents extends Request implements CRUDInterface {
    public CheckedEvents(RequestSpecification spec) {
        super(spec);
    }

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

    public Events getAllOpenEvents(){
        return new UncheckedEvents(spec)
                .getAllOpenEvents()
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(Events.class);
    }
}
