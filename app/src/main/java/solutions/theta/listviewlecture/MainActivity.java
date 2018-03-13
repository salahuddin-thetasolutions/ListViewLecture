package solutions.theta.listviewlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import solutions.theta.listviewlecture.Adapter.UserAdapter;
import solutions.theta.listviewlecture.Model.User;

public class MainActivity extends AppCompatActivity {
ListView mLv;
    UserAdapter oUserAapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {
        mLv=(ListView)findViewById(R.id.lv);
        User ouser1=new User();
        ouser1.setFirstName("Ali");
        ouser1.setDrawableImage(R.drawable.user);
        User ouser2=new User();
        ouser2.setFirstName("Ahmed");
        ouser2.setDrawableImage(R.drawable.user);
        User ouser3=new User();
        ouser3.setFirstName("Tahir");
        ouser3.setDrawableImage(R.drawable.user);
        User ouser4=new User();
        ouser4.setFirstName("Farooq");
        ouser4.setDrawableImage(R.drawable.user);
        ArrayList<User> oListUsers=new ArrayList<User>();
        oListUsers.add(ouser1);
        oListUsers.add(ouser2);
        oListUsers.add(ouser3);
        oListUsers.add(ouser4);

        oUserAapter=new UserAdapter(getApplicationContext(),oListUsers);
        mLv.setAdapter(oUserAapter);
    }
}
