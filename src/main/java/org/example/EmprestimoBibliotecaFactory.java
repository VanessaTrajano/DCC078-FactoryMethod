package org.example;

public class EmprestimoBibliotecaFactory {

    public static IEmprestimoBiblioteca obterEmprestimo(String emprestimo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Emprestimo" + emprestimo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Empréstimo inexistente");
        }
        if (!(objeto instanceof IEmprestimoBiblioteca)) {
            throw new IllegalArgumentException("Empréstimo inválido");
        }
        return (IEmprestimoBiblioteca) objeto;
    }
}
