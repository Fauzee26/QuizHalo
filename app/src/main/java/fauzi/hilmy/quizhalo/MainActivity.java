package fauzi.hilmy.quizhalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView lblNis, lblNama, lblAlamat, lblKota, lblTelepon, lblHandphone, lblEmail, lblKode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblNis = (TextView) findViewById(R.id.lblNis);
        lblNama = (TextView) findViewById(R.id.lblNama);
        lblAlamat = (TextView) findViewById(R.id.lblAlamat);
        lblKota = (TextView) findViewById(R.id.lblKota);
        lblTelepon = (TextView) findViewById(R.id.lblTelepon);
        lblHandphone = (TextView) findViewById(R.id.lblHandphone);
        lblEmail = (TextView) findViewById(R.id.lblEmail);
        lblKode = (TextView) findViewById(R.id.lblKode);

        lblNis.setText("NIS : 200101010");
        lblNama.setText("Nama : Roy Simbiring");
        lblAlamat.setText("Alamat : Jl Kijang No 2 , Pesanggarahan, Jawa Barat");
        lblKota.setText("Kota : Bogor");
        lblTelepon.setText("Telepon : 29990010101");
        lblHandphone.setText("Handphone : 0812811111");
        lblEmail.setText("Email : roy@sembiring.com\n");
        lblKode.setText("Kode Pos : 16830");
    }
}
