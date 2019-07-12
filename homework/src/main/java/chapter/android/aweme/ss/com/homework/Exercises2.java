package chapter.android.aweme.ss.com.homework;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends Activity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        int c = getViewCount(findViewById(R.id.wy));
        Log.d("TAG", "view个数： " + c);
    }



    public static int getViewCount(View root) {
        //todo 补全你的代码
        int viewCount = 0;
        if (null == root) {
            return 0;
        }
        if (root instanceof ViewGroup) {
            viewCount++;
            for (int i = 0; i < ((ViewGroup) root).getChildCount(); i++) {
                View view = ((ViewGroup) root).getChildAt(i);
                if (view instanceof ViewGroup) {
                    viewCount += getViewCount(view);
                } else {
                    viewCount++;
                }
            }
        }
        return viewCount;
    }




}
