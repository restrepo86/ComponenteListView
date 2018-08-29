package co.com.uco.listview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<ItemGuia> listaItems;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<ItemGuia> listaItems) {
        this.listaItems = listaItems;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    class ViewHolder{
        ImageView imageView;
        TextView txtTitulo;
        TextView txtDescripcion;
    }

    @Override
    public int getCount() {
        return listaItems.size();
    }

    @Override
    public ItemGuia getItem(int position) {
        return listaItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_guia, null);
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.txtTitulo = convertView.findViewById(R.id.txtTitulo);
            holder.txtDescripcion = convertView.findViewById(R.id.txtDescripcion);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imageView.setImageResource(listaItems.get(position).getIdImagen());
        holder.txtTitulo.setText(listaItems.get(position).getTitulo());
        holder.txtDescripcion.setText(listaItems.get(position).getDescripcion());

        return convertView;

    }
}
