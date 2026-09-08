import org.example.EmprestimoBibliotecaFactory;
import org.example.IEmprestimoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoLivroTest {

    @Test
    void deveExecutarEmprestimoLivro() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Livro");
        assertEquals("Empréstimo de livro efetivado", servico.emprestar());
    }

    @Test
    void deveCancelarEmprestimoLivro() {
        IEmprestimoBiblioteca servico = EmprestimoBibliotecaFactory.obterEmprestimo("Livro");
        assertEquals("Devolução de livro efetivada", servico.devolver());
    }
}
