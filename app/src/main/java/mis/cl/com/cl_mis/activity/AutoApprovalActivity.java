package mis.cl.com.cl_mis.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import mis.cl.com.cl_mis.R;
import mis.cl.com.cl_mis.adapter.ItemAdapter;

/**
 * Created by navlakha on 26/11/18.
 */

public class AutoApprovalActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.autoApproval_recyclerView)
    RecyclerView mAutoApprovalRecyclerView;

    private ArrayList<String> mList;
    private ItemAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_approval);
        ButterKnife.bind(this);
        initialiseValue();
        setAdapter();
    }

    private void initialiseValue() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mToolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        setHeader("Auto Approval", mToolbar);
    }

    private void setAdapter(){
        mList = new ArrayList<>();
        mAdapter = new ItemAdapter(this, mList);
        mAutoApprovalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAutoApprovalRecyclerView.setAdapter(mAdapter);
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
