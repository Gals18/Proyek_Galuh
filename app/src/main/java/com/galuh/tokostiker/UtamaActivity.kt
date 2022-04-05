// Sebagai nama paket
package com.galuh.tokostiker

//digunakan untuk membuat content intent.
// Intent adalah sebuah jembatan yang menghubungkan interaksi  antar Activity di aplikasi Android.
import android.content.Intent

//mengimplementasikan ActionBar/Toolbar dan Material Design pada aplikasi yang kita buat di Android Studio.
//Tapi saat ini penggunaan AppCompat Library sudah menjadi default (bawaan), saat kita membuat project pada Android Studio.
import android.net.Uri

//untuk mengatur kegiatan activity dari os
import androidx.appcompat.app.AppCompatActivity

//Toast adalah salah sau Widget yang digunakan untuk menmpilkan pesan berupa Text,
// yang terlintas setelah pengguna melakukan aksi tertentu. Toast memiliki fungsi untuk memberitahukan Informasi pada user,
// mengenai konten atau aksi yang di eksekusinya, bisa berupa konfirmasi, pesan error atau pemberitahuan lainnya.
import android.os.Bundle

//Data Binding merupakan salah satu bagian dari support library yang fungsinya
// untuk memudahkan kita dalam menyambungkan/mengikat sebuah data ke bagian UInya,
// sehingga kita tidak perlu melakukan set data secara manual melalui bagian kode programnya
import com.galuh.tokostiker.databinding.ActivityUtamaBinding

// sebagai class utama untuk dipanggil kemudian dalam kelas ini akan dirangkum beberapa fungsi
//dan juga pendeklarasian variable
class UtamaActivity : AppCompatActivity() {
    lateinit var binding: ActivityUtamaBinding

    //digunakan untuk membuat suatu objek yang nantinya akan dipanggil
    // dan kemudian pendeklarasian variable web_prefix yang didalamnya terdapat penyimpanan link menuju ke instagram
    companion object {

        const val WEB_PREFIX = "https://www.instagram.com/galuhsap18/"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // sebagai deklarasi binding untuk melakukan routing
       val binding = ActivityUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // pendeklarasian suatu fungsi pada tombol button9 dan button8, sehingga nantinya ketika
        //tombol login diklik akan menuju ke fungsi cekprofil dan cekdeveloper  untuk
        //menjalankan fungsi didalamnya.
        binding.button9.setOnClickListener { cekprofil() }
        binding.button8.setOnClickListener { cekdeveloper() }


    }

    private fun cekprofil(){ //// fungsi cekMasuk

        //pendeklarasian variable pengguna dan password dan keduanya merupakan tpe data yang nantinya diubha ke string
        val queryUrl: Uri = Uri.parse(WEB_PREFIX)
        // digunakan untuk menyiapkan variabel intent dengan menggunakan parameter
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        // startActivity digunakan untuk mengaktifkan intent
        startActivity(intent)
    }

    private fun cekdeveloper(){// fungsi cekdeveloper

        // digunakan untuk menyiapkan variabel intent dengan menggunakan parameter
        val intent = Intent(this, ActivityProfil::class.java)
        // startActivity digunakan untuk mengaktifkan intent
        startActivity(intent)

    }

}