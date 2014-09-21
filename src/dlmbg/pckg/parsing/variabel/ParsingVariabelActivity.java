package dlmbg.pckg.parsing.variabel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ParsingVariabelActivity extends Activity {

	String var_nama,var_alamat,var_tgllahir;
	EditText nama, alamat, tgllahir;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        nama = (EditText) findViewById(R.id.nama_editText);
        alamat = (EditText) findViewById(R.id.alamat_editText);
        tgllahir = (EditText) findViewById(R.id.tgllahir_editText);
        
        
        Button reset = (Button) findViewById(R.id.hapus_btn);
        reset.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		nama.setText("");
        		alamat.setText("");
        		tgllahir.setText("");
        	}
        });
        
        Button submit = (Button) findViewById(R.id.kirim_btn);
        submit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				var_nama = nama.getText().toString();
				var_alamat = alamat.getText().toString();
				var_tgllahir = tgllahir.getText().toString();
				Intent i = null;							
				i = new Intent(ParsingVariabelActivity.this, TampilVariabel.class);
				Bundle b = new Bundle();
				b.putString("parse_nama", var_nama);
				b.putString("parse_alamat", var_alamat);
				b.putString("parse_tgllahir", var_tgllahir);
				i.putExtras(b);
				startActivity(i);
        	}
        });
	}
}