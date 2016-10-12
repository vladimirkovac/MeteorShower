package com.example.kovac94.meteorshower;

import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fullscreen mode
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_game);


        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);

        Bitmap bmp = Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bmp);
        canvas.drawCircle(bmp.getWidth()/2,bmp.getHeight()/2,20,paint);

        LinearLayout li = (LinearLayout)findViewById(R.id.rect);
        li.setBackgroundDrawable(new BitmapDrawable(bmp));

        canvas.drawCircle(400,300,30,paint);
        li.setBackgroundDrawable(new BitmapDrawable(bmp));


    }
}
