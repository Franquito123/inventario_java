import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InventarioTest {
    @Test
    public void testCalcularResta() {
        Inventario inv = new Inventario();
        int resultado = inv.calcularResta(180, 93);
        assertEquals(87, resultado, "El resultado de la resta debe ser 87");
    }
}