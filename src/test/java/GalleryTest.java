import ArtGallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;

    @BeforeEach
    public void setUp(){
        this.gallery = new Gallery("Gallery1", 1000);
    }

    @Test
    public void canAcceptPayment(){
        int actual = gallery.acceptPayment(100);
        int expected = 1100;
        assertThat(actual).isEqualTo(expected);
    }

}
