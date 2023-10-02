package br.fepi.prova.gerenciamentocontato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Contato contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novoContato (View view){
        EditText nome = findViewById(R.id.nome);
        EditText email = findViewById(R.id.email);
        EditText telefone = findViewById(R.id.telefone);


        contato = new Contato();
        contato.setNome(nome.getText().toString());
        contato.setEmail(email.getText().toString());
        contato.setTelefone(telefone.getText().toString());

        Intent i = new Intent(MainActivity.this, vercontato.class);
        i.putExtra("nome", contato.getNome());
        i.putExtra("email", contato.getEmail());
        i.putExtra("telefone", contato.getTelefone());
        startActivity(i);

    }


}