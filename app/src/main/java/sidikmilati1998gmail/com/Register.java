package sidikmilati1998gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btn(View view) {
        Intent intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
        //brisi perintah yang digunakan sebgaian perintah pada sebuah button yang mana nantinya digunakan untuk kembali dri halaman regitrasi ke halam utama yaitu ke halaman login
    }
}
