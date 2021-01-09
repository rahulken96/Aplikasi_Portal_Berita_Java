package com.portal_berita;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private List<ModalData> mDataList;
    private MyAdapterBerita myAdapterBerita;

    public Home() {
    }

    public Home(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.berita_home,container,false);
        recyclerView = view.findViewById(R.id.Recycleview);

        myAdapterBerita = new MyAdapterBerita(mDataList, getContext());
        recyclerView.setAdapter(myAdapterBerita);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDataList = new ArrayList<>();
        mDataList.add(new ModalData(
                R.drawable.bca,
                R.string.judul1,
                "KOMPAS.com - PT Bank Central Asia ( BCA) membuka lowongan pekerjaan untuk berbagai posisi. Saat dikonfirmasi, Executive Vice President Secretariat & Corporate Communication BCA, Hera F Haryn membenarkan adanya informasi tersebut. \"Benar bahwa BCA sedang membuka lowongan pekerjaan dengan beragam jenis pekerjaan dan lokasi di Indonesia,\" ujar Hera saat dihubungi Kompas.com, Jumat (8/1/2021). Informasi selengkapnya, imbuhnya termasuk syarat dan cara mendaftar, dapat dilihat di laman https://karir.bca.co.id/karir. Dalam laman tersebut, tertera 15 lowongan pekerjaan yang dibuka oleh BCA. Baca juga: TNI AD Buka Rekrutmen Tamtama, Bintara, dan Taruna Akmil 2021, Simak Persyaratan hingga Cara Daftarnya... Lantas, apa saja lowongan pekerjaan yang dibuka itu? 1. Sekretaris Syarat: Pendidikan minimal D3 (sedang melanjutkan S1) dari jurusan Sekretaris/Manajemen/Ekonomi/Ilmu Komunikasi/Public Relation/Administrasi Niaga dan jurusan terkait lainnya IPK minimal 2,75 Wanita dengan usia maksimal 26 tahun Memiliki kemampuan berbahasa Inggris merupakan nilai tambah Memiliki pengalaman kerja sebagai sekretaris/sekretaris direksi merupakan nilai tambah Menguasai Microsoft Office Berpenampilan menarik Ramah dan mampu berkomunikasi dengan baik Penempatan di Jabodetabek (Kantor Cabang & Kantor Pusat) Tanggal pendaftaran: 1 Januari-30 Juni 2021 Batas usia: 18-27 tahun Lokasi tes: Jakarta Lokasi penempatan: Jakarta Baca juga: [HOAKS] Lowongan Kerja di Angkasa Pura II untuk 19 Posisi 2. SAP Basis Engineer Syarat: Gelar Sarjana Teknik Elektro/Teknik Telekomunikasi/Teknologi Informasi IPK minimal 3,00 Berpengalaman menggunakan Linux (termasuk Shell Scripting) Memahami konsep dan implementasi jaringan komputer (TCP/IP, OSI Layer, Routing, DNS, HTTP) Berpengalaman sebagai SAP Basis menjadi nilai tambah Tanggal pendaftaran: 1 Januari-31 Desember 2021 Batas usia: 18-27 tahun Lokasi tes: Jakarta Lokasi penempatan: Jakarta Baca juga: Bank Mandiri Buka Lowongan Kerja IT Programming, Berminat? 3. Senior Staf Hukum Tugas: Melakukan penanganan kredit bermasalah termasuk membuat perjanjian/kesepakatan yang terkait. Mewakili perusahaan dalam menghadapi gugatan perdata (termasuk PKPU/Kepailitan) atau gugatan pidana dalam perkara yang berkaitan dengan penyelesaian kredit bermasalah. Melakukan koordinasi & pemantauan laporan serta perkembangan atas gugatan/perkara yang ditangani bersama dengan unit kerja terkait lainnya. Syarat: Minimal S1 jurusan Hukum dengan IPK minimal 3,00 Pengalaman bekerja minimal 3 tahun, diutamakan memiliki pengalaman di industry perbankan unit credit recovery Menguasai hukum acara perdata dan pidana Usia maksimal 30 tahun Memiliki kemampuan komunikasi dan negosiasi yang baik Tanggal pendaftaran: 29 Desember 2020-30 Juni 2021 Batas usia: 20-30 tahun Lokasi tes: Jakarta Lokasi penempatan: Jakarta Baca juga: BUMN PTPN IX Buka Lowongan Pekerjaan, Simak Syarat dan Cara Daftarnya... 4. Personal Banker Syarat: Pengalaman bekerja minimal 3 tahun, sebagai Marketing di Perbankan. Minimal IPK 2,75 (skala 4,00) Latar belakang pendidikan minimal S1 Usia maksimal 29 tahun Berpenampilan menarik Proaktif dan memiliki inisiatif yang tinggi Menyukai tantangan Memiliki kemampuan analisa yang baik Memiliki kemampuan interpersonal yang baik Memiliki kemampuan negosiasi yang baik Mampu bekerja di bawah tekanan Tanggal pendaftaran: 1 Januari-31 Desember 2021 Batas usia: 17-29 tahun Lokasi tes: Jakarta dan Surabaya Lokasi penempatan: Jakarta, Bekasi, Bogor dan Surabaya"));
        mDataList.add(new ModalData(
                R.drawable.polisi,
                R.string.judul2,
                "KOMPAS.com - Kasus virus corona di berbagai negara belum bisa teratasi, bahkan jumlahnya semakin melonjak. Hal itu semakin pelik setelah muncul beberapa varian baru virus corona yang menambah kekhawatiran karena disebut-sebut lebih cepat menular. Adapun varian baru Covid-19 ini awalnya teridentifikasi di Inggris dan Afrika Selatan sebelum kini mulai menyebar di negara-negara lain. Sebagai konsekuensi, beberapa negara tersebut melaporkan adanya lonjakan kasus Covid-19 sehingga terpaksa memberlakukan kebijkan lockdown. Baca juga: 10 Provinsi dengan Penambahan Kasus Covid-19 Terbanyak 4 Bulan Terakhir, Mana Saja? Berikut adalah beberapa negara yang kembali memberlakukan lockdown: Inggris Perdana Menteri Inggris Boris Johnson mengumumkan bahwa negaranya kembali memberlakukan lockdown karena Covid-19 hingga pertengahan Februari. Melansir The Guardian, Senin (4/1/2021), Johnson memperingatkan bahwa minggu-minggu mendatang akan menjadi yang paling sulit. Penguncian akan berlangsung setidaknya selama tujuh minggu. Baca juga: Selain Inggris, Berikut Negara yang Telah Izinkan Penggunaan Vaksin Covid-19 Pfizer Relaksasi apa pun tidak akan berlaku sebelum 22 Februari 2021. Hanya sehari setelah mendorong jutaan siswa untuk kembali ke kelas, Johnson mengumumkan bahwa semua sekolah akan beralih ke pembelajaran jarak jauh hingga Februari. Sekitar 44 juta orang atau tiga perempat populasi Inggris sudah hidup di bawah pembatasan paling ketat, saat negara itu mengalami salah satu tingkat kematian terburuk akibat Covid-19 di dunia. Baca juga: Pemerintah Gratiskan Vaksin Covid-19, Mengapa Diberikan Lewat Suntikan? Lebanon Mengutip Arab News, 4 Januari 2021, Lebanon mengumumkan lockdown total selama tiga pekan, termasuk pemberlakuan jam malam. Kebijakan tersebut diberlakukan demi menghentikan penyebaran virus corona yang terus bertambah di negara itu. Menteri Kesehatan Lebanon Hamad Hasan mengatakan lockdown akan berlaku mulai Kamis, 7 Januari 2021 sampai 1 Februari 2021. Saat yang sama, jam malam pun akan diberlakukan terhitung mulai jam 6 sore sampai jam 5 pagi. \"Jelas bahwa tantangan pandemi ini sudah mencapai batasnya, yang secara serius mengancam nyawa masyarakat Lebanon. Rumah sakit tidak mampu menyediakan lagi tempat tidur kosong,\" kata Hasan. Baca juga: Saat Pemerintah Berjanji Tanggung Biaya Perawatan Efek Samping Vaksinasi Covid-19... China China juga kembali memberlakukan lockdown terhadap 11 juta orang di kota utara Shijiazhuang setelah lebih dari 100 kasus Covid-19 baru dikonfirmasi di sana. Penduduk dilarang meninggalkan kota dan sekolah juga telah ditutup, seperti yang dilansir dari BBC, Jumat (8/1/2021). Lebih dari 5.000 lokasi pengujian telah disiapkan, sehingga setiap penduduk dapat diuji. Angka-angka baru tersebut adalah yang tertinggi, yang pernah dilihat China dalam lebih dari 5 bulan. Provinsi Hebei, tempat Shijiazhuang berada, melaporkan 120 kasus baru pada Kamis (7/1/2021) dan semua, kecuali satu dari infeksi itu ada di kota. Baca juga: Bukan China, India Jadi Episentrum Baru Virus Corona di Asia Jerman Mengurangi sebaran virus corona, Jerman telah menutup wilayahnya mulai 16 Desember 2020 lalu. Semua sekolah, dan pelaku bisnis di Jerman, yang menjual kebutuhan non primer harus tutup. Sedianya, Kanselir Angela Merkel dan Gubernur 16 negara bagian Jerman sepakat kembali melakukan penutupan wilayah mulai 16 Desember 2020, hingga 10 Januari 2021. Dilansir dari DW, 5 Januari 2021, pemerintah negara bagian dan federal Jerman sepakat untuk memperpanjang dan memperluas aturan penguncian virus corona di negara itu. \"Kami harus sangat berhati-hati sekarang. Kami berada dalam situasi baru dan luar biasa,\" kata Kanselir Jerman Angela Merkel."));
        mDataList.add(new ModalData(
                R.drawable.covid,
                R.string.judul3,
                "Kesehatan ( Kemenkes) sejak seminggu terakhir sudah mengupayakan agar rumah sakit menambah kapasitas perawatannya hingga 40 persen. Tak hanya itu, dari Satgas Covid-19 juga terus mendukung untuk merekrut relawan medis. Baca juga: Melihat Efektivitas Vaksin Covid-19 yang Telah Diumumkan, dari Pfizer-BioNTech hingga Sinovac Pasien bergejala berat tidak boleh di rumah Di sisi lain, Juru Bicara Vaksinasi Covid-19, Siti Nadia Tarmizi menjelaskan bahwa pasien bergejala berat tidak boleh melakukan isolasi mandiri di rumah. Pasien yang dapat dirawat di RS hanya pasien yang mengalami gejala sedang sampai berat. Apabila pasien Covid-19 hanya bergejala ringan, tidak wajib dirawat di rumah sakit. Baca juga: Perkembangan Vaksinasi Covid-19 di Indonesia, dari Pendistribusian Vaksin hingga Tahapannya... Ia menjelaskan, ketika terasa gejala sebaiknya langsung mencoba mendaftarkan pasien ke puskesmas. \"Kadang kalau (butuh) isolasi datang ke puskesmas, nanti di sana akan dikaji dulu apakah perlu isolasi terpusat atau isolasi mandiri,\" ujar Siti saat dihubungi terpisah, Jumat (8/1/2021). \"Dan kalau setelah diperiksa di puskesmas tidak ada gejala, tidak dirawat di rumah sakit, karena rumah sakit untuk yang bergejala sedang dan berat,\" lanjut dia. Baca juga: Simak, Ini 7 Gejala Terkait dengan Varian Baru Virus Corona Sementara itu, gejala sedang sampai ringan yang dimaksud, antara lain: Gejala sedang Covid-19 Demam lebih dari atau sama dengan 38 derajat celsius Sesak napas, batuk menetap, dan sakit tenggorokan Batuk-batuk Anak dengan pneumonia ringan mengalami batuk atau kesulitan bernapas dan napas cepat, frekuensi napas kurang dari 2 bulan yakni sekitar 60 kali napas per menit; 2-11 bulan mengalami napas sekitar 50 kali per menit; dan anak usia 1-5 tahun memiliki napas sekitar 40 kali per menit dan tidak ada tanda pneumonia berat. Selain itu, dapat juga disertai diare, mual, muntah, sakit kepala, mulut kering, badan terasa nyeri dan linu, dan berkurangnya nafsu makan. Gejala ini berlangsung selama sekitar 7-14 hari. Baca juga: Kasus Terus Menanjak, Ini 11 Gejala Infeksi Covid-19 yang Harus Diwaspadai Gejala berat Covid-19 Gejala infeksi berat dari Covid-19 yakni: Demam lebih dari atau sama dengan 38 derajat celsius yang menetap Ada infeksi saluran napas dengan tanda-tanda peningkatan frekuensi napas (lebih dari 30 kali per menit) hingga sesak napas, dan batuk Penurunan kesadaran Dalam pemeriksaan lanjut, ditemukan saturasi oksigen kurang dari 90 persen udara luar Dalam pemeriksaan darah, leukopenia, peningkatan monosit, dan peningkatan limfosit atipik Adapun penderita gejala berat juga mengalami nyeri dada, bibir, kulit, dan wajah tampak kebiruan, kulit pucat, dan keringat dingin. Khusus pasien konfirmasi dengan gejala berat/kritis dapat dirawat di rumah sakit rujukan Covid-19 atau rumah sakit lain yang memiliki fasilitas sesuai standar pelayanan yang telah ditentukan."));
        mDataList.add(new ModalData(
                R.drawable.pala,
                R.string.judul4,
                "Merdeka.com - Manfaat buah pala bagi kesehatan memang sangatlah beragam. Pala merupakan salah satu rempah yang populer di Indonesia berasal dari biji Myristica fragrans, pohon cemara asli Tanah Air.\n" +
                        "\n" +
                        "Seperti diketahui bahwa pala ini dapat ditemukan dalam bentuk biji utuh tetapi kerap kali dijual sebagai rempah-rempah. Tanaman satu ini memiliki cita rasa sedikit pedas dan juga hangat serta memiliki aroma harus juga manis sehingga kerap digunakan dalam makanan penutup dan kari atau pada minuman seperti anggur juga teh chai.\n" +
                        "\n" +
                        "Umumnya, pala digunakan untuk penguat rasa daripada manfaatnya bagi kesehatan. Pala ini mengandung ragam senyawa kuat yang dapat mencegah penyakit dan meningkatkan kesehatan Anda secara keseluruhan. Dirangkum dari berbagai sumber, berikut adalah manfaat buah pala bagi kesehatan.\n" +
                        "\n" +
                        "Obati Insomnia\n" +
                        "Manfaat buah pala yang pertama adalah dapat membantu seseorang dari masalah susah tidur atau insomnia. Hal tersebut lantaran buah pala memiliki efek menenangkan apabila dikonsumsi dalam dosis yang lebih kecil. Praktik pengobatan kuno telah menguji hal ini lantaran efeknya yang mampu menginduksi tidur dan menghilangkan stres.\n" +
                        "\n" +
                        "Menurut Ayurveda, Anda bisa menambahkan sejumput buah pala ke segelas susu hangat dan meminumnya sebelum tidur. Tak hanya itu, penambahan beberapa kapulaga dan sedikit almond juga akan membuat Anda mendapatkan manfaat tambahannya.\n" +
                        "\n" +
                        "Menghilangkan Rasa Sakit\n" +
                        "Manfaat buah pala selanjutnya adalah dapat menghilangkan rasa sakit. Diketahui pala ini memiliki banyak kandungan minyak atsiri mulai dari esensial seperti elemicin, eugenol, myristicin dan safrole.\n" +
                        "\n" +
                        "Dalam buku DK Healing Foods dijelaskan bahwa 'Minyak atsiri (pala) mempunyai sifat anti-inflamasi yang membuatnya berguna untuk mengobati nyeri otot dan juga sendi. Dengan memberikan beberapa tetes minyak esensial pada daerah yang terkena sakit mampu mengobati pembengkakan, nyeri sendi, nyeri otot, perandangan hingga luka yang dialami seseorang.\n" +
                        "\n" +
                        "Bantu Pencernaan\n" +
                        "Menfaat berikutnya yang dapat dipetik dari buah pala adalah dapat membantu pencernaan. Menurut Gomathi Prisamy, et al pada Minyak Atsiri dalam Pengawetan, Rasa dan Keamanan Makanan, diketahui pala mempunyai sifat obat.\n" +
                        "\n" +
                        "Buah pala juga telah digunakan untuk mengobati masalah pada bagian pencernaan manusia, mulai dari gangguan pencernaan hingga sakit perut. Khasiat obat ini juga berasal dari aroma unik pada biji pala.\n" +
                        "\n" +
                        "Mengatur Tekanan Darah\n" +
                        "Buah pala juga sangat bermanfaat untuk mengatur tekanan darah Anda. Seperti yang telah dijelaskan dalam panduan komprehesif untuk menurunkan tekanan darah oleh National Institutes of Health agar banyak menambahkan rempah-rempah lebih banyak, misal seperti pala dalam makanan Anda.\n" +
                        "\n" +
                        "Disebutkan juga dan ditekankan penggunaan sedikit natrium dalam makanan agar dapat menjaga tingkat tekanan darah Anda sehingga tetap sehat. Dilaporkan oleh studi lain bahwa ekstrak buah pala tak memiliki efek signifikan pada tingkat tekanan darah. Maka dibutuhkan lebih banyak bukti ilmiah agar membuktikan efek pala ini terhadap darah dalam tubuh manusia.\n" +
                        "\n" +
                        "Potensi Anti-Kanker\n" +
                        "Manfaat buah pala yang belum banyak diketahui oleh banyak orang adalah potensi penggunaannya terhadap sel kanker. Sebuah penelitian yang diterbitkan dalam interaksi Kimia-Biologis, miristin bahwa pala memiliki sifat kemopreventif.\n" +
                        "\n" +
                        "Ditemukan juga untuk menginduksi kematian sel apoptosis dalam sel leukemia. Pada gilirannya, ini dapat membantu dalam mencegah tumbuhya sel kanker srrta metastasis leukemia yang pada umumnya dapat menyerang anak-anak.\n" +
                        "\n" +
                        "Menyehatkan Otak\n" +
                        "Manfaat buah pala lainnya adalah mampu menyehatkan otak Anda. Diketahui pala mempunyai afrodisiak, yang menstimulasi saraf di otak yang umumnya akan digunakan sebagai tonik otak oleh orang Yunani dan Romawi pada zaman kuno. Pala diketahui memiliki bahan yang efektif untuk mengobati rasa depresi dan kecemasan karena minyak esensialnya yang cenderung mengurangi rasa lelah dan juga stres.\n" +
                        "\n" +
                        "\"Sebagai adaptogen, pala bisa menjadi stimulan dan obat penenang, sesuai dengan kebutuhan tubuh. Pada saat stres, pala dapat membantu menurunkan tekanan darah. Sebaliknya, pala dapat mengangkat suasana hati Anda dan bertindak sebagai tonik serta stimulan, menjadikannya bermanfaat jika Anda baru sembuh dari sakit atau lelah,\" seperti dijelaskan dalam buku DK Healing Food. Perlu diketahui juga bahwa pala dikenal dapat membantu meningkatkan konsentrasi Anda.\n" +
                        "\n" +
                        "Itu tadi merupakan manfaat buah pala bagi kesehatan tubuh Anda. Semoga adanya informasi yang sudah diberikan Merdeka.com mengenai buah pala dapat menjadi acuan Anda untuk selalu menjaga kesehatan, khususnya dengan mengonsumsi buah pala. Selamat mencoba."));
        mDataList.add(new ModalData(
                R.drawable.wa,
                R.string.judul5,
                "Merdeka.com - Facebook dan WhatsApp ternyata mengumpulkan lebih banyak data pengguna ketimbang aplikasi olah pesan lainnya. Bila dibandingkan dengan Signal dan Telegram, WhatsApp lebih dominan.\n" +
                        "\n" +
                        "Diketahui hal ini berdasarkan label privasi Apple. Sebaliknya, berdasarkan label privasi Apple, Signal disebut sebagai aplikasi paling privat karena tidak mengumpulkan data apa pun milik pengguna.\n" +
                        "\n" +
                        "Mengutip Gadget NDTV, Jumat (8/1), berdasarkan informasi detail privasi yang ada di App Store, Facebook Messenger paling banyak mengumpulkan data pengguna. Posisi kedua adalah WhatsApp yang menjadi aplikasi olah pesan paling banyak mengumpulkan data pengguna.\n" +
                        "\n" +
                        "Kedua aplikasi ini sama-sama mengumpulkan riwayat pembelian, informasi keuangan, detail lokasi, kontak, nomor telepon, alamat email, hingga data penggunaan.\n" +
                        "\n" +
                        "Parahnya lagi, dalam pembaruan kebijakan privasi terbaru WhatsApp, pengguna yang tidak setuju akan kebijakan baru WhatsApp tak bisa lagi mengakses layanan olah pesan tersebut. Kalau tidak setuju, satu-satunya opsi pengguna adalah menghapus akun WhatsApp mereka.\n" +
                        "\n" +
                        "Data yang Diambil WhatsApp dan Messenger\n" +
                        "Berikut adalah data yang dikumpulkan masing-masing aplikasi:\n" +
                        "\n" +
                        "1. Facebook Messenger\n" +
                        "\n" +
                        "- Riwayat pembelian\n" +
                        "\n" +
                        "- Informasi finansial lainnya\n" +
                        "\n" +
                        "- Lokasi tepat\n" +
                        "\n" +
                        "- Lokasi umum\n" +
                        "\n" +
                        "- Alamat fisik\n" +
                        "\n" +
                        "- Alamat email\n" +
                        "\n" +
                        "- Nama\n" +
                        "\n" +
                        "- Nomor telepon\n" +
                        "\n" +
                        "- Informasi kontak pengguna lainnya\n" +
                        "\n" +
                        "- Kontak\n" +
                        "\n" +
                        "- Foto atau video\n" +
                        "\n" +
                        "- Konten gameplay\n" +
                        "\n" +
                        "- Konten pengguna lainnya\n" +
                        "\n" +
                        "- Riwayat pencarian\n" +
                        "\n" +
                        "- Riwayat penelusuran\n" +
                        "\n" +
                        "- Identitas pengguna\n" +
                        "\n" +
                        "- Identitas perangkat\n" +
                        "\n" +
                        "- Interaksi pengguna\n" +
                        "\n" +
                        "- Data periklanan\n" +
                        "\n" +
                        "- Data penggunaan lainnya\n" +
                        "\n" +
                        "- Crash data\n" +
                        "\n" +
                        "- Data performa\n" +
                        "\n" +
                        "- Data diagnostik lainnya\n" +
                        "\n" +
                        "- Tipe data lainnya\n" +
                        "\n" +
                        "- Kesehatan\n" +
                        "\n" +
                        "- Fitness\n" +
                        "\n" +
                        "- Informasi pembayaran\n" +
                        "\n" +
                        "- Data audio\n" +
                        "\n" +
                        "- Informasi sensitif\n" +
                        "\n" +
                        "- iMessage\n" +
                        "\n" +
                        "- Riwayat pencarian nomor telepon\n" +
                        "\n" +
                        "- Identitas perangkat\n" +
                        "\n" +
                        "2. WhatsApp\n" +
                        "\n" +
                        "- Identitas perangkat\n" +
                        "\n" +
                        "- Identitas pengguna\n" +
                        "\n" +
                        "- Data periklanan\n" +
                        "\n" +
                        "- Riwayat pembelian\n" +
                        "\n" +
                        "- Lokasi umum seperti kota atau negara\n" +
                        "\n" +
                        "- Nomor telepon\n" +
                        "\n" +
                        "- Alamat Email\n" +
                        "\n" +
                        "- Kontak\n" +
                        "\n" +
                        "- Interaksi produk\n" +
                        "\n" +
                        "- Data crash\n" +
                        "\n" +
                        "- Data performa\n" +
                        "\n" +
                        "- Data diagnostik lainnya\n" +
                        "\n" +
                        "- Info pembayaran\n" +
                        "\n" +
                        "- Dukungan kustomer\t\n" +
                        "\n" +
                        "- Konten pengguna lainnya\n" +
                        "\n" +
                        "3. Telegram\n" +
                        "\n" +
                        "- Informasi kontak\n" +
                        "\n" +
                        "- Kontak\n" +
                        "\n" +
                        "- Identitas pengguna\n" +
                        "\n" +
                        "4. Signal\n" +
                        "\n" +
                        "Tidak ada data yang dikumpulkan. Satu-satunya data yang dikumpulkan Signal adalah nomor telepon yang dipakai dan Signal tak berupaya menghubungkan nomor telepon tersebut dengan identitas pengguna."));
        mDataList.add(new ModalData
                (R.drawable.pantai,
                        R.string.judul6,
                        "Merdeka.com - Tak ada yang meragukan keindahan Canggu. Destinasi wisata di Bali ini memang boleh dibilang menghadirkan suasana yang berbeda. Bahkan, tak sedikit wisatawan yang menjuluki Canggu sebagai tempat wisata lokal bernuansa internasional di Bali. Tidak heran jika Canggu selalu sukses menyedot wisatawan.\n" +
                                "\n" +
                                "Selain itu, Canggu juga menghadirkan suasana yang tenang, di samping alam yang menawan. Inilah kenapa Canggu banyak dipilih sebagai tempat untuk melakukan staycation. Apalagi ada banyak sekali tempat menginap di Canggu. Nah, supaya pengalaman berlibur di Canggu super berkesan, jangan sampai salah pilih penginapan.\n" +
                                "\n" +
                                "Salah satu tempat menginap yang direkomendasikan untuk staycation adalah Citadines Berawa Beach Bali. Hotel baru dengan fasilitas berkelas ini siap mengoptimalkan pengalaman berlibur wisatawan di Canggu. Menariknya, hotel ini dekat dengan pantai Berawa, sehingga bisa membuat staycation terasa berbeda, sekalipun banyak menghabiskan waktu dari hotel saja.\n" +
                                "\n" +
                                "Hadirkan Apartemen yang Cocok Buat Keluarga\n" +
                                "Menariknya lagi, Citadines Berawa Beach Bali bukan hanya menawarkan kamar, tetapi juga apartemen untuk menginap. Pilihan unit ini pun hadir dengan satu dan dua kamar tidur, sehingga cocok untuk tempat menginap bersama keluarga selama liburan di Canggu.\n" +
                                "\n" +
                                "Detailnya, hotel ini menghadirkan 10 tipe unit yang bisa dipilih sesuai kebutuhan. Kesepuluh tipe unit di Citadines Berawa Beach Bali, antara lain Studio, Studio Executive, Studio Executive Twin, Studio Premier, Deluxe Suite, Executive Suite, 1-Bedroom Premier, 1-Bedroom Executive, 2-Bedroom Premier, serta Presidential Suite. Kerennya, hotel ini dekat dengan beragam kafe maupun tempat rekreasi di Canggu, sehingga menjadi nilai tambah bagi wisatawan yang menginap di sana, tanpa harus bingung lagi menentukan itinerary.\n" +
                                "\n" +
                                "Ramah Anak-Anak Hingga Hewan Peliharan\n" +
                                "Keunggulan lainnya dari Citadines Berawa Beach Bali adalah fasilitas penunjang yang benar-benar memanjakan wisatawan. Termasuk rooftop bar and pool yang bisa membuat staycation sangat puas, karena bisa menikmati indahnya pemandangan pantai Berawa sekaligus dari hotel. Citadines Berawa Beach Bali juga ramah anak-anak, karena menghadirkan ruang bermain yang memadai. Menariknya lagi, hotel ini juga pet friendly, karena membolehkan tamu yang menginap membawa hewan peliharaan.\n" +
                                "\n" +
                                "Lokasi Strategis dan Dekat Bandara\n" +
                                "Tak hanya itu, Citadines Berawa Beach Bali juga memiliki lokasi yang strategis, karena dikelilingi banyak sekali pantai-pantai indah, hingga wisata kuliner yang menggoyang lidah. Dari Ruko Cafe yang terkenal dengan bagel dan toast-nya, Eco Deli Cafe yang menyajikan kuliner khas Meksiko, hingga Matcha Cafe Bali yang menghadirkan banyak dessert lezat dengan rasa matcha.\n" +
                                "\n" +
                                "Sementara untuk alamatnya sendiri, Citadines Berawa Beach Bali berada di Jl. Pemelisan Agung, Tibubeneng, Kec. Kuta Utara, Kabupaten Badung. Lokasi tersebut bisa ditempuh sekitar 30 menit dari Bandara Ngurah Rai. Sementara jika sebelumnya dari Seminyak, Citadines Berawa Beach Bali dapat dijangkau dengan kendaraan sekitar 20 menit."));
        mDataList.add(new ModalData(
                R.drawable.unilever,
                R.string.judul7,
                "Jakarta - Unilever Indonesia dihukum Rp 30 miliar karena dinilai merek pasta gigi Pepsodent Strong memiliki kesamaan dengan pasta gigi Formula Strong. Unilever Indonesia menyatakan kasasi atas putusan yang diketok Pengadilan Negeri Jakarta Pusat (PN Jakpus) itu.\n" +
                        "\"Sebagai perusahaan yang telah berada di Indonesia selama 87 tahun, PT Unilever Indonesia Tbk selalu menjalankan bisnis kami secara berintegritas, bertanggung jawab, dan patuh terhadap hukum dan peraturan perundang-perundangan yang berlaku,\" kata Sekretaris Perusahaan PT Unilever Indonesia Tbk, Reski Damayanti dalam pernyataan resminya kepada detikcom, Jumat (8/1/2020).\n" +
                        "\n" +
                        "Saat ini Unilever Indonesia menyerahkan sepenuhnya proses hukum itu di tingkat kasasi. Unilever berharap putusan kasasi membawa keadilan.\n" +
                        "\n" +
                        "\"Terkait putusan Pengadilan Niaga pada Pengadilan Negeri Jakarta Pusat mengenai salah satu varian produk kami, kami menghormati proses kasasi yang saat ini tengah berjalan agar proses tersebut dapat berjalan lancar serta membawa hasil yang adil dan baik,\" ujar Reski.\n" +
                        "\n" +
                        "Hardwood (Orang Tua) mendaftarkan merek Formula Strong yang terdaftar IDM000258478 kelas 3 yaitu pasta gigi, sediaan-sediaan untuk membersihkan gigi palsu, obat gosok gigi, obat kumur bukan untuk keperluan medis, larutan kumur bukan untuk keperluan medis.\n" +
                        "\n" +
                        "Hardwood menyatakan dirinya sebagai merek terkenal yang dapat dibuktikan dengan telah lama digunakan dan telah banyak investasi yang dilakukan Hardwood. Orang Tua telah mempromosika nmerek tersebut baik secara konvensional di media cetak dan non-konvensional (online).\n" +
                        "\n" +
                        "Hardwood meminta PN Jakpus menjatuhkan denda materil kepada Unilever Rp 108 miliar. Dengan rincian Rp 33 miliar kerugian materiil dan Rp 75 miliar kerugian immateril. Gayung bersambut. Gugatan Orang Tua dikabulkan, meski ganti rugi tidak seluruhnya dipenuhi.\n" +
                        "\n" +
                        "\"Menyatakan merek 'Strong' daftar nomor IDM000258478 Kelas 3 milik Penggugat adalah merek terkenal di Negara Republik Indonesia. Menghukum Tergugat untuk membayar ganti rugi kepada Penggugat sejumlah Rp 30 miliar,\" kata ketua majelis Albert Usada dengan anggota Dulhusin dan Agung Suhendro. Majelis menyatakan merek Strong dengan empat varian produknya tersebut, Hardwood telah mampu membuktikan menurut hukum bahwa merek kata atau bunyi 'Strong' adalah sebagai merek terdaftar milik penggugat yang mampu menegakkan daya pembeda (distinctive power) yang jelas dan kuat. Sehingga secara kasuistis dalam perkara ini harus ditegakkan asas praduga sama (presumption of similarity) dan praduga membingungkan (presumption of confusion) bagi konsumen berdasarkan instrumen hukum internasional menurut ketentuan Pasal 6 bis TRIP's.\n" +
                        "\n" +
                        "\"Dan terhadap produk barang \"Pepsodent Strong 12 Jam' jenis pasta gigi milik Tergugat tersebut terdapat persamaan pada pokoknya dan mirip sekali (nearly resemble) serta sudah terwujud kesamaan dalam bentuk tanda atau bunyi yang sama untuk jenis barang yang sama (identical sign or sound for identical good) dengan produk barang sejenis (pasta gigi) dengan merek terdaftar 'Strong' kelas 3 untuk produk barang pasta gigi, daftar nomor IDM000258478 milik Penggugat berikut empat varian jenis pasta gigi, yaitu \"Formula Strong', \"Formula Strong Protector', Formula Strong Protection' dan 'Formula Strong Herbal',\" ujar majelis hakim."));

        mDataList.add(new ModalData(
                R.drawable.bultang,
                R.string.judul8,
                "Bangkok - BWF memutuskan untuk menggelar Asian Leg di musim pembuka 2021 di tengah pandemi Corona. Lantas apa jadinya jika ada pemain yang kedapatan terpapar COVID-19?\n" +
                        "Thailand menjadi tuan rumah Asian Leg selama kurang lebih satu bulan. Mulai dari Yonex Thailand Open pada 12-17 Januari, Toyota Thailand Terbuka (19-24 Januari), dan Final BWF World Tour 2020 (27-31 Januari).\n" +
                        "\n" +
                        "Menjelang pertandingan, Thailand justru mengalami lonjakan kasus COVID-19 dalam beberapa hari terakhir. Bahkan Bangkok telah memberlakukan lockdown dampak lonjakan kasus Corona yang terjadi hingga awal Februari.\n" +
                        "\n" +
                        "Pihak tuan rumah Asian Leg saat ini cukup menerapkan protokol kesehatan bagi para peserta negara, baik pemain, pelatih, maupun ofisialnya. Mereka dilarang keluar hotel tanpa izin jika tak ingin dikenakan sanksi. Mulai dari denda ringan hingga ancaman deportasi.\n" +
                        "\n" +
                        "Tak hanya itu, panitia penyelenggara juga rutin melakukan test swab kepada para pebulutangkis. Bahkan tes kesehatan ini sudah kali kedua dilakukan terhadap peserta sejak masuk hotel pada 4 Januari lalu dengan hasil tes dari 824 orang negatif COVID-19.\n" +
                        "\n" +
                        "Lantas apa yang terjadi jika seorang pemain bulutangkis dinyatakan positif COVID-19 selama Asian Leg?\n" +
                        "\n" +
                        "Baca juga: Kontrak Pelatih Tim Bulutangkis RI Sudah Habis, tapi Tetap Berdedikasi\n" +
                        "Sekretaris Jenderal Badminton World Federation (BWF), Thomas Lund, mengatakan akan langsung mengisolasi pemain tersebut.\n" +
                        "\n" +
                        "\"Jika kasus positif ditemukan, pemain akan diisolasi dan pelacakan kontak akan dilakukan. Setiap pemain yang telah melakukan kontak juga perlu diisolasi,\" kata Lund dalam laman BWF.\n" +
                        "\n" +
                        "\"Seperti dalam olahraga lain, ini adalah sesuatu yang kita semua harus biasakan,\" dia menambahkan.\n" +
                        "\n" +
                        "Meskipun begitu, Lund optimistis, pihaknya bekerja sama dengan tuan rumah dan pemerintah negara setempat dapat menjaga keselamatan para pemain. Ia juga berekspetasi turnamen gelaran BWF akan tetap berlangsung seru dengan persaingan di level yang sangat tinggi.\n" +
                        "\n" +
                        "\"Kami yakin akan dapat menjaga keamanan pemain di waktu-waktu khusus ini. Turnamen ini juga akan berlangsung hebat meskipun China dan Jepang, serta pasangan top 1 dunia dari Indonesia harus mundur,\" katanya.\n" +
                        "\n" +
                        "\"Kami ingin semua pemain bisa bermain. Tapi saat ini kita memiliki pemain hebat dengan level sangat tinggi di Bangkok.\""
        ));
        mDataList.add(new ModalData(
                R.drawable.drakokr,
                R.string.judul9,
                "Jakarta - Di dekade 2010-an dirilis sederet judul drama Korea yang kemudian jadi populer. Menghadirkan nama-nama besar yang sudah akrab di telinga pecinta drama Korea di masa tersebut bahkan masih aktif juga berakting hingga saat ini.\n" +
                        "Berikut ini rekomendasi judul drama Korea yang dirilis tahun 2011 dan berusia 10 tahun di 2021 ini:\n" +
                        "\n" +
                        "1. 49 Days\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Kalau kamu suka drama Korea mellow yang menguras air mata, coba tonton 49 Days. Populer pada masanya, drama Korea ini berkisah tentang seorang perempuan kaya raya bernama Shin Ji Hyun yang mengalami koma karena kecelakaan. Untuk bisa sadar dari koma tersebut, dia harus mengumpulkan tiga air mata dari orang terdekat yang tidak punya hubungan darah dengannya dalam waktu 49 hari.\n" +
                        "\n" +
                        "Dengan cara merasuki tubuh Song Yi Kyung, Ji Hyun berusaha untuk menemukan tiga orang yang bisa memberikan air mata tulus tersebut. Diperankan oleh Lee Yo Won, Nam Gyu Ri, Jung Il Woo, dan Jo Hyun Jae, drama 49 Days menghadirkan cerita yang mengharu-biru.\n" +
                        "\n" +
                        "2. Miss Ripley\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Miss Ripley diperankan aktor kawakan Kim Seung Woo dan aktris Lee Da Hae dalam sebuah kisah seorang wanita penghibur bernama Jang Mi Ri. Terpaksa bekerja di Jepang karena harus membayar utang ayah tirinya, Jang Mi Ri berusaha kabur dari pemilik bar di Jepang dan pulang ke Korea.\n" +
                        "\n" +
                        "Karena latar belakang pendidikannya yang rendah, Jang Mi Ri tidak bisa punya pekerjaan tetap. Hingga akhirnya dia bertemu dengan seorang laki-laki bernama Jang Myung Hoon yang sedang mencari pegawai hotel yang bisa berbahasa Jepang. Kebohongan pun dimulai di sana.\n" +
                        "\n" +
                        "Drama Korea Miss Ripley menampilkan Park Yoochun dan membuatnya mendapatkan penghargaan Best New Actor, sebelum menghilang karena skandal pelecehan seksual.\n" +
                        "\n" +
                        "3. City Hunter\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Diangkat dari komik Jepang, City Hunter menyatukan Lee Min Ho dan Park Min Young dan akhirnya benar-benar pacaran di dunia nyata. Padahal dalam drama ini, karakter keduanya tidak diperbolehkan untuk jatuh cinta.\n" +
                        "\n" +
                        "City hunter bercerita tentang Lee Yoon Sung (diperankan oleh Lee Min Ho) yang merupakan ahli IT yang bekerja di Istana Kepresidenan Korea Selatan. Di sana dia bertemu dengan Kim Na Na (Park Min Young) yang menjabat sebagai bodyguard.\n" +
                        "\n" +
                        "4. Deep Rooted Tree\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Salah satu drama periodik yang sangat populer, diangkat dari novel berjudul sama karya Lee Jung Myung. Drama Korea Deep Rooted Tree bercerita tentang pengawal kerajaan yang diperankan oleh Jang Hyuk, dalam perjalanannya melakukan investigasi terhadap pembunuhan-pembunuhan di Istana Gyeongbok. Di saat yang sama, Raja Sejong (diperankan oleh Han Suk Kyu), tengah berusaha untuk menciptakan aksara Korea yang kini dikenal dengan nama Hangeul.\n" +
                        "\n" +
                        "Song Joong Ki tampil memerankan Raja Sejong muda dalam drama Korea ini. Meski dia hanya muncul dalam 4 episode saja.\n" +
                        "\n" +
                        "5. Dream High\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Kisah anak-anak SMA dalam mengejar mimpi di industri hiburan Korea Selatan yang diperankan oleh Taecyeon dan Wooyoung 2PM, Eunjung T-Ara, IU, Suzy dan Kim Soo Hyun. Dream High adalah satu dari sekian banyak drama Korea yang didominasi oleh idola K-Pop di dekade 2010-an yang sukses. Kesuksesan yang gagal diikuti oleh sekuel drama ini.\n" +
                        "\n" +
                        "Kim Soo Hyun mulai populer setelah main di Dream High. Ini juga jadi debut drama Korea buat sederet idola K-Pop yang terlibat di dalamnya. Aktor Bae Yong Joon tampil sebagai cameo dalam drama ini.\n" +
                        "\n" +
                        "6. My Princess\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Song Seung Heon dan Kim Tae Hee dipasangkan dalam drama Korea My Princess. Bercerita tentang Lee Seol (Kim Tae Hee) seorang mahasiswi cantik yang baru tahu bahwa dirinya adalah Putri keturunan raja terakhir Dinasti Joseon. Dia kemudian mendapat pendidikan etiket untuk jadi Putri oleh Park Hae Young (Song Seung Heon) yang merupakan cucu dari sebuah grup konglomerat.\n" +
                        "\n" +
                        "Park Hae Young lalu jatuh cinta pada Lee Seol. Padahal dia tahu bahwa kalau keluarga kerajaan kembali berkuasa, kekayaan keluarganya akan musnah.\n" +
                        "\n" +
                        "7. Heartstrings\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Kembali menyatukan Jung Yonghwa dan Park Shin Hye usai sukses He's Beautiful, Heartstrings juga dibintangi banyak idola K-Pop. Seperti Dream High yang kental dengan nuansa seni dan musik, Heartstrings juga berpusat pada anak-anak muda yang mengejar mimpi di dunia musik.\n" +
                        "\n" +
                        "Banyak yang kemudian memasang-masangkan Yonghwa dengan Park Shin Hye di luar proyek drama mereka. Meski keduanya tak pernah benar-benar mengaku pacaran.\n" +
                        "\n" +
                        "8. Protect the Boss\n" +
                        "Drama Korea yang Rilis Tahun 2011\n" +
                        "Drama Korea yang Rilis Tahun 2011 Foto: dok. Istimewa\n" +
                        "Dimotori oleh Ji Sung dan Choi Kang Hee, Protect The Boss bercerita tentang seorang perempuan yang kesulitan mencari pekerjaan dan membangun kariernya. Sampai suatu hari dia punya kesempatan buat dapat pekerjaan sebagai seorang sekretaris yang dibawahi oleh bos tampan.\n" +
                        "\n" +
                        "Ji Sung memerankan si bos tampan yang kaya raya sementara Choi Kang Hee memerankan Eun Sul sang sekretaris. Sepanjang penayangannya, drama Korea Protect the Boss mendapat rating cukup tinggi hingga tembus 19,2%."
        ));
    }
}