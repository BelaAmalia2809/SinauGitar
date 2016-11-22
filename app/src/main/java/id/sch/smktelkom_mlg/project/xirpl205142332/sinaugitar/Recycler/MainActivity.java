package id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Fragment.ChordFragment;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Fragment.LaguFragment;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.R;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler.ChordAdapter;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler.LaguAdapter;

public class MainActivity extends AppCompatActivity implements ChordAdapter.IDataAdapter, LaguAdapter.IDataAdapter {

    public static final String LINK_1 = "link1";
    public static final String LINK_2 = "link2";
    public static final String ID = "id";

    ChordFragment cfal = new ChordFragment();
    ArrayList<Data> datas1 = cfal.getChordList();
    LaguFragment lfal = new LaguFragment();
    ArrayList<Data> datas2 = lfal.getLaguList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager vp = (ViewPager) findViewById(R.id.mViewPager);
        this.addPages(vp);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp));

        ChordFragment cfal = (ChordFragment) getIntent().getSerializableExtra(LINK_1);

    }

    private void addPages(ViewPager pager) {
        MyFragPagerAdapter adapter = new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new ChordFragment());
        adapter.addPage(new LaguFragment());

        pager.setAdapter(adapter);
    }

    private TabLayout.OnTabSelectedListener listener(final ViewPager pager) {
        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(LINK_1, datas1.get(pos));
        intent.putExtra(ID, 1);
        startActivity(intent);
    }

    @Override
    public void doClick2(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(LINK_2, datas2.get(pos));
        intent.putExtra(ID, 2);
        startActivity(intent);
    }
}
