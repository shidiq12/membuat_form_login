package sidikmilati1998gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class list extends AppCompatActivity {
    ListView list;
    String[] maintitle = {"Bilal ", "Danang", "Dion ", "Anton ", "sidik ","Man ", "Mikael", "Zakie "};
    //memberikan title dari sebuah daftar pada sebuah list view
    String[] subtitle = {"165410097", "165410049", "165410062", "165410093", "165410067","165410095", "1654100102", "165410102"};
    //membrikan nama sub yang nantinya berada dibwah main title
    String[] subtitle1 = {"bilalridwan@gmail.com", "danangsgj@gmail.com", "dionfeb12@gmail.com", "antoniusjonatan@gmail.com", "sidikmilati1998@gmail.com","emanuelkroe1@gmail.com", "mikaeldinito@gmail.com", "zakieal@gmail.com"};
    //membrikan nama yang berda dibawah subtitle
    Integer[] imgid = {R.drawable.tm1, R.drawable.tm2, R.drawable.tm3, R.drawable.tm4, R.drawable.tm5, R.drawable.tm6, R.drawable.tm7, R.drawable.tm9,};
//menmbil nama gambar yang sudah dimasukan yang berdapa pada menu drwable dimana nama yang diambil sesuai nama ypada drawable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        MyAdapter adapter = new MyAdapter(this, maintitle, subtitle,subtitle1, imgid);
//perintah diatas dimana berdungsi untuk menmpilkan nantinya apa saja yang akan dimasukan pada halaman list dseperti maintitle subtitltle dan img ig yang berfungsi sebagain gambar
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           //menmpilkan list dengan cara melkukan pemggilan pada sebua id list
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(getApplicationContext(),"nama saya bilal",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya bilal sesui urutan list view
                else if(position == 1) {
                    Toast.makeText(getApplicationContext(),"nama saya danang",Toast. LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya danang sesui urutan list view
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"nama saya dion",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya dion sesui urutan list view
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"nama saya anton",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya anton sesui urutan list view
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"nama saya sidik",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya sidik sesui urutan list view
                else if(position == 5) {
                    Toast.makeText(getApplicationContext(),"nama saya emanuel",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya emanuel sesui urutan list view
                else if(position == 6) {
                    Toast.makeText(getApplicationContext(),"nama saya mikael",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya mikael sesui urutan list view
                else if(position == 7) {
                    Toast.makeText(getApplicationContext(),"nama saya zakie",Toast.LENGTH_SHORT).show();
                }
                //berfungsi apabila kita menkan pada daftar list view sesui urutan maka akan menmpilkan notive dibwah yang berisi nama saya zakie sesui urutan list view
            }
        });
    }

    public void btn1(View view) {
        Intent intent = new Intent(list.this, MainActivity.class);
        startActivity(intent);
    }
}