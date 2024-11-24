import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DomainsTests extends BaseTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void verifyDomainsTest(Integer domainNumber) {
        var domain = domainRequests.getDomain(domainNumber.toString());
        assertThat(domain.getCountry()).isEqualTo("Ukraine");
    }
}
