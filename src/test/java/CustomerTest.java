import ArtGallery.Artwork;
import ArtGallery.Customer;
import ArtGallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    private Customer customer;//declare property
    private Artwork artwork;


    @BeforeEach
    public void setUp(){
        this.customer = new Customer("April", 1000);
        this.artwork = new Artwork("pink","Veron",300,876);
    }

    @Test
    public void canGetWallet(){
        int actual = customer.getWallet();
        int expected = 1000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPayGallery(){
        int actual = (customer.getWallet()) - (artwork.getPrice());
        int expected = 700;
        assertThat(actual).isEqualTo(expected);
    }

}
