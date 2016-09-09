package android.kr.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.text);

        String s = accumulator(100);
        s += accumulator(1000);
        s += accumulator(10000);
        textView.setText(s);
    }
    private String accumulator(int num){

        int a = 0;
        for (int i = 0; i <= num; i++){
            a += i;
        }
        String s = "1부터 "+num+ "을 더한 값은 " +String.valueOf(a) + "\n";

        String s1 = "test";

        return s;
    }
}
