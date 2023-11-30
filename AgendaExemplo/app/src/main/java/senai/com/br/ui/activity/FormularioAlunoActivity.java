package senai.com.br.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import senai.com.agendaexemplo.R;
import senai.com.br.dao.AlunoDAO;
import senai.com.br.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activiy_formulario_aluno);

        final AlunoDAO alunodao = new AlunoDAO();


        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        setTitle("Lista de Alunos");
        //View viewById = findViewById(R.layout.activiy_formulario_aluno);
        Button botaoSalvar = findViewById(R.id.activity_formulari_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                Aluno alunoCriado = new Aluno(nome, telefone, email);

                //inserir os dados para um banco de dados permanente, atravez do  DAO
                alunodao.salva(alunoCriado);
                finish();

                //startActivity(new Intent(FormularioAlunoActivity.this, ListaAlunosActivity.class));


                //mostra na tela os dados digitados na tela
                //Toast.makeText(FormularioAlunoActivity.this, alunoCriado.getNome() + " - " + alunoCriado.getTelefone() + " - " + alunoCriado.getEmail(), Toast.LENGTH_SHORT).show();

                //Toast.makeText(FormularioAlunoActivity.this, "Cliquei no botao salvar",
                // Toast.LENGTH_LONG).show();
            }


        });


    }
}