package sidikmilati1998gmail.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
    private final String[] subtitle1;
//perintah diats digunakan sebagain class ang nantinya digunkan untuk menmpilkan hasil dari setip kluran yang mana pada clas tersebut nantiny
    //akan digunakan untuk menmpilkan data pada sebuah list pada kelas list
    public MyAdapter(Activity context, String[] maintitle, String[] subtitle, String[] subtitle1,Integer[] imgid) {
        //mendeskripsikan nama setiap kelas dan beserta tipe data
        super(context, R.layout.activity_my_adapter, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.subtitle1 = subtitle1;
        this.imgid = imgid;
    }
    //mendeksripsikan nama dan title sub dan img id

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        //digunakan untuk menmpilkan hasil dari sebuah classadpater yang akna diurutkan berdarkan tampilan
        View rowView = inflater.inflate(R.layout.activity_my_adapter, null, true);
        //menampilkan hasil dari sebuah class xml my adapter
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        //nama dari titele yang berada diatas pada setiap list
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        //menmpilkn gambar yang akan ditampilkan pada list
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        //berisi ketrangan pada gambra setiap daftar list
        TextView subtitle1Text = (TextView) rowView.findViewById(R.id.subtitle1);
        titleText.setText(maintitle[position]);
        //berfungsi sebgai urutan dari setiap class main title diman apda maintitle urutan ke 1
        imageView.setImageResource(imgid[position]);
        //kemudian pada img urutan ke 2 pada list nantinya
        subtitleText.setText(subtitle[position]);
        subtitle1Text.setText(subtitle1[position]);
        return rowView;


    }

    ;
}