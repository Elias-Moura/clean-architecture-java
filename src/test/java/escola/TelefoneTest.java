package escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("123", "123456"));
    }
}
