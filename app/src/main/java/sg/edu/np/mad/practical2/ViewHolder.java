package sg.edu.np.mad.practical2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView desc;
    ImageView image;
    public ViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.name);
        desc= itemView.findViewById(R.id.desc);
        image = itemView.findViewById(R.id.profilepic);
    }
}


