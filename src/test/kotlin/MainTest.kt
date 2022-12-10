import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*


class MainTest {
    @Test
    @DisplayName("Teste portaria")
    fun testeIdade() {
        Assertions.assertAll(
            { assertEquals(portaria(0, "", ""), "Negado.") },
            { assertEquals(portaria(18, "comum", ""), "Negado.") },
            { assertEquals(portaria(18, "", ""), "Negado.") },
            { assertEquals(portaria(18, "comum", "xrqoiuwehq32"), "Negado.") },
            { assertEquals(portaria(18, "comum", "xtiweorw81"), "Welcome.") },
            { assertEquals(portaria(18, "premium", "xtiweorw81"), "Negado.") },
            { assertEquals(portaria(18, "premium", "xliweorw81"), "Welcome.") },
            { assertEquals(portaria(18, "luxo", "xtiweorw81"), "Negado.") },
            { assertEquals(portaria(18, "luxo", "xliweorw81"), "Welcome.") },
            { assertEquals(portaria(18, "VIP", "45325"), "Negado.") },
        )
    }
}