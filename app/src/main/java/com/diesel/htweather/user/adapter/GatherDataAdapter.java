package com.diesel.htweather.user.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.diesel.htweather.R;
import com.diesel.htweather.user.holder.GatherDataHolder;
import com.diesel.htweather.user.model.GatherDataBean;

import java.util.List;

/**
 * Comments：
 *
 * @author Diesel
 *         Time: 2016/9/4
 *         Modified By:
 *         Modified Date:
 *         Why & What is modified:
 * @version 1.0.0
 */
public class GatherDataAdapter extends RecyclerView.Adapter<GatherDataHolder> {

    private List<GatherDataBean> mList;

    public GatherDataAdapter(List<GatherDataBean> list) {
        mList = list;
    }

    @Override
    public GatherDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        GatherDataHolder holder = new GatherDataHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_gather_data, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(GatherDataHolder holder, int position) {
        holder.bindData(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return null == mList ? 0 : mList.size();
    }

}
