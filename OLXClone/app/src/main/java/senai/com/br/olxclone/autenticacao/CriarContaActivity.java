package senai.com.br.olxclone.autenticacao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import senai.com.br.olxclone.R;

public class CriarContaActivity extends AppCompatActivity {

    private EditText edt_nome;
    private EditText edt_email;
    private EditText edt_telefone;
    private EditText edt_senha;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criarconta);

        iniciaComponentes();


    }

    public void validaDados(View v) {
        String nome = edt_nome.getText().toString();
        String email = edt_email.getText().toString();
        String telefone = edt_telefone.getText().toString();
        String senha = edt_senha.getText().toString();


        if (!nome.isEmpty()) {
            if (!email.isEmpty()){
                if(!telefone.isEmpty()){
                    if(!senha.isEmpty()){
                        Toast.makeText(this, "Tudo Certo", Toast.LENGTH_SHORT).show();

                    }else{
                        edt_senha.requestFocus();
                        edt_senha.setError("Preencha sua senha");
                    }

                }else{
                    edt_telefone.requestFocus();
                    edt_telefone.setError("Preencha seu Telefone");
                }

            } else {
                edt_email.requestFocus();
                edt_email.setError("Preencha seu Email");
            }

        } else {
            edt_nome.requestFocus();
            edt_nome.setError("Preencha seu nome");
        }


    }

    private void iniciaComponentes(){

    edt_nome = findViewById(R.id.edt_Nome);
    edt_email = findViewById(R.id.edt_email);
    edt_telefone = findViewById(R.id.edt_telefone);
    edt_senha = findViewById(R.id.edt_senha);
    progressBar = findViewById(R.id.ProgressBar);

    }
}
