package co.com.uco.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewGuia;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        loadGuia();
    }

    private void loadGuia() {
        List<ItemGuia> listaGuia = new ArrayList<>();
        listaGuia.add(new ItemGuia(R.drawable.eiffel, getString(R.string.torre_eiffel), getString(R.string.descripcion_eiffel)));
        listaGuia.add(new ItemGuia(R.drawable.palacio, getString(R.string.palacio), getString(R.string.descripciion_palacio)));
        listaGuia.add(new ItemGuia(R.drawable.torre, getString(R.string.torre), getString(R.string.torre_china)));
        customAdapter = new CustomAdapter(this, listaGuia);
        listViewGuia.setAdapter(customAdapter);
        listViewGuia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemGuia itemGuia = (ItemGuia) listViewGuia.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), itemGuia.getTitulo(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initComponents() {
        listViewGuia = findViewById(R.id.listViewGuia);
    }
}
