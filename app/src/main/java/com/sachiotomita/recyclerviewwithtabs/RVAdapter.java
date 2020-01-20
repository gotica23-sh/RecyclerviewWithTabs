package com.sachiotomita.recyclerviewwithtabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by sat on 1/20/20.
 */
public class RVAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    Context mcContext;
    List<Student> studentList;

    public RVAdapter(Context mcContext, List<Student> studentList) {

        this.mcContext = mcContext;
        this.studentList = studentList;
    }



    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.bind(student);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}