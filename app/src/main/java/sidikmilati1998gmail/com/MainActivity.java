package sidikmilati1998gmail.com;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    //berfungsi memberikan nama id dari edit text dan button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//befungsi nantinya untuk menmpilkan hasil keluran pada sebuah class xml pada xlass activity_main
        username = (EditText) findViewById(R.id.Name);
        password = (EditText) findViewById(R.id.sandi);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        //perintah diats berfungsi untuk memnggil nama dari id pada sebuah edit text dan button yang sudah dibuat diatas
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
            //memberikan tipe data string yang nantinya dapat diinputkan pada kolom username dan password
                if (usernameKey.equals("sidik") && passwordKey.equals("165410067")){
                    //digunakan untuk memberikan username dan password sehingga pada saat user memasukan seperti yang sudah dibuat akan masuk ke tampilan list dan apabila user slah akan mucul pesat eror
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            //apabila pada kolom username dan password benar masa akan muncull notive login sukses
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, list.class);
                    MainActivity.this.startActivity(intent);
                    //perintah ditas berfungsi sebgaian nantinya pada sebuah class mainactivity nantiny akan dilakuakn sebuah perpindahan antar layout atau dnegan kata lain intet antar activity

                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                    //perintah diats berfungsi menmpilkan sebuah notive yaitu username atau password slaah dikarenakan
                    //pada kolom username dan password kita slah memsukan sesuai yang sudah dibuat di dalam program
                }
            }

        });

    }

    public void ButtonOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
        //digunakan untuk menmbahkan sebuah action pada sebuah button nantinya botton tersebut mendpatkan fungsi untuk melkukan perpindahan antar halaman activity
        //dengan menmbhakan buttononclik pada program xml dan kemudian dibuat nantinya akan pindah ke activit register
    }

}