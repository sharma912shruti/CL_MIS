package mis.cl.com.cl_mis.activity;

import android.os.Bundle;

import butterknife.ButterKnife;
import mis.cl.com.cl_mis.R;

/**
 * Created by navlakha on 26/11/18.
 */

public class ValidationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        ButterKnife.bind(this);
    }
}
