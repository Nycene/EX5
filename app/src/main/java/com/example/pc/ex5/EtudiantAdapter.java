package com.example.pc.ex5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by PC on 15/02/2018.
 */

public class EtudiantAdapter extends RecyclerView.Adapter<EtudiantAdapter.EtudiantHolder>{
    private Context context;
    private LayoutInflater inflater;
    List<Etudiant> data= Collections.emptyList();
    Etudiant etudiant;
    public EtudiantAdapter(Context context, List<Etudiant> data ){
        this.context=context;
        inflater=LayoutInflater.from(context);
        this.data=data;
    }
    @Override
    public EtudiantHolder onCreateViewHolder(ViewGroup parent,int viewtype){
        View view =inflater.inflate(R.layout.etudiantinfo2,parent,false);
        EtudiantHolder holder=new EtudiantHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EtudiantAdapter.EtudiantHolder holder, int position) {
etudiant=data.get(position);
holder.nom.setText(etudiant.getNom());
        holder.email.setText(etudiant.getEmail());
        holder.option.setText(etudiant.getOption());
        holder.abs.setText(""+etudiant.getAbs());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class EtudiantHolder extends RecyclerView.ViewHolder{
        public TextView nom;
        public TextView email;
        public TextView option;
        public TextView abs;
        public ImageView avatar;
    public EtudiantHolder(View itemView){
        super(itemView);
        nom=(TextView) itemView.findViewById(R.id.nom);
        email=(TextView) itemView.findViewById(R.id.email);
        option=(TextView) itemView.findViewById(R.id.option);
       abs=(TextView) itemView.findViewById(R.id.abs);
        avatar=(ImageView) itemView.findViewById(R.id.avatar);
    }
    }
}
