<p align="center"><img src="logo.png" width="250" height="250" align="center"></p>


# Plant-disease
<p align="justify"> Dibuat untuk mengidentifikasi penyakit tanaman pada daun tomat dan daun singkong. Identifikasi dilakukan melalui pengambilan citra daun menggunakan metode <i>Convolutional Neural Network</i> (CNN). Program di buat dengan mmenggunakan bahasa <i>phyton</i> dan <b>Google <i>Colaboratory</i></b> sebagai infrastruktur yang digunakan.</p> 
<p align="justify">Proses pelatihan, validasi, dan pengujian dapat dilakukan pada Google <i>Colaboratory</i> dengan cara memasukkan <i>Dataset</i> berupa gambar yang akan diproses pada pemodelan CNN. Pemodelan CNN pada saat ini hanya menggunakan 3 arsitektur yaitu <b>VGG16</b>, <b>Inception-V3</b>, dan <b><i>MobileNet</i></b>. Setelah dilakukan proses pemodelan akan menghasilkan data latih berupa file <i><b>Tensorflow Lite</b></i> (*.tftlite). Selanjutnya file data latih dimasukan kedalam <b>Android Studio</b> untuk pembuatan aplikasi android. Pembuatan Aplikasi android bertujuan agar memudahkan kepada petani, peneliti dan lainnya dalam melakukan identifikasi awal penyakit yang terdapat pada tanaman. </p>

## Penggunaan Aplikasi
1. Buka Aplikasi <b>Plant Diseases</b>
2. pilih menu yang digunakan, "<b>IDENTIFIKASI DENGAN KAMERA</b> atau <b>IDENTIFIKASI DARI GALERI</b>
3. <b>IDENTIFIKASI DENGAN KAMERA</b> penggunaannya dengan cara mengambil gambar secara langsung pada obyek yang akan diidentifikasi, lalu tekan tombol <b>DETEKSI</b> untuk mengidentifikasi
4. <b>IDENTIFIKASI DARI GALERI</b> pengggunaanya dengan cara menekan tombol <b>PILIH  GAMBAR</b> lalu memilih foto yang terdapat pada galeri untuk identifikasi
5. Hasil dari kedua Identifikasi akan muncul dengan nilai probabilitas, serta waktu yang dibutuhkan untuk identifikasi ditampilkan dalam satuan ms

Berikut contoh penggunaannya:

<img src="Data Hasil Uji/Tutarial-1.gif" width="240" height="427"> <img src="Data Hasil Uji/Tutorial-2.gif" width="240" height="427">


## Penyakit Yang Dapat Di Identifikasi

1. Tomat Bacterial spot 
2. Tomat Early blight 
3. Tomat healthy 
4. Tomat Late blight 
5. Tomat Leaf Mold 
6. Tomat Septoria leaf spot 
7. Tomat Spider mites Two spotted spider mite 
8. Tomat Target_Spot 
9. Tomat Mosaic virus 
10. Tomat Yellow Leaf Curl Virus
11. Cassava Bacteial Blight 
12. Cassava Brown Streak Disease 
13. Cassava Green Mottle 
14. Cassava Mosaic Disease 
15. Cassava Healty 

