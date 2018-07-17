package com.aprendiz.ragp.quindioturistico3b.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprendiz.ragp.quindioturistico3b.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AdapterT extends RecyclerView.Adapter<AdapterT.Holder> {
    List<Sitio> sitioList = new ArrayList<>();
    int item;
    Context context;
    private OnItemClickListener mlistener;
    public interface OnItemClickListener{
        void itemClick (int position);
    }

    @Override
    public AdapterT.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(item, null);
        Holder holder = new Holder(view,mlistener);
        return null;
    }

    @Override
    public void onBindViewHolder(AdapterT.Holder holder, int position) {
        holder.connectData(sitioList.get(position));
    }

    @Override
    public int getItemCount() {
        return sitioList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView txtnombre;
        TextView txtUbicacion;
        TextView txtDescripcion;
        ImageView imagen = itemView.findViewById(R.id.imgItem);
        public Holder(final View itemView, final OnItemClickListener mlistener) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mlistener!=null){
                        int position = getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            mlistener.itemClick(position);
                        }
                    }
                }
            });

        }

        public void connectData(Sitio sitio){
            if (item== R.layout.item_lista){
                txtnombre=itemView.findViewById(R.id.txtNombreLista);
                txtUbicacion=itemView.findViewById(R.id.txtUbicacionLista);
                txtDescripcion=itemView.findViewById(R.id.txtDescripcionLista);
                txtUbicacion.setText(sitio.getUbicacion());
                txtDescripcion.setText(sitio.getDescripcionc());
            }

            if (item== R.layout.item_grid){
                txtnombre=itemView.findViewById(R.id.txtNombreGrid);
                txtUbicacion=itemView.findViewById(R.id.txtUbicacionGrid);
                txtUbicacion.setText(sitio.getUbicacion());
            }

            if (item== R.layout.item_land){
                txtnombre=itemView.findViewById(R.id.txtNombreLand);
            }

            txtnombre.setText(sitio.getNombre());

            BitmapFactory.Options op = new BitmapFactory.Options();
            op.inSampleSize = 4;
            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),sitio.getImagen(),op);
            imagen.setImageBitmap(bitmap);

        }

    }

}
