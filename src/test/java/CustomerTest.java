import ArtGallery.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    private Customer customer; //declare property

    @BeforeEach
    public void setUp(){
        this.customer = new Customer("April", 1000);
    }

    @Test
    public void canGetWallet(){
        int actual = customer.getWallet();
        int expected = 1000;
        assertThat(actual).isEqualTo(expected);
    }

}
