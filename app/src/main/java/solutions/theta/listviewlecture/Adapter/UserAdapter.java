package solutions.theta.listviewlecture.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import solutions.theta.listviewlecture.Model.User;
import solutions.theta.listviewlecture.R;

/**
 * Created by SALAHUDIN` on 3/13/2018.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public ArrayList<User> getOuser() {
        return OListuser;
    }

    public void setOuser(ArrayList<User> ouser) {
        OListuser = ouser;
    }

    public LayoutInflater getOLayoutInflater() {
        return OLayoutInflater;
    }

    public void setOLayoutInflater(LayoutInflater OLayoutInflater) {
        this.OLayoutInflater = OLayoutInflater;
    }

    ArrayList<User> OListuser;
    LayoutInflater OLayoutInflater;

    public UserAdapter(@NonNull Context context,ArrayList<User> OuserList) {
        super(context,0, OuserList);
        OListuser=OuserList;
        OLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return OListuser.size();
    }

    @Override
    public User getItem(int position) {

        return OListuser.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=OLayoutInflater.inflate(R.layout.list_items,null,true);


        TextView fname=(TextView)view.findViewById(R.id.tvName);
//        ImageView UserImgView=(ImageView)view.findViewById(R.id.imageView);
        User ouser=  getItem(position);
        fname.setText(ouser.getFirstName());
//        UserImgView.setImageDrawable(ouser.getDrawableImage());
        return  view;

    }
}
