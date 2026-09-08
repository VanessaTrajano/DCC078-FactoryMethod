package org.example;

public class EmprestimoLivro implements IEmprestimoBiblioteca {

    public String emprestar() {
        return "Empréstimo de livro efetivado";
    }

    public String devolver() {
        return "Devolução de livro efetivada";
    }
}
