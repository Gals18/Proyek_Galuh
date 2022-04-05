// Sebagai nama paket
package com.galuh.tokostiker

//digunakan untuk membuat content intent.
// Intent adalah sebuah jembatan yang menghubungkan interaksi  antar Activity di aplikasi Android.
import androidx.appcompat.app.AppCompatActivity

//mengimplementasikan ActionBar/Toolbar dan Material Design pada aplikasi yang kita buat di Android Studio.
//Tapi saat ini penggunaan AppCompat Library sudah menjadi default (bawaan), saat kita membuat project pada Android Studio.
import android.os.Bundle

//Data Binding merupakan salah satu bagian dari support library yang fungsinya
//untuk memudahkan kita dalam menyambungkan/mengikat sebuah data ke bagian UInya,
// namun disini import untuk data binding tidak aktif dikarenakan blum adanya binding
import com.galuh.tokostiker.databinding.ActivityProfilBinding
import com.galuh.tokostiker.databinding.ActivityUtamaBinding


// sebagai class utama dengan nama ActivityProfil untuk dipanggil kemudian dalam kelas ini akan dirangkum beberapa fungsi
//dan juga pendeklarasian variable
class ActivityProfil : AppCompatActivity() {

    // sebagai fungsi menyimpan data
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }
}