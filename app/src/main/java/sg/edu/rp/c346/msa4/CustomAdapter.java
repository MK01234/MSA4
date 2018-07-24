package sg.edu.rp.c346.msa4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17045740 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<test> toDoList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<test> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDate = rowView.findViewById(R.id.tvYear);
        TextView tvgerne = rowView.findViewById(R.id.tvGenre);
        ImageView ivImpt = rowView.findViewById(R.id.ivRating);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        test currentItem = toDoList.get(position);
        tvTitle.setText(currentItem.getName());
        tvDate.setText(currentItem.getYear());
        tvgerne.setText(currentItem.getGenre());

        if (currentItem.getRating().equals("g")){
            ivImpt.setImageResource(R.drawable.rating_pg);

        } else{
            ivImpt.setImageResource(R.drawable.rating_pg13);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
