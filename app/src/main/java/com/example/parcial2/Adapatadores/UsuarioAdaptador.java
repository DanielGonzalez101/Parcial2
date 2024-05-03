package com.example.parcial2.Adapatadores;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.R;
import com.example.parcial2.clases.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder> {

    private List<Usuario> datos;

    public UsuarioAdaptador(List<Usuario> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public UsuarioAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdaptador.ViewHolder holder, int position) {
        Usuario dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombreUsuario, txtRaza, txtEstado;
        ImageView img_usuario;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreUsuario = itemView.findViewById(R.id.txtNombreUsuario);
            txtRaza = itemView.findViewById(R.id.txtRaza);
            txtEstado = itemView.findViewById(R.id.txtEstado);
            img_usuario      = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(Usuario dato){
            txtNombreUsuario.setText(dato.getNombre());
            txtRaza.setText(dato.getRaza());
            txtEstado.setText(dato.getEstado());
//            Imagen libreria
            Picasso.get().load(dato.getImagen()).into(img_usuario);
        }
    }

}
