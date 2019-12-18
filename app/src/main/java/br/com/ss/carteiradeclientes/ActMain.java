package br.com.ss.carteiradeclientes;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

public class ActMain extends AppCompatActivity {

    private RecyclerView lstDados;
    private FloatingActionButton fab;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);
        lstDados = findViewById(R.id.lsdDados);

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent - chama qualser conteudo Activit, internas ou externas, como paginas da web, etc.
                Intent it = new Intent(ActMain.this, ActCadCliente.class);
                startActivity(it);
            }
        });*/
    }
    public void cadastrar(View view){
        // Intent - chama qualquer conteúdo Activit, internas ou externas, como paginas da web, etc.
        Intent it = new Intent(ActMain.this, ActCadCliente.class);
        startActivity(it);
    }

}
