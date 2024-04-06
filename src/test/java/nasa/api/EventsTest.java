package nasa.api;

import nasa.api.requests.unchecked.UncheckedEvents;
import nasa.api.spec.Specifications;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class EventsTest extends BaseAPITest{

    @Test
    public void getAllEvents(){
        new UncheckedEvents(Specifications.getSpec().unauthSpec())
                .getAllOpenEvents()
                .then().assertThat().statusCode(HttpStatus.SC_OK);
    }
}
