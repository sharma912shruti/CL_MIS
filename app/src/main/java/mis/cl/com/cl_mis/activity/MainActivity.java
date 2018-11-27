package mis.cl.com.cl_mis.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mis.cl.com.cl_mis.R;

/**
 * Created by navlakha on 27/11/18.
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialiseValue();
    }

    private void initialiseValue() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mToolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        setHeader("Activities", mToolbar);
    }

    @OnClick(R.id.auto_approval)
    void onAutoApprovalClick(){
        startActivity(new Intent(MainActivity.this, AutoApprovalActivity.class));
    }
    
    @OnClick(R.id.pending_approval)
    void onPendingApprovalClick(){
        startActivity(new Intent(MainActivity.this, PendingApprovalActivity.class));
    }
    
    @OnClick(R.id.approval_pending_to_machine)
    void onMachinePendingApprovalClick(){
        startActivity(new Intent(MainActivity.this, MachinePendingApprovalActivity.class));
    }
    
    @OnClick(R.id.validation)
    void onValidationClick(){
        startActivity(new Intent(MainActivity.this, ValidationActivity.class));
    }
    
    @OnClick(R.id.new_center)
    void onNewCenterClick(){
        startActivity(new Intent(MainActivity.this, NewCenterActivity.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
