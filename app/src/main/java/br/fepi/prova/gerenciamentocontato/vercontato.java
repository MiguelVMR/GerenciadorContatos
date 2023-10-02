package br.fepi.prova.gerenciamentocontato;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class vercontato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vercontato);



        // Receber os dados do Intent
        String nomeContato = getIntent().getStringExtra("nome");
        String emailContato = getIntent().getStringExtra("email");
        String telefoneContato = getIntent().getStringExtra("telefone");

        // Encontrar os TextViews no layout
        TextView nomeTextView = findViewById(R.id.nomeContato);
        TextView emailTextView = findViewById(R.id.emailContato);
        TextView telefoneTextView = findViewById(R.id.telefoneContato);

        // Definir os textos nos TextViews
        nomeTextView.setText(nomeContato);
        emailTextView.setText(emailContato);
        telefoneTextView.setText(telefoneContato);

    }


    public void editar(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Tem certeza de que deseja editar este contato?");
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        builder.setNegativeButton("Não", null);
        builder.show();
    }


}