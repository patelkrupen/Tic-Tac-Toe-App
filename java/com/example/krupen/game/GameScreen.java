package com.example.krupen.game;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.BoolRes;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.KeyStore;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    private EditText Scr;
    private String s;
    int turn = 0;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bE, bN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Scr = (EditText) findViewById(R.id.editText);

        b1 = (Button) findViewById(R.id.button1);
        assert b1 != null;
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button2);
        assert b2 != null;
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.button3);
        assert b3 != null;
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.button4);
        assert b4 != null;
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.button5);
        assert b5 != null;
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.button6);
        assert b6 != null;
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.button7);
        assert b7 != null;
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.button8);
        assert b8 != null;
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.button9);
        assert b9 != null;
        b9.setOnClickListener(this);

        bN = (Button) findViewById(R.id.buttonNew);
        bN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restart();
            }
        });

        bE = (Button) findViewById(R.id.buttonExit);
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exit();
            }
        });

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button2:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button3:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                }
                break;
            case R.id.button4:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button5:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button6:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button7:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button8:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
            case R.id.button9:
                setMark(v);
                if (CheckRow() == Boolean.TRUE || CheckCol() == Boolean.TRUE || CheckDiagonal() == Boolean.TRUE) {
                    Scr.setText("Game Over");
                    showButton();
                }
                break;
        }

    }

    public void setMark(View v) {
        Button b = (Button) v;
        if (turn % 2 == 0) {
            b.setText("X");
            b.setTextColor(Color.BLACK);
            b.setBackgroundColor(Color.parseColor("#EF9F07"));
        } else {
            b.setText("O");
            b.setTextColor(Color.BLACK);
            b.setBackgroundColor(Color.parseColor("#6699CC"));
        }
        turn++;
    }


    public Boolean CheckRow() {

        if (b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText()) &&
                !b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("")) {
            return Boolean.TRUE;
        }
        if (b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText()) &&
                !b4.getText().equals("") && !b5.getText().equals("") && !b6.getText().equals("")) {
            return Boolean.TRUE;
        }
        if (b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText()) &&
                !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean CheckCol() {

        if (b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()) &&
                !b1.getText().equals("") && !b4.getText().equals("") && !b7.getText().equals("")) {
            return Boolean.TRUE;
        }
        if (b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()) &&
                !b2.getText().equals("") && !b5.getText().equals("") && !b8.getText().equals("")) {
            return Boolean.TRUE;
        }
        if (b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText()) &&
                !b3.getText().equals("") && !b6.getText().equals("") && !b9.getText().equals("")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;

    }

    public Boolean CheckDiagonal() {

        if (b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()) &&
                !b1.getText().equals("") && !b5.getText().equals("") && !b9.getText().equals("")) {
            return Boolean.TRUE;
        }
        if (b3.getText().equals(b5.getText()) && b5.getText().equals(b7.getText()) &&
                !b3.getText().equals("") && !b5.getText().equals("") && !b7.getText().equals("")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;

    }

    public void showButton() {

        bE.setVisibility(View.VISIBLE);
        bN.setVisibility(View.VISIBLE);

    }

    public void Exit() {
        Intent intent = new Intent(GameScreen.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void Restart() {

        Scr.setText("");
        turn = 0;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setBackgroundColor(Color.WHITE);
        b2.setBackgroundColor(Color.WHITE);
        b3.setBackgroundColor(Color.WHITE);
        b4.setBackgroundColor(Color.WHITE);
        b5.setBackgroundColor(Color.WHITE);
        b6.setBackgroundColor(Color.WHITE);
        b7.setBackgroundColor(Color.WHITE);
        b8.setBackgroundColor(Color.WHITE);
        b9.setBackgroundColor(Color.WHITE);

        bE.setVisibility(View.INVISIBLE);
        bN.setVisibility(View.INVISIBLE);

    }
}