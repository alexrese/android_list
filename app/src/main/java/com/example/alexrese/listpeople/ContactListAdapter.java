package com.example.alexrese.listpeople;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Contact> mContactList;

    public ContactListAdapter(Context mContext, List<Contact> mContactList) {
        this.mContext = mContext;
        this.mContactList = mContactList;
    }

    @Override

    public int getCount() {
        return mContactList.size();
    }

    @Override
    public Object getItem(int position) {
        return mContactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_contact_list, null);
        TextView tvName = (TextView)v.findViewById(R.id.tv_name);
        TextView tvNumber = (TextView)v.findViewById(R.id.tv_number);
        TextView tvEmail = (TextView)v.findViewById(R.id.tv_email);

        tvName.setText(mContactList.get(position).getName());
        tvNumber.setText(String.valueOf("(47)" + mContactList.get(position).getNumber()));
        tvEmail.setText(mContactList.get(position).getEmail());

        v.setTag(mContactList.get(position).getId());

        return v;
    }
}
