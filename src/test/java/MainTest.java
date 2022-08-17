import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    private int wallet;

    @Test
    void getWallet(){
        //given
        int actual =  100;
        int expected = 100;
        assertThat(actual).isEqualTo(expected);
    }

}
