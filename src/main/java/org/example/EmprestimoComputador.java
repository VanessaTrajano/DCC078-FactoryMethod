package org.example;

public class EmprestimoComputador implements IEmprestimoBiblioteca {

    public String emprestar() {
        return "Empréstimo de computador efetivado";
    }

    public String devolver() {
        return "Devolução de computador efetivada";
    }
}
