Post Processors adalah bagian dari test plan yang merupakan sebuah aksi yang berjalan pada saat proses dilakukan. Proses ini sendiri adalah proses request ke sebuah alamat web. Proses yang dilakukan oleh post processors ini pada umumnya adalah untuk mengekstrak value yang didapatkan dari hasil mengakses sebuah alamat web seperti data data pada JSON, pada season atau juga pada bagian respon yang lainnya. 

Daftar elemen termasuk:
1. Regular Expression Extractor
2. CSS/JQuery Extractor
3. XPath Extractor
4. BeanShell Post Processor
5. Result Status Action Handler
6. JSR223 Post Processor
7. JDBC Post Processor
8. JSON Path Post Processor
9. Boundary Extractor
10. BSF Post Processor
11. Debug Post Processor

Terapkan Ke: Terapkan ke memiliki 4 opsi.
1. Sampel Utama dan Sub Sampel: Ini berlaku untuk sampel utama dan Sub Sampel.
2. Hanya Sampel Utama: Ini hanya diterapkan pada sampel utama.
3. Hanya Sub Sampel: Ini diterapkan hanya untuk Sub Sampel.
4. Variabel JMeter: Ekstraksi diterapkan pada variabel bernama saja.

Field To Check: Bidang yang akan diperiksa memiliki sejumlah opsi. Semua nama bidang cukup jelas seperti namanya.
1. Badan mewakili badan tanggapan yaitu konten tidak termasuk header.
2. Body (Unescaped): Isi respons yang mengganti semua kode escape HTML.
3. Body as a Document – ​​Dari jumlah data dokumen yang diekstraksi.

Beberapa ekspresi isi dari json response :
1. $ = root element
2. . = child operator (object)
3. [] = child operator (array)
4. .. = recursive descent (langsung ke objek)
5. * = wildcard (all things)