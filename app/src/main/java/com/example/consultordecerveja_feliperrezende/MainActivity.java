package com.example.consultordecerveja_feliperrezende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner tipagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipagem = (Spinner) findViewById(R.id.spinner_tipagem);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.tiposCerveja, android.R.layout.simple_spinner_item);
        tipagem.setAdapter(adapter);
        Button Pesquisar = (Button) findViewById(R.id.pesquisa);
        Pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = tipagem.getSelectedItem().toString();
                //Alterar para receber o valor do spinner = switch/case?
                Toast.makeText(getApplicationContext(), "Tipo escolhido: " + item, Toast.LENGTH_SHORT).show();

               }

        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<listagem> items = new ArrayList<listagem>();
                items.add(new listagem("Artesanal Imigração",R.drawable.artesanalimigracaopilsen));
        items.add(new listagem("Bamberg",R.drawable.bambergpilsen));
        items.add(new listagem("Dama Bier",R.drawable.damabierpilsen));
        items.add(new listagem("Eisenbahn",R.drawable.eisenbahnpilsen));
        items.add(new listagem("Fred Bier",R.drawable.fredbierpilsen));
        items.add(new listagem("Império",R.drawable.imperiopilsen));
        items.add(new listagem("Patagonia",R.drawable.patagoniapilsen));
        items.add(new listagem("Pilsner Urquell",R.drawable.pilsnerurquellpilsen));
        items.add(new listagem("Schornstein",R.drawable.schornsteinpilsen));
        items.add(new listagem("Wäls",R.drawable.walspevepilsen));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}