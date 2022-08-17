import ArtGallery.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    private Artwork artwork;

    @BeforeEach
    public void setUp(){
        this.artwork = new Artwork("Magenta", "ZoeG", 500, 9);

    }

    @Test
    public void canGetPrice(){
        int actual = artwork.getPrice();
        int expected = 500;
        assertThat(actual).isEqualTo(expected);
    }


}
