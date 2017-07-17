package sg.edu.rp.c346.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16022603 on 17/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<MovieItem> movieList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<MovieItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDescript = (TextView) rowView.findViewById(R.id.textViewDescript);
        TextView tvAuthor = (TextView) rowView.findViewById(R.id.textViewAuthor);

        // Obtain the to-do item based on the 'position'.
        MovieItem currentItem = movieList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDescript.setText(currentItem.getDescription());
        tvAuthor.setText(currentItem.getAuthor());

        //return the View corresponding to the data at the specified position.
        return rowView;
    }
}
