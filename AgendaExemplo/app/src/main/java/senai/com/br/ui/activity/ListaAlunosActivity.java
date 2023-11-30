package senai.com.br.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import senai.com.agendaexemplo.R;
import senai.com.br.dao.AlunoDAO;


public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Toast.makeText(this, "Boa Tarde, Adriana ", Toast.LENGTH_LONG).show();
        TextView titulo = new TextView(this);
        titulo.setText("Faculdade Senai");
        setContentView(titulo);*/



        /*TextView primeiroAluno = findViewById(R.id.textView);
        TextView segundoAluno = findViewById(R.id.textView2);
        TextView terceiroAluno = findViewById(R.id.textView3);
        TextView quartoAluno = findViewById(R.id.textView4);
        TextView quintoAluno = findViewById(R.id.textView5);
        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
        quartoAluno.setText(alunos.get(3));
        quintoAluno.setText(alunos.get(4)); */



        setContentView(R.layout.activity_lista_alunos);



        setTitle("Lista de Alunos");

        FloatingActionButton  botaoNovoAluno = findViewById(R.id.activity_lista_alunos_fab_novo_aluno);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class));

            }
        });
        //View viewById = findViewById(R.id.activity_lista_alunos_listview);






        //findViewById(R.id.activity_lista_alunos_listview);

        //List<String> alunos = new ArrayList<>(Arrays.asList("Adriana","Heloisa","Pedro","Maria", "Catarina"));





    }


        @Override
        protected void onResume () {
            super.onResume();
            AlunoDAO dao = new AlunoDAO();
            ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
            listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dao.todos()));
        }
    }