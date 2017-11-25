package com.example.ivor_hu.meizhi.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;

import com.example.ivor_hu.meizhi.R;

/**
 * Created by ivor on 16-6-21.
 */
public class CollectionAdapter extends BaseStuffAdapter {
    private static final String TAG = "CollectionAdapter";

    public CollectionAdapter(Context context, String type) {
        super(context, type);
//        mStuffs.addChangeListener(new RealmChangeListener<RealmResults<Stuff>>() {
//            @Override
//            public void onChange(RealmResults<Stuff> element) {
//                notifyDataSetChanged();
//            }
//        });
    }

    @Override
    protected void bindColBtn(ImageButton likeBtn, final int position) {
        likeBtn.setImageResource(R.drawable.like);
        likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteItem(position);
            }
        });
    }

    private void deleteItem(final int position) {
//        mRealm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm realm) {
//                Stuff stuff = mStuffs.get(position);
//                if (stuff.isDeleted()) {
//                    stuff.deleteFromRealm();
//                } else {
//                    stuff.setLiked(false);
//                }
//            }
//        });
    }
}
