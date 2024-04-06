package nasa.api;

import nasa.api.requests.CheckedRequests;
import nasa.api.requests.UncheckedRequests;
import nasa.api.spec.Specifications;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public CheckedRequests checkedUnauth = new CheckedRequests(Specifications.getSpec().unauthSpec());
    public UncheckedRequests uncheckedUnauth = new UncheckedRequests(Specifications.getSpec().unauthSpec());
    protected SoftAssertions softy;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        softy = new SoftAssertions();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        softy.assertAll();
    }
}
