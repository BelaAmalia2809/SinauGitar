package id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl205142332.sinaugitar.R;

/**
 * Created by user on 17/11/2016.
 */

public class ChordAdapter extends RecyclerView.Adapter<ChordAdapter.MyViewHolder> {

    ArrayList<Data> datas;
    IDataAdapter mIDataAdapter;

    public ChordAdapter(Context context, ArrayList<Data> datas) {
        this.datas = datas;
        mIDataAdapter = (IDataAdapter) context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.tvText1.setText(data.text1);
        holder.tvText2.setText(data.text2);
        holder.ivChord.setImageResource(data.img1);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public interface IDataAdapter {
        void doClick(int pos);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivChord;
        TextView tvText2;
        TextView tvText1;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvText2 = (TextView) itemView.findViewById(R.id.textViewText2);
            ivChord = (ImageView) itemView.findViewById(R.id.imageview);
            tvText1 = (TextView) itemView.findViewById(R.id.textViewText1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDataAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}
