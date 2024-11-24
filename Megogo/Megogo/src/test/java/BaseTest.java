import com.megogo.api.endpoints.domain.DomainRequests;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected DomainRequests domainRequests;

    @BeforeEach
    void prepare() {
        domainRequests = new DomainRequests();
    }
}
