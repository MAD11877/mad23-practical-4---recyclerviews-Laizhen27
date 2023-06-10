package sg.edu.np.mad.practical2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<User> user_list;
    public Adapter(ArrayList<User> input){
        this.user_list = user_list;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new ViewHolder(item);
    }
    public void onBindViewHolder(ViewHolder Holder, int position){
        User user_details = user_list.get(position);
        Holder.name.setText(user_details.getName());
        Holder.desc.setText(user_details.getDescription());
    }
    public int getItemCount(){
        return user_list.size();
    }
}


