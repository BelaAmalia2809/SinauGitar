package id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.MainActivity;
import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int id = getIntent().getIntExtra(MainActivity.ID, 0);
        //int id2 = getIntent().getIntExtra(MainActivity.ID, 0);

        if (id == 1) {
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_1);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        } else if (id == 2) {
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_2);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        }
    }
}
