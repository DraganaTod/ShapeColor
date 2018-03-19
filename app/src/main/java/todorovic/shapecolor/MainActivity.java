package todorovic.shapecolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        gameView = new GameView(this);
        super.onCreate(savedInstanceState);
        setContentView(gameView);

        final Button button = findViewById(R.id.button_id);


        //get the button
    } //
}
