package com.example.mufasa.mapviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstView;

    String[] hsp={"Nairobi Hospital",
            "Aga Khan Hospital",
            "Guru Nanak",
            "KNH",
            "Mathare",
            "Matter Hospital",
            "Avenue Hospital",
            "Lions Hospital",
            "Pumwani Hospital",
            "Getrudes Hospital"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstView=(ListView) findViewById(R.id.lstView);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,R.layout.support,hsp);

        lstView.setAdapter(adapter);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){

                    Intent nairobi= new Intent(getApplicationContext(),MapsActivity.class);
                    startActivity(nairobi);

                }else if (i==1){

                    Intent AgaKhan=new Intent(getApplicationContext(),AgaKhan.class);
                    startActivity(AgaKhan);

                }else if (i==2){
                    Intent GuruNanak=new Intent(getApplicationContext(),GuruNanak.class);
                    startActivity(GuruNanak);

                }else if (i==3){
                    Intent KNH=new Intent(getApplicationContext(),KNH.class);
                    startActivity(KNH);

                }else if (i==4){
                    Intent Mathare=new Intent(getApplicationContext(),Mathare.class);
                    startActivity(Mathare);

                }else if (i==5){
                    Intent Matter=new Intent(getApplicationContext(),Matter.class);
                    startActivity(Matter);

                }else   if (i==6){
                    Intent avenue=new Intent(getApplicationContext(),avenue.class);
                    startActivity(avenue);

                }else if (i==7){
                    Intent Lions=new Intent(getApplicationContext(),Lions.class);
                    startActivity(Lions);

                }else if (i==8){
                    Intent Pumwani=new Intent(getApplicationContext(),Pumwani.class);
                    startActivity(Pumwani);

                }else {
                    //when (i==9)
                    Intent Gertrudes=new Intent(getApplicationContext(),Gertrudes.class);
                    startActivity(Gertrudes);
                }

            }
        });

    }
}
