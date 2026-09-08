import org.example.EmprestimoBibliotecaFactory;
import org.example.IEmprestimoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoBibliotecaFactoryTest {

    @Test
    void deveRetornarExcecaoParaEmprestimoInexistente() {
        try {
            IEmprestimoBiblioteca emprestimo = EmprestimoBibliotecaFactory.obterEmprestimo("Caderno");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empréstimo inexistente", e.getMessage());
        }
    }
}
