package sg.edu.rp.c346.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieItem> movieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView)findViewById(R.id.listViewMovie);
        movieList = new ArrayList<MovieItem>();

        caMovie = new CustomAdapter(this, R.layout.movie_item, movieList);
        lvMovie.setAdapter(caMovie);

        MovieItem item1 = new MovieItem("War for the Planet of the Apes","A 2017 sequel of the Planet of the Apes science fiction franchise", "Pierre Boulle's");
        movieList.add(item1);

        MovieItem item2 = new MovieItem("King Kong","Movie about a giant ape that first appear in 1930s.", "Merian C. Cooper");
        movieList.add(item2);
    }
}
