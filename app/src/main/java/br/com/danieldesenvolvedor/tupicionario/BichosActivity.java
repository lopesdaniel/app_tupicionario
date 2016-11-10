package br.com.danieldesenvolvedor.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BichosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);

        String[] bichosArray = getResources().getStringArray(R.array.bichos_array);
        String[] bichosDescArray = getResources().getStringArray(R.array.bichos_desc);


        ArrayList<Item> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            String titulo = bichosArray[i];
            String descricao = bichosDescArray[i];

            Item item = new Item(titulo, descricao, R.mipmap.ic_launcher);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.bichos_categoria);

        ListView listView = (ListView) findViewById(R.id.rootBichos);
        listView.setAdapter(adapter);

    }
}
