package mis.cl.com.cl_mis.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import mis.cl.com.cl_mis.R;


/**
 * Created by navlakha on 20/11/18.
 */

public class BaseActivity extends AppCompatActivity {

    public void setHeader(String title, Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("");
        TextView titleView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        titleView.setText(title);
    }
}
