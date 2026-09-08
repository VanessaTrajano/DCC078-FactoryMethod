package org.example;

public class EmprestimoSala implements IEmprestimoBiblioteca {

    public String emprestar() {
        return "Empréstimo de sala efetivado";
    }

    public String devolver() {
        return "Devolução de sala efetivada";
    }
}
