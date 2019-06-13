package com.rana_aditya.tic_tac_toe;

import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Chronometer;
import android.widget.GridLayout;
import android.widget.ImageView;

public class gameActivity extends AppCompatActivity implements  View.OnClickListener {
ImageView img[]=new ImageView[9];
GridLayout gridLayout;
Chronometer chronometer;
public functions fun;
public int i=0;
private Vibrator vibrator;
private Board board=new Board();
int check[]=new int[9];

private AiPlayer aiPlayer=new AiPlayer();
public int str[][]=new int[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gridLayout=findViewById(R.id.gridlayout);
        chronometer=findViewById(R.id.chrono);
        chronometer.setBase(SystemClock.elapsedRealtime());
        fun=new functions();
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        str=board.array;
for (int i=0;i<9;i++){
    check[i]=0;
}


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(){
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                int ui=View.SYSTEM_UI_FLAG_FULLSCREEN |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY ;

            }
        });
        int ui=View.SYSTEM_UI_FLAG_FULLSCREEN |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_IMMERSIVE;
        decorView.setSystemUiVisibility(ui);
        img[0]=findViewById(R.id.block_1);
        img[1]=findViewById(R.id.block_2);
        img[2]=findViewById(R.id.block_3);
        img[3]=findViewById(R.id.block_4);
        img[4]=findViewById(R.id.block_5);
        img[5]=findViewById(R.id.block_6);
        img[6]=findViewById(R.id.block_7);
        img[7]=findViewById(R.id.block_8);
        img[8]=findViewById(R.id.block_9);
        for (int i=0;i<9;i++){
            img[i].setOnClickListener(gameActivity.this);
        }





    }
    public void onClick(View view) {

            switch (view.getId()) {
                case R.id.block_1:
                    if (i % 2 == 0&&check[0]==0) {
                        check[0]++;
                        fun.vib(vibrator);

                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[0].setImageResource(R.drawable.cross);
                        board.update_user(0, 0);
                        if (board.check_game()) {
                            goto_result();
                        } else {
                            if (i < 9) {

                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                int pos = fun.get_position(move.row, move.col);

                                board.update_ai(move.row, move.col);
                                i++;
                                if (pos > 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }

                    }
                    break;
                case R.id.block_2:
                    if (i % 2 == 0&&check[1]==0) {
                        check[1]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[1].setImageResource(R.drawable.cross);
                        board.update_user(0, 1);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }

                        }
                    }
                    break;
                case R.id.block_3:
                    if (i % 2 == 0&&check[2]==0) {
                        check[2]++;
                        i++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        img[2].setImageResource(R.drawable.cross);
                        board.update_user(0, 2);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }

                    }
                    break;
                case R.id.block_4:
                    if (i % 2 == 0&&check[3]==0) {
                        check[3]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[3].setImageResource(R.drawable.cross);
                        board.update_user(1, 0);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.block_5:
                    if (i % 2 == 0&&check[4]==0) {
                        check[4]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[4].setImageResource(R.drawable.cross);
                        board.update_user(1, 1);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);

                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.block_6:
                    if (i % 2 == 0&&check[5]==0) {
                        check[5]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[5].setImageResource(R.drawable.cross);
                        board.update_user(1, 2);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.block_7:
                    if (i % 2 == 0&&check[6]==0) {
                        check[6]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[6].setImageResource(R.drawable.cross);
                        board.update_user(2, 0);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.block_8:
                    if (i % 2 == 0&&check[7]==0) {
                        check[7]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[7].setImageResource(R.drawable.cross);
                        board.update_user(2, 1);
                        if(board.check_game()){
                            goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.block_9:
                    if (i % 2 == 0&&check[8]==0) {
                        check[8]++;
                        fun.vib(vibrator);
                        if (i == 0) {
                            fun.start_timer(chronometer);
                        }
                        i++;
                        img[8].setImageResource(R.drawable.cross);
                        board.update_user(2, 2);
                        if(board.check_game()){
                              goto_result();
                        }else {
                            if (i < 9) {
                                Move move = new Move();
                                move = aiPlayer.findBestMove(board.array, move);
                                board.update_ai(move.row, move.col);
                                i++;

                                int pos = fun.get_position(move.row, move.col);
                                if (pos >= 0 && check[pos] == 0){
                                    check[pos]++;
                                    img[pos].setImageResource(R.drawable.circle);}
                                if (board.check_game()) {
                                    goto_result();
                                }
                            }
                        }
                    }
                    break;
                case R.id.exit:
                    fun.stop_timer(chronometer);
                    finish();
                    break;
                case R.id.reload:
                    fun.vib(vibrator);
                    reload();
                    break;
                    default:break;
            }
        }


    public void reload(){
        i=0;

        board.reset();
        for (int i=0;i<9;i++) {
            img[i].setImageResource(0);
        }

        fun.stop_timer(chronometer);
        for (int i=0;i<9;i++){
            check[i]=0;
        }

    }
    public void goto_result(){
        reload();

        Intent intent=new Intent(gameActivity.this,result.class);

        startActivity(intent);
        gameActivity.this.finish();
    }

}
