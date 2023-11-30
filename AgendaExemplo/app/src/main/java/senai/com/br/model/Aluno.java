package senai.com.br.model;

import androidx.annotation.NonNull;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + '\n' +
                "telefone=" + telefone + '\n' +
                "email=" + email + '\n' +
                '}';
    }
}

