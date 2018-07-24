package sg.edu.rp.c346.msa4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 17045740 on 24/7/2018.
 */

public class MovieDetailActivity extends AppCompatActivity {

    ImageView ivRated;
    TextView tvTitle, tvYear, tvGenre, tvDescrip, tvWatch, tvTheatre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        ivRated = findViewById(R.id.ivRating);
        tvTitle = findViewById(R.id.tvTitle);
        tvYear = findViewById(R.id.tvYear);
        tvGenre = findViewById(R.id.tvGenre);
        tvDescrip = findViewById(R.id.tvDes);
        tvWatch = findViewById(R.id.tvWatch);
        tvTheatre = findViewById(R.id.tvTheatre);

        Intent intentReceived = getIntent();

        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("desc");
        String watch = intentReceived.getStringExtra("watchDate");
        String theatre = intentReceived.getStringExtra("theatre");
        String rated = intentReceived.getStringExtra("rated");

        tvTitle.setText(title);
        tvYear.setText(year + "-");
        tvGenre.setText(genre);

        tvDescrip.setText("\n" + description + "\n");
        tvWatch.setText("Watch on: " + watch);
        tvTheatre.setText("In theatre: " + theatre + "\n");

        if (rated.equals("g")) {
            ivRated.setImageResource(R.drawable.rating_g);

        } else if (rated.equals("pg")) {
            ivRated.setImageResource(R.drawable.rating_pg);

        } else if (rated.equals("pg13")) {
            ivRated.setImageResource(R.drawable.rating_pg13);

        } else if (rated.equals("nc16")) {
            ivRated.setImageResource(R.drawable.rating_nc16);

        } else if (rated.equals("m18")) {
            ivRated.setImageResource(R.drawable.rating_m18);

        } else {
            ivRated.setImageResource(R.drawable.rating_r21);
        }
    }
}