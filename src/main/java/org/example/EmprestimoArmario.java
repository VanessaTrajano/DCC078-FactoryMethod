package org.example;

public class EmprestimoArmario implements IEmprestimoBiblioteca {

    public String emprestar() {
        return "Empréstimo de armário efetivado";
    }

    public String devolver() {
        return "Devolução de armário efetivada";
    }
}
