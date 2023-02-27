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
    String item;
    RecyclerView recyclerView;
    List<listagem> marcaspilsen;
    List<listagem> marcasbock;
    List<listagem> marcaswitbier;
    List<listagem> marcasweissbier;
    List<listagem> marcasamericanipa;
    List<listagem> marcasstout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipagem = (Spinner) findViewById(R.id.spinner_tipagem);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.tiposCerveja, android.R.layout.simple_spinner_item);
        tipagem.setAdapter(adapter);
        Button Pesquisar = (Button) findViewById(R.id.pesquisa);
    }

    public void onClickBuscar(View view) {
        item = tipagem.getSelectedItem().toString();
        //Alterar para receber o valor do spinner = switch/case?
        Toast.makeText(getApplicationContext(), "Tipo escolhido: " + item, Toast.LENGTH_SHORT).show();

        recyclerView = findViewById(R.id.recyclerview);
        marcaspilsen = new ArrayList<listagem>();
        marcasbock = new ArrayList<listagem>();
        marcaswitbier = new ArrayList<listagem>();
        marcasweissbier = new ArrayList<listagem>();
        marcasamericanipa = new ArrayList<listagem>();
        marcasstout = new ArrayList<listagem>();

    switch(item) {
        case "Pilsen":
            marcaspilsen.add(new listagem("Artesanal Imigração", R.drawable.artesanalimigracaopilsen));
            marcaspilsen.add(new listagem("Bamberg", R.drawable.bambergpilsen));
            marcaspilsen.add(new listagem("Dama Bier", R.drawable.damabierpilsen));
            marcaspilsen.add(new listagem("Eisenbahn", R.drawable.eisenbahnpilsen));
            marcaspilsen.add(new listagem("Fred Bier", R.drawable.fredbierpilsen));
            marcaspilsen.add(new listagem("Império", R.drawable.imperiopilsen));
            marcaspilsen.add(new listagem("Patagonia", R.drawable.patagoniapilsen));
            marcaspilsen.add(new listagem("Pilsner Urquell", R.drawable.pilsnerurquellpilsen));
            marcaspilsen.add(new listagem("Schornstein", R.drawable.schornsteinpilsen));
            marcaspilsen.add(new listagem("Wäls", R.drawable.walspevepilsen));

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(), marcaspilsen));
            break;

        case "Bock":
            marcasbock.add(new listagem("Paulaner Salvator",R.drawable.paulanersalvatorbock));
            marcasbock.add(new listagem("German Dunkler Weizenbock",R.drawable.germandunklerbock));
            marcasbock.add(new listagem("Weizenbock Weihenstephaner Vitus",R.drawable.weizenbock));
            marcasbock.add(new listagem("Schneider Weiss",R.drawable.schneiderweissbock));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),marcasbock));
            break;
        case "Witbier":
            marcaswitbier.add(new listagem("Bier Hoff",R.drawable.bierhoffwitbier));
            marcaswitbier.add(new listagem("Grand Cru",R.drawable.gradcruwitbier));
            marcaswitbier.add(new listagem("Damm Estrella Inedit",R.drawable.dammwitbier));
            marcaswitbier.add(new listagem("Dieu du Ciel",R.drawable.dieuducielwitbier));
            marcaswitbier.add(new listagem("Hoegaarden",R.drawable.hoegaardenwitbier));
            marcaswitbier.add(new listagem("La Trappe",R.drawable.latrappewitbier));
            marcaswitbier.add(new listagem("Vedett",R.drawable.vedettwitbier));
            marcaswitbier.add(new listagem("Baden Baden",R.drawable.badenbadenwitbier));
            marcaswitbier.add(new listagem("Bastards",R.drawable.bastardswitbier));
            marcaswitbier.add(new listagem("Faxe",R.drawable.faxewitbier));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),marcaswitbier));
            break;

        case "Weissbier":
            marcasweissbier.add(new listagem("Hoegaarden",R.drawable.hoegaardenweissbier));
            marcasweissbier.add(new listagem("Weihenstephaner Hefe",R.drawable.weihenstephanerweissbier));
            marcasweissbier.add(new listagem("Patagonia",R.drawable.patagoniaweissbier));
            marcasweissbier.add(new listagem("Eisenbahn",R.drawable.eisenbahnweissbier));
            marcasweissbier.add(new listagem("Baden Baden",R.drawable.badenbadenweissbier));
            marcasweissbier.add(new listagem("Vedett",R.drawable.vedettweissbier));
            marcasweissbier.add(new listagem("Franziskaner Hefe",R.drawable.franziskanerweissbier));
            marcasweissbier.add(new listagem("Erdinger Dunkel",R.drawable.erdingerweissbier));
            marcasweissbier.add(new listagem("Erdinger Pikantus",R.drawable.erdingerpikantus));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),marcasweissbier));
            break;

        case "American IPA":
            marcasamericanipa.add(new listagem("Colorado",R.drawable.coloradoipa));
            marcasamericanipa.add(new listagem("Baden Baden",R.drawable.badenbadenipa));
            marcasamericanipa.add(new listagem("Roleta Russa IPA",R.drawable.roletarussaipa));
            marcasamericanipa.add(new listagem("Session Citra",R.drawable.sessioncitraipa));
            marcasamericanipa.add(new listagem("Schornstein",R.drawable.schornsteinipa));
            marcasamericanipa.add(new listagem("Goose",R.drawable.gooseipa));
            marcasamericanipa.add(new listagem("Patagonia",R.drawable.patagoniaipa));
            marcasamericanipa.add(new listagem("Bodebrown",R.drawable.bodebrownipa));
            marcasamericanipa.add(new listagem("Tarantino",R.drawable.tarantinoipa));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),marcasamericanipa));
            break;

        case "Stout":
            marcasstout.add(new listagem("Wäls Petroleum",R.drawable.walsstout));
            marcasstout.add(new listagem("Leopoldina",R.drawable.leopoldinastout));
            marcasstout.add(new listagem("Belhaven",R.drawable.belhavenstout));
            marcasstout.add(new listagem("Fuller's",R.drawable.fullersstout));
            marcasstout.add(new listagem("Schornstein",R.drawable.schornsteinstout));
            marcasstout.add(new listagem("Dama Bier",R.drawable.damabierstout));
            marcasstout.add(new listagem("Guinness",R.drawable.guinnessstout));
            marcasstout.add(new listagem("Dádiva",R.drawable.dadivastout));
            marcasstout.add(new listagem("Blumenau",R.drawable.blumenaustout));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),marcasstout));
            break;

        }

    }
}