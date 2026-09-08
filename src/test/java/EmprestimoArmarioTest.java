import org.example.EmprestimoBibliotecaFactory;
import org.example.IEmprestimoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoArmarioTest {

    @Test
    void deveExecutarEmprestimoArmario() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Armario");
        assertEquals("Empréstimo de armário efetivado", servico.emprestar());
    }

    @Test
    void deveCancelarEmprestimoArmario() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Armario");
        assertEquals("Devolução de armário efetivada", servico.devolver());
    }
}
