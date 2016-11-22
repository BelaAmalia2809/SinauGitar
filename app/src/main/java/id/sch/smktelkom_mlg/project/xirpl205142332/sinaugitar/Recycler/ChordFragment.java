package id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.R;

/**
 * Created by user on 17/11/2016.
 */

public class ChordFragment extends Fragment {

    public static final String LINKARRAYLIST_1 = "linkarraylist1";
    ChordAdapter mIDataAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.chord_fragment, null);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerChord);
        rvChord.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mIDataAdapter = new ChordAdapter(this.getActivity(), getChordList());
        rvChord.setAdapter(mIDataAdapter);

    }


    public ArrayList<Data> getChordList() {
        ArrayList<Data> datas1 = new ArrayList<>();
        Data data = new Data("Chord A", R.drawable.a, R.drawable.chorda, "", "untuk memainkan chord inidf dfsdf fdgokjmd kowe jmwkrew kmkc klncsd konefb kmldc kwdcw kocwd oknwdcow untuk memainkan chord inidf dfsdf fdgokjmd kowe jmwkrew kmkc klncsd konefb kmldc kwdcw kocwd oknwdcow");
        datas1.add(data);

        data = new Data("Chord A7", R.drawable.chorda7, R.drawable.chorda7, "", "long text here");
        datas1.add(data);

        data = new Data("Chord Am", R.drawable.chordam, R.drawable.chordam, "", "long text here");
        datas1.add(data);

        data = new Data("Chord C", R.drawable.chordc, R.drawable.chordc, "", "long text here");
        datas1.add(data);

        return datas1;
    }

    public String toString() {
        return "Chord";
    }
}
