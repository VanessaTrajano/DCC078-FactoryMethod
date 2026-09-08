import org.example.EmprestimoBibliotecaFactory;
import org.example.IEmprestimoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoComputadorTest {

    @Test
    void deveExecutarEmprestimoComputador() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Computador");
        assertEquals("Empréstimo de computador efetivado", servico.emprestar());
    }

    @Test
    void deveCancelarEmprestimoComputador() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Computador");
        assertEquals("Devolução de computador efetivada", servico.devolver());
    }
}
