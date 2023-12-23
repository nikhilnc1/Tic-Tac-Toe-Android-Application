package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    int flag = 0;
    int count = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView xScore, oScore, drawScore;
    int xWin = 0,oWin = 0,draw = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }

    private void init()
    {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        xScore = findViewById(R.id.xScore);
        oScore = findViewById(R.id.oScore);
        drawScore = findViewById(R.id.drawScore);
        reset = findViewById(R.id.reset);
    }

    public void check(View view)
    {
        Button btnCurrent = (Button) view;

        if(btnCurrent.getText().equals(""))
        {
            count++;
            if(flag == 0)
            {
                btnCurrent.setText("X");
                flag = 1;
            }
            else
            {
                btnCurrent.setText("O");
                flag = 0;
            }
        }

        if(count > 4)
        {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            //condition
            if(!b1.equals("") && b1.equals(b2) && b1.equals(b3))
            {
                Toast.makeText(this,"Winner is " + b1,Toast.LENGTH_SHORT).show();
                winner(b1);
                newGame();
            }
            else if(!b4.equals("") && b4.equals(b5) && b5.equals(b6))
            {
                Toast.makeText(this,"Winner is " + b4,Toast.LENGTH_SHORT).show();
                winner(b4);
                newGame();
            }
            else if(!b7.equals("") && b7.equals(b8) && b8.equals(b9))
            {
                Toast.makeText(this,"Winner is " + b7,Toast.LENGTH_SHORT).show();
                winner(b7);
                newGame();
            }else if(!b1.equals("") && b1.equals(b4) && b4.equals(b7))
            {
                Toast.makeText(this,"Winner is " + b1,Toast.LENGTH_SHORT).show();
                winner(b1);
                newGame();
            }else if(!b2.equals("") && b2.equals(b5) && b5.equals(b8))
            {
                Toast.makeText(this,"Winner is " + b2,Toast.LENGTH_SHORT).show();
                winner(b2);
                newGame();
            }else if(!b3.equals("") && b3.equals(b6) && b6.equals(b9))
            {
                Toast.makeText(this,"Winner is " + b3,Toast.LENGTH_SHORT).show();
                winner(b3);
                newGame();
            }else if(!b1.equals("") && b1.equals(b5) && b1.equals(b9))
            {
                Toast.makeText(this,"Winner is " + b1,Toast.LENGTH_SHORT).show();
                winner(b1);
                newGame();
            }else if(!b3.equals("") && b3.equals(b5) && b5.equals(b7))
            {
                Toast.makeText(this,"Winner is " + b3,Toast.LENGTH_SHORT).show();
                winner(b3);
                newGame();
            }
            else if (count == 9) {
                Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
                winner("Draw");
                newGame();
            }

        }
    }

    public void winner(String b) {
        if (b.equals("X")) {
            xWin++;
        } else if (b.equals("O")) {
            oWin++;
        } else {
            draw++;
        }

        xScore.setText("X : " + xWin);
        oScore.setText("O : " + oWin);
        drawScore.setText("Draw : " + draw);
    }

    public void newGame()
    {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }

    public void reset()
    {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
        xWin = 0;
        oWin = 0;
        draw = 0;
        xScore.setText("X : " + xWin);
        oScore.setText("O : " + oWin);
        drawScore.setText("Draw : " + draw);

    }

}