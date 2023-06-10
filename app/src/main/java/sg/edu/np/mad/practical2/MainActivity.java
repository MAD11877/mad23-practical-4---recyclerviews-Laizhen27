package sg.edu.np.mad.practical2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "on Create!!");
        User user = new User("john","Male",1,false);
        TextView UserID= findViewById(R.id.UserID);
        Intent ReceiveID= getIntent();
        String ID= ReceiveID.getStringExtra("UserID");
        UserID.setText("MAD"+ID);
        Button follow = findViewById(R.id.follow);
        if(user.followed == false){
            follow.setText("Follow");
        }
        else{
            follow.setText("Unfollow");
        }
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.followed == false){
                    follow.setText("UnFollow");
                    user.followed=true;
                }
                else
                {
                    user.followed=false;
                    follow.setText("Follow");
                }
            }
        });
    }

}