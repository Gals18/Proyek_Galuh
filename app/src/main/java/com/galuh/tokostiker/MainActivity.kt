// Sebagai nama paket
package com.galuh.tokostiker


//digunakan untuk membuat content intent.
// Intent adalah sebuah jembatan yang menghubungkan interaksi  antar Activity di aplikasi Android.
import android.content.Intent

//mengimplementasikan ActionBar/Toolbar dan Material Design pada aplikasi yang kita buat di Android Studio.
//Tapi saat ini penggunaan AppCompat Library sudah menjadi default (bawaan), saat kita membuat project pada Android Studio.
import androidx.appcompat.app.AppCompatActivity

//untuk mengatur kegiatan activity dari os
import android.os.Bundle

//Toast adalah salah sau Widget yang digunakan untuk menmpilkan pesan berupa Text,
// yang terlintas setelah pengguna melakukan aksi tertentu. Toast memiliki fungsi untuk memberitahukan Informasi pada user,
// mengenai konten atau aksi yang di eksekusinya, bisa berupa konfirmasi, pesan error atau pemberitahuan lainnya.
import android.widget.Toast

//Data Binding merupakan salah satu bagian dari support library yang fungsinya
// untuk memudahkan kita dalam menyambungkan/mengikat sebuah data ke bagian UInya,
// sehingga kita tidak perlu melakukan set data secara manual melalui bagian kode programnya
import com.galuh.tokostiker.databinding.ActivityMainBinding

// sebagai class utama untuk dipanggil kemudian dalam kelas ini akan dirangkum beberapa fungsi
//dan juga pendeklarasian variable
class MainActivity : AppCompatActivity() {
    //Lateinit digunakan ketika kita ingin membuat non-null type
    // tapi kita menginisiasikannya melalui dependency injection atau disebuah method setup dalam unit test
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // sebagai deklarasi binding untuk melakukan routing
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // pendeklarasian suatu fungsi pada tombol btnLogin, sehingga nantinya ketika
        //tombol login diklik akan menuju ke fungsi cekMasuk untuk
        //menjalankan fungsi didalamnya.
        binding.btnLogin.setOnClickListener { cekMasuk() }

    }

    private fun cekMasuk() {// fungsi cekMasuk

        //pendeklarasian variable pengguna dan password dan keduanya merupakan tpe data yang nantinya diubha ke string
        val pengguna = binding.teksPengguna.text.toString()
        val password = binding.teksPassword.text.toString()

        //jika pada kolom textPengguna dan textpassword kosong maka akan menjalankan fungsi toast
        // karena fungsi toast digunakan untuk memberitahukan kesalahan, sehingga nantinya akan menampilkan
        //pesan "Masukan nama Dan Password bestiehh
        if (pengguna.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Masukkan nama dan password bestiehh", Toast.LENGTH_SHORT).show()
            return
        }
        //jika pada kolom textPengguna dan textpassword disi dengan suatu data yang sesuai
        //seperti printah dibawah yaitu Galuh dan 180602,
        // maka akan menjalankan fungsi intent dan menuju kelaman UtamaActivity
        if(pengguna == "Galuh" && password == "180602"){
            val intent = Intent(this, UtamaActivity::class.java)

            intent.putExtra("pengguna", binding.teksPengguna.text.toString())
            startActivity(intent)
        //Namun jika sudah memasukan name dan password tetapi tidak berjalan maka akan menampilkan
        // pesan "Salah masukan Nama atau Pasword "
        }else{
            Toast.makeText(this, "Salah masukkan Nama atau password.", Toast.LENGTH_SHORT).show()
            return

        }

        }
    }
