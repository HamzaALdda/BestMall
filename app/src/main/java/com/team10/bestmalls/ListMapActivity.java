package com.team10.bestmalls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jenev4computer.bestmall.R;

import java.util.ArrayList;
import java.util.List;

public class ListMapActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ImageButton btn_list;
    private ImageButton btn_map;
    private ImageButton btn_search;
    private TextView textView_input;

    private RecyclerView recyclerView;
    private MallAdapter mallAdapter;
    private List<Mall> mallList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_map);

        //-------------RecyclerView ------------------------
        mallList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMall);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mallList.add(
                new Mall( 1, "Forum Gummersbach", "Mit 70 Shops aus verschiedensten Bereichen und Top-Service ist das Forum Gummersbach DAS Shoppingerlebnis im Herzen der Stadt." +
                        "Auf dem alten Steinmüllergelände direkt neben dem ZOB und dem Bahnhof Gummersbach finden Sie vom neuen Lieblingspulli über feinste Leckereien bis hin zum nächsten Traumurlaub alles was Sie brauchen, oder wollen.", "NRW",
                        "Gummersbach",51643, "Steinmülleralle 5",
                        1, 51.024560, 7.565274)
        );
        mallList.add(
                new Mall (2,"Köln Arcaden", "Tauchen Sie ein in die bunte Shoppingwelt der Köln Arcaden und flanieren Sie durch unsere gläsernen Galerien. Entdecken Sie die Geschäfte aus den Bereichen Mode, Schmuck, Elektronik und Lebensmittel und finden Sie zwischendurch Zeit für eine Tasse Kaffee in den zahlreichen Cafés und Restaurants. Lassen Sie sich von der Vielfalt der Angebote verzaubern und verbringen Sie die eine oder andere Pause in den Ruhe-Oasen und unseren zahlreichen Restaurants bei einem Stück Kuchen und einer Tasse Kaffee oder anderen Köstlichkeiten. Die Einkaufswelt der Arcaden bietet Ihnen ein persönliches Shopping Erlebnis – erleben Sie es selbst.", "NRW",
                        "Köln", 51103, "Kalker Hauptstrasse 55",
                        1,50.938064, 6.997962)
        );

        mallAdapter = new MallAdapter(this, mallList);
        recyclerView.setAdapter(mallAdapter);


        textView_input = (EditText) findViewById(R.id.listView_textField_input);


        btn_search  = (ImageButton) findViewById(R.id.listView_btn_search);
        btn_list    = (ImageButton) findViewById(R.id.listView_btn_list);
        btn_map     = (ImageButton) findViewById(R.id.listView_btn_map);

        // On ClickListener
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }

}
