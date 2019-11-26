package com.yangbin.mybase.binding.viewadapter.checkbox;

import android.databinding.BindingAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.yangbin.mybase.binding.command.BindingCommand;


/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */

public class ViewAdapter {
    /**
     * @param bindingCommand //绑定监听
     */
    @SuppressWarnings("unchecked")
    @BindingAdapter(value = {"onCheckedChangedCommand"}, requireAll = false)
    public static void setCheckedChanged(final CheckBox checkBox, final BindingCommand<Boolean> bindingCommand) {
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                bindingCommand.execute(b);
            }
        });
    }
}
