public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 해당 주석 영역 안에 여러분이 기억나는 Android Code를 아무거나 작성해주세요
        // ↓ into Here

        Toast.makeText(getApplicationContext(), "토스트메시지가 시험문제에 나왔었죠?", Toast.LENGTH_LONG).show();

        // ↑ into Here
        // 해당 주석 영역 안에 여러분이 기억나는 Android Code를 아무거나 작성해주세요
    }
}