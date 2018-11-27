package mis.cl.com.cl_mis.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mis.cl.com.cl_mis.R;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.mobile)
    EditText mMobile;

    @BindView(R.id.password)
    EditText mPassword;

    @BindView(R.id.sign_in_button)
    Button mSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sign_in_button)
    void onSignInButton(){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
}
