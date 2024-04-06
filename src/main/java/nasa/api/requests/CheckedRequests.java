package nasa.api.requests;

import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import nasa.api.requests.checked.CheckedEvents;

@Getter
public class CheckedRequests {
    private CheckedEvents eventsRequest;
    public CheckedRequests(RequestSpecification spec){
        this.eventsRequest = new CheckedEvents(spec);

    }
}
