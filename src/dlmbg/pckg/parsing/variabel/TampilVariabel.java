package dlmbg.pckg.parsing.variabel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TampilVariabel extends Activity {

	TextView nama,alamat,tgllahir;
	String get_nama,get_alamat,get_tgllahir;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil);

		nama = (TextView) findViewById(R.id.nama_textView);
		alamat = (TextView) findViewById(R.id.alamat_textView);
		tgllahir = (TextView) findViewById(R.id.tgllahir_textView);
		
		Bundle b = getIntent().getExtras();
		
		get_nama = b.getString("parse_nama");
		get_alamat = b.getString("parse_alamat");
		get_tgllahir = b.getString("parse_tgllahir");

		nama.setText("Nama : "+get_nama);
		alamat.setText("Alamat : "+get_alamat);
		tgllahir.setText("Tempat/Tanggal Lahir : "+get_tgllahir);
        
        
	}
}