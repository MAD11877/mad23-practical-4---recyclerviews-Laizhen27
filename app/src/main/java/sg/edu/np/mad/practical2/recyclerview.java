package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class recyclerview extends AppCompatActivity {

    ArrayList<User> user_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int name = random.nextInt(Integer.MAX_VALUE - 10000000) + 10000000;
            int desc = random.nextInt(Integer.MAX_VALUE - 10000000) + 10000000;
            User user = new User(String.valueOf(name), String.valueOf(desc), i, false);
            user_list.add(user);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        Adapter adapter = new Adapter(user_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}