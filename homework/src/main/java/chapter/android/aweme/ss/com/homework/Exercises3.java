package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends Activity {
    private ListView lv;
    private ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
    private String[] message = new String[] { "姓名", "性别", "民族", "爱好","住址","身高","体重","姓名", "性别", "民族", "爱好","住址","身高","体重","姓名", "性别", "民族", "爱好","住址","身高","体重","姓名", "性别", "民族", "爱好","住址","身高","体重","姓名", "性别", "民族", "爱好","住址","身高","体重","姓名", "性别", "民族", "爱好","住址","身高","体重" };
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e3);
        lv = (ListView) findViewById(R.id.lv);
        Context mContext=getApplicationContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.im_list_item,null);
        int length = message.length;
        for (int i = 0; i < length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("image", R.drawable.icon_micro_game_comment);
            item.put("text", message[i]);
            data.add(item);		}
        SimpleAdapter adapter = new SimpleAdapter(this, data,R.layout.e3, new String[] { "image", "text" }, new int[]{R.id.ig, R.id.tv });
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        { 			// @Override
             public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3)
             {				// 点击后标题显示第几行
                  Toast.makeText(getApplicationContext(),"你点击了第" + arg2 + "行",1).show();
                 Intent intent=new Intent(Exercises3.this, Exercises2.class); startActivity(intent);
             }
        }
        );



    }
}



