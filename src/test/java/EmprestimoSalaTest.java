import org.example.EmprestimoBibliotecaFactory;
import org.example.IEmprestimoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoSalaTest {

    @Test
    void deveExecutarEmprestimoSala() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Sala");
        assertEquals("Empréstimo de sala efetivado", servico.emprestar());
    }

    @Test
    void deveCancelarEmprestimoSala() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Sala");
        assertEquals("Devolução de sala efetivada", servico.devolver());
    }
}
