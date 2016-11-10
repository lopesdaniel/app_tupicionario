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

public class CulinariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] culinariaArray = getResources().getStringArray(R.array.culinaria_array);
        String[] culinariaDescArray = getResources().getStringArray(R.array.culinaria_desc);

        ArrayList<Item> list = new ArrayList<>();

        for (int i=0;i<10;i++){
            String titulo = culinariaArray[i];
            String descricao = culinariaDescArray[i];

            Item item = new Item(titulo, descricao, R.mipmap.ic_launcher);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.culinaria_categoria);

        ListView listView = (ListView) findViewById(R.id.rootCulinaria);
        listView.setAdapter(adapter);

    }
}
