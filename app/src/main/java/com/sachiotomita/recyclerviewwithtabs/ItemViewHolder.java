package com.sachiotomita.recyclerviewwithtabs;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sat on 1/20/20.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {


    public TextView name_TextView, iso_TextView;
    ImageView imageView, imageViewMore;

    public ItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        name_TextView = (TextView) itemView.findViewById(R.id.country_name);
        iso_TextView = (TextView) itemView.findViewById(R.id.country_iso);

        itemView.setOnCreateContextMenuListener(this);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        menu.setHeaderTitle("Select The Action");
        menu.add(Menu.NONE, v.getId(), 0, "Call");//groupId, itemId, order, title
        menu.add(Menu.NONE, v.getId(), 0, "SMS");

    }



    public void bind(Student student) {
        name_TextView.setText(student.getName());
        iso_TextView.setText(student.getAdd() );

    }

}
