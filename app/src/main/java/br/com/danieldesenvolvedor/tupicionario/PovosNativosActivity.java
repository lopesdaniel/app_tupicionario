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

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] povosNativosArray = getResources().getStringArray(R.array.povos_nativos_array);
        String[] povosNativosDescArray = getResources().getStringArray(R.array.povos_nativos_desc);

        ArrayList<Item> list = new ArrayList<>();

        for (int i=0;i<10;i++){
            String titulo = povosNativosArray[i];
            String descricao = povosNativosDescArray[i];

            Item item = new Item(titulo, descricao, R.mipmap.ic_launcher);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.categoria_povos_nativos);

        ListView listView = (ListView) findViewById(R.id.rootPovosNativos);
        listView.setAdapter(adapter);

    }
}
