package com.example.pc.ex5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView myrcv=(RecyclerView)findViewById(R.id.rcv);
        List<Etudiant> data=genererEtudiant();
        EtudiantAdapter myadapter =new EtudiantAdapter(MainActivity.this,data);
        myrcv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myrcv.setAdapter(myadapter);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id== R.id.search) {
            Toast.makeText(getApplicationContext(),"Rechercher un etudiant", Toast.LENGTH_LONG).show();
        }
        if (id== R.id.add){
            Toast.makeText(getApplicationContext(),"Ajouter un etudiant",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.delete){
            Toast.makeText(getApplicationContext(),"supprimer un etudiant",Toast.LENGTH_LONG).show();
        }
        if(id== R.id.edit) {
            Toast.makeText(getApplicationContext(),"Modifier un etudiant",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }


    private List<Etudiant> genererEtudiant(){
        List<Etudiant> etudiants =new ArrayList<Etudiant>();
        etudiants.add(new  Etudiant("NTS","ichrak","nomsd2@ooo.com",2));
        etudiants.add(new  Etudiant("glid","ahmed","ndd<som2@ooo.com",7));
        etudiants.add(new  Etudiant("NTS","salah","nod<sm2@ooo.com",1));
        etudiants.add(new  Etudiant("glid","ali","nd<om2@ooo.com",2));
        etudiants.add(new  Etudiant("NTS","salma","nomsd2@ooo.com",2));
        etudiants.add(new  Etudiant("glid","ameni","ndd<som2@ooo.com",7));
        etudiants.add(new  Etudiant("NTS","ines","nod<sm2@ooo.com",1));
        etudiants.add(new  Etudiant("glid","asma","nd<om2@ooo.com",2));
return etudiants;
    }
}
