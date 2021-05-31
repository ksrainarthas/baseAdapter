package com.syusuke.commonadapter.abslistview.base;


import com.syusuke.commonadapter.abslistview.ViewHolder;

public interface ItemViewDelegate<T> {
    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);
}
