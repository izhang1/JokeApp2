package app.izhang.jokeactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {

    public static String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getIntent().getExtras() != null) {
            String jokeText = getIntent().getStringExtra(JOKE_KEY);
            TextView textView = findViewById(R.id.tv_joke);
            textView.setText(jokeText);
        }

    }

}
