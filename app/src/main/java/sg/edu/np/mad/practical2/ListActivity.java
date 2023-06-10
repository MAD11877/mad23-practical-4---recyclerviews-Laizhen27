package sg.edu.np.mad.practical2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageButton icon = findViewById(R.id.imageButton);
        icon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Log.v(TAG,"Icon have been clicked");

                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent profile = new Intent(ListActivity.this,MainActivity.class);
                        Random random = new Random();
                        long UserID = random.nextLong() + 100000000L;// Generates ID bigger than  10million
                        String ID = Long.toString(UserID);
                        Log.v(TAG,ID);
                        profile.putExtra("UserID",ID);
                        startActivity(profile);
                    }
                });
                builder.setNegativeButton("ClOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
                                }
        );
    }
}