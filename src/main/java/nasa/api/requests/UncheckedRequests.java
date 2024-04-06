package nasa.api.requests;

import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import nasa.api.requests.unchecked.UncheckedEvents;

@Getter
public class UncheckedRequests {
    private UncheckedEvents eventsRequest;
    public UncheckedRequests(RequestSpecification spec){
        this.eventsRequest = new UncheckedEvents(spec);

    }

}
