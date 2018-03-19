package todorovic.shapecolor;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by Todor on 2018-03-12.
 */

public class GameView extends SurfaceView implements  Runnable {

    volatile boolean playing;



    private Thread gameThread = null;

    public GameView(Context context){
        super(context);
    }

    @Override
    public void run() {
        while(playing){
            //update the frame
            update();

            // draw
            draw();

            //to control
            control();
        }

    }

    private void control() {
    }

    private void draw() {
    }

    private void update() {
    }
}
