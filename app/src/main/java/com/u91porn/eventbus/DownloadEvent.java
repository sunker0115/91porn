package com.u91porn.eventbus;

import com.u91porn.data.model.UnLimit91PornItem;

/**
 * Created by zhuyichuan on 2018/2/9.
 */

public class DownloadEvent {
    private UnLimit91PornItem item;
    private Integer tag = 0;

    public DownloadEvent(UnLimit91PornItem item, Integer tag) {
        this.item = item;
        this.tag = tag;
    }


    public UnLimit91PornItem getItem() {
        return item;
    }

    public Integer getTag() {
        return tag;
    }
}
