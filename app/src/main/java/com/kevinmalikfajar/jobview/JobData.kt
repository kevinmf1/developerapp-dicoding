package com.kevinmalikfajar.jobview

import com.davidnasrulloh.jobview.R

object JobData {
    fun getJobList(): List<Job> {
        val arrayList = ArrayList<Job>()

        arrayList.addAll(
            listOf(
                Job(
                    "Back End Developer",
                    "Back end merupakan sisi server atau server side dari sebuah website atau aplikasi. Jadi, back end developer adalah seorang yang memiliki keahlian untuk merancang atau mengembangkan software di sisi server yang berkaitan dengan logika serta database.\n" +
                            "\n" +
                            "Back end developer juga harus mengelola basis data serta mengatur integrasi API. Intinya, back end developer harus memastikan bahwa seluruh program di balik software bisa berjalan dengan sempurna.",
                    R.drawable.backend
                ),
                Job(
                    "Front End Developer",
                    "Front end developer adalah pekerjaan dalam bentuk pemrograman yang mengelola dan mengembangkan tampilan sebuah aplikasi atau website. Adapun hal yang biasa dilakukan oleh front end developer yaitu mengkombinasikan teknik desain, teknologi, dan pemrograman untuk menghasilkan tampilan situs web yang menarik, interaktif, serta menangani debugging (masalah) yang terjadi.\n" +
                            "\n" +
                            "Front end memiliki tanggung jawab untuk memastikan bahwa pengunjung dapat dengan mudah mengakses dan menggunakan sebuah aplikasi atau situs web. Contohnya, setiap kali kamu mengunjungi situs web, apa pun yang kamu lihat, klik, atau gunakan adalah pekerjaan front end. Mulai dari desain/tata letak, konten, tombol, gambar, navigasi, dan tautan internal.",
                    R.drawable.frontend
                ),
                Job(
                    "Android Developer",
                    "Android Developer bisa dikatakan sebagai software developer yang memiliki spesialisasi merancang aplikasi untuk marketplace Android. Secara sederhana, mayoritas pekerjaan mereka adalah membuat aplikasi yang dapat digunakan di dalam smartphone ataupun tablet, baik itu berupa game maupun bentuk aplikasi lainnya.\n" +
                            "\n" +
                            "Untuk menjadi Android Developer, kamu setidaknya harus memiliki pengalaman serta pemahaman yang luas dalam bahasa pemrograman. Selanjutnya, seorang Android developer dapat bekerja secara in-house di sebuah perusahaan atau bekerja di dalam app development agency.",
                    R.drawable.androiddev
                ),
                Job(
                    "Machine Learning Engineer",
                    "Tugas profesi ini adalah mengubah data-data tersebut menjadi sebuah model untuk suatu output yang diinginkan. Selain itu, machine learning engineer juga bertanggung jawab mengubah model sains data teoretis menjadi model level produksi.\n" +
                            "\n" +
                            "Bahkan, tak jarang profesi ini juga berperan dalam perancangan program untuk mengendalikan robot dan komputer. Apapun itu, pada dasarnya tugasnya akan selalu meliputi pembuatan algoritma untuk proses pembelajaran mesin.\n",
                    R.drawable.machinedev
                ),
                Job(
                    "Data Engineer",
                    "Pekerjaan data engineer membutuhkan kemampuan logis, pengetahuan tentang database serta pemrograman dasar. Karena melibatkan komponen IT dalam pekerjaan dan tanggung jawabnya, umumnya perusahaan menginginkan lulusan Informatika atau Matematika dan Statistika untuk mengisi posisi data engineer.\n" +
                            "\n" +
                            "Karena melibatkan komponen IT dalam pekerjaan dan tanggung jawabnya, umumnya perusahaan menginginkan lulusan Informatika atau Matematika dan Statistika untuk mengisi posisi data engineer. Pada praktiknya, banyak juga yang tidak mempunyai latar belakang pendidikan formal di bidang IT.",
                    R.drawable.dataengineerdev
                ),
                Job(
                    "Data Analyst",
                    "Data Analyst merupakan seseorang yang bertanggung jawab mengolah data, mengambil kesimpulan, dan melakukan visualisasinya. Profesi Data Analyst mengharuskan untuk berhadapan langsung dengan banyak data.\n" +
                            "\n" +
                            "Tugas seorang Data Analyst adalah mencari insight untuk memajukan bisnis dari berbagai aspek, lalu kemudian diberikan pada data engineer.",
                    R.drawable.dataanalyst
                ),
                Job(
                    "Data Scientist",
                    "Seorang data scientist menganalisis dan menafsirkan data digital yang kompleks untuk membantu para pemimpin bisnis membuat keputusan yang lebih baik berdasarkan data. Data scientist memiliki pengetahuan dan keahlian yang mendalam dalam matematika (aljabar linier dan kalkulus multivariabel) yang telah mereka peroleh dengan mendapatkan gelar dalam disiplin ilmu pengetahuan.\n" +
                            "\n" +
                            "Data Scientist adalah orang yang bertugas mengolah data dari Data Engineer dan melihat apakah ada peluang bisnis baru dari data yang dikumpulkan.",
                    R.drawable.datascientist
                ),
                Job(
                    "DevOps Engineer",
                    "DevOps adalah serangkaian praktik yang mengotomatisasi proses antara pengembangan aplikasi dan tim pengembang, hal ini dilakukan agar mereka dapat melakukan proses build, test dan release software lebih cepat dan lebih handal.\n" +
                            "\n" +
                            "DevOps sangat penting di perusahaan IT. Mengapa? Pasalnya, salah satu praktik terbaik dalam DevOps yaitu melakukan update produk yang kecil dan cepat. Dalam industri IT, ini bisa disebut dengan minor atau patch update.",
                    R.drawable.devops
                ),
                Job(
                    "Game Developer",
                    "Game developer adalah seorang software developer dengan keahlian dibidang pembuatan video game. Pekerjaan spesifik dari game developer adalah pembuat video game. Para game developer menciptakan software untuk berbagai jenis permainan yang dapat diakses melalui berbagai device, mulai dari device permainan video game seperti Playstation atau Nintendo, smartphone (iOS ataupun Android), hingga device berbasis PC atau laptop.\n" +
                            "\n" +
                            "Sebagai game developer, kamu dituntut untuk mempelajari konsep-konsep penting dari pembuatan sebuah aplikasi game, serta memberikan detail kode juga program coding maupun programming. Selain menciptakan konsep game secara utuh, seorang game developer juga memasuki ranah pembuatan audio yang tepat, desain grafis, seni visual, dan produksi aplikasi.",
                    R.drawable.gamedev
                ),
                Job(
                    "iOS Developer",
                    "iOS developer merupakan pengembang khusus sistem operasi iOS yang bertanggung jawab untuk mengembangkan aplikasi dari produk perangkat seluler Apple. Dengan demikian, iOS developer diharuskan memiliki pemahaman yang kuat mengenai pola dan praktik seputar pemrograman dan sistem operasi iOS secara mendalam.\n" +
                            "\n" +
                            "iOS developer secara praktik dapat memungkinkan suatu pihak, baik individu maupun perusahaan untuk mempublikasikan aplikasi untuk perangkat dengan sistem operasi iOS ke Apps Store. Peran iOS developer secara umum adalah membuat, menguji, dan menyempurnakan aplikasi untuk perangkat seluler berbasis iOS. Perangkat ini meliputi berbagai produk Apple yaitu iPhone, iPad, Apple Watch, hingga Apple TV.\n",
                    R.drawable.iosdev
                ),
                Job(
                    "Cloud Engineer",
                    "Cloud Engineer adalah profesional TI yang membangun dan memelihara infrastruktur cloud. Insinyur cloud dapat memiliki peran yang lebih spesifik yang mencakup arsitektur cloud (mendesain solusi cloud untuk organisasi), pengembangan (pengkodean untuk cloud), dan administrasi (bekerja dengan jaringan cloud).\n" +
                            "\n" +
                            "Teknologi cloud telah menjadi di mana-mana dalam beberapa tahun terakhir. Bahkan, Anda mungkin sering menggunakan teknologi berbasis cloud dalam kehidupan sehari-hari. Menonton TV atau mendengarkan musik di layanan streaming favorit Anda, menggunakan platform email online, atau mencadangkan gambar ponsel Anda ke internet semuanya dimungkinkan karena teknologi cloud. Bagi perusahaan, ini berarti data dapat disimpan dan dicadangkan dengan lebih mudah, pembaruan perangkat lunak dapat diluncurkan sesuai permintaan, dan pelanggan dapat mengakses informasi mereka dari perangkat yang berbeda. Sebagai Cloud Engineer, Anda akan bekerja di belakang layar agar semuanya tetap berjalan.",
                    R.drawable.cloudengineer
                )
            )
        )

        return arrayList
    }
}