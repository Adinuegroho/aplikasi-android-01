package com.example.projekakhir

object SepatuData {
    private val nameSepatu = arrayOf(
        "CAMPUS 80S SOUTH PARK TOWELIE",
        "FORUM LOW HEBRU BRANTLEY",
        "HUMANRACE SICHONA",
        "SEPATU M&M'S BRAND FORUM LOW 84",
        "NIZZA SHOES",
        "NMD V3 SHOES",
        "SEPATU QUESTAR FLOW NXT",
        "RESPONSE SHOES",
        "STAN SMITH SHOES",
        "SUPERSTAR ABSTRAK SHOES",
        "SUPERSTAR BLACK SHOES",
        "SUPERSTAR WHITE SHOES",
        "SEPATU TRAIL RUNNING TERREX AGRAVIC FLOW 2.0",
        "ULTRA 4D",
        "ULTRABOOST 22",
        "X SPEEDFLOW.3 FIRM GROUND")

    private val detailSepatu = arrayOf(
        "TOWELIE DARI SOUTH PARK MENGALAMI REINKARNASI MENJADI SEPATU CAMPUS INI.\nJangan lupa membawa handuk. Sulit untuk dilakukan saat kamu memakai Towelie. Dalam bentuk sepatu adidas Campus ternama ini. Sudah tertera jelas di bagian lidah. Sambut cerahnya sinar matahari dan matanya akan berubah menjadi merah. Saku rekat berukuran kecil di bagian dalam lidah dapat memuat barang dengan ukuran yang sesuai. Namanya: gantungan kunci Towelie.",
        "SEPATU YANG MENJADI KARYA SENI YANG DAPAT DIPAKAI DENGAN VISI AFROFUTURIST DARI HEBRU BRANTLEY.\nKamu berada di tempat yang tidak seharusnya. Mematahkan semua kendala — sebuah ide yang diilhami pada sepatu adidas x Hebru Brantley ini sekaligus menunjukkan apresiasi pada individualitas dan ekspresi Black. Artis imajinatif ini menggunakan desain ikonis sebagai kanvas untuk fiksi fantasi, bersama Flyboy membantu menceritakan kisah dan memberdayakan kami menjadi versi terbaik dari diri kami sendiri. Pengaruh lukisan dinding dan grafiti terlihat jelas, menonjol dari outsole dan tersembunyi di bagian sockliner. Interpretasi khusus berupa gambar tangan Trefoil oleh Brantley melengkapinya.",
        "DESAIN BARU BERKARAKTER DARI ADIDAS X PHARRELL WILLIAMS.\nSegala sesuatu yang disentuh Pharrell adalah eksplorasi dan selebrasi kemanusiaan. Dalam kolaborasi terbarunya bersama adidas, Sepatu Humanrace Sichona menjadi kanvas untuk menunjukkan ekspresi diri. Sepatu ini memiliki upper adidas Primeknit tanpa jahitan ultrafleksibel dengan Futurenatural, yang memungkinkanmu bergerak bebas di segala arah dengan nyaman. Motif rajut unik menghiasi bagian jari, tumit, dan samping serta pelengkap berupa tulisan \"Humanrace\".",
        "SEPATU BASKET LEGENDARIS YANG DIPADUKAN DENGAN SEMANGAT BAHAGIA DARI BRAND M&AMP;M&#039;S&REG;.\nSetiap orang memiliki warna M&M'S Brand favorit — apa warna favoritmu? Tunjukkan dengan sepatu adidas Forum ini. Desain sepatu basket ikonis dihadirkan dengan kepribadian karakter M&M yang berbeda, setiap sepatu merepresentasikan sisi berbeda dari warna dan detail yang seru. Bahkan 3-Stripes-nya dihiasi aksen cokelat menarik dengan garis alur yang menyerupai tepi tas M&M'S. Lining dengan warna kacang dan karakter di bagian sockliner menghadirkan tampilan yang seru dan tak terduga.",
        "THESE ADIDAS SHOES REFLECT IT WITH COLOUR ACCENTS AND GRAPHIC PRINTS.\nNizza Shoes",
        "SEPATU ULTRANYAMAN YANG DIBUAT SEBAGIAN DARI MATERIAL HASIL DAUR ULANG.\nKehidupan bergerak cepat. Tapi ini bukan semacam \"berkedip dan kau ketinggalan\". Hidup ini ibaratnya \"bersiaplah dan nikmati setiap menit yang berarti\". Dibuat berdasarkan warisan kecepatan, sepatu running-inspired dari adidas ini memiliki desain untuk mengimbangi tempo lari sehari-hari. Bantalan BOOST yang empuk membuat kakimu terasa nyaman dan ditopang.",
        "SNEAKER YANG PAS UNTUK PEMAKAIAN SEHARI-HARI.\nDengan desain minimalis dan konstruksi yang mengutamakan kenyamanan, sepatu adidas ini hadir untuk rotasi pakaian sehari-harimu. Ringan dan breathable, berkat upper berbahan mesh rajut. Sol Cloudfoam terasa seperti berjalan di awan yang ringan sepanjang hari. Heel counter dengan proses cetak menghasilkan stabilitas.",
        "EXPERIENCE CUSHIONING AND RESPONSIVENESS WITH EVERY STRIDE.\nThese shoes are designed to give you that cushioning and responsiveness that you need when you're hitting the track or trail. Whether you're going on your daily walk or fitting in a quick run, the Bounce midsole is flexible and responsive in every step. Made with a series of recycled materials, this upper features at least 50% recycled content. This product represents just one of our solutions to help end plastic waste.",
        "LOVE. DIVERSITY. JOY. ALL THINGS WE CELEBRATE FULLY, AND THESE ADIDAS STAN SMITH SHOES HAPPEN TO DO IT EXTRA LOUDLY. GRAPHICS APPEAR SPRAWLED THROUGHOUT, MAKING A POWERFUL STATEMENT IN VIBRANT COLOURS.\nStan Smith Shoes",
        "MATCHING THAT ENERGY ARE THE BOLD NEON GRAPHICS ON THE COLOURFUL LEATHER UPPER. THE WORDS &QUOT;BE TOGETHER&QUOT; WRAP THEIR WAY AROUND THE SHOE FROM FRONT TO BACK AS A REMINDER OF THE POWER THAT COMES FROM COMMUNITY.\nSuperstar Shoes",
        "SEPATU ADIDAS SUPERSTAR DENGAN DETAIL BORDIR.\nMenjadi hal yang konstan dalam budaya selama lebih dari 50 tahun, Sepatu adidas Superstar adalah salah satu sneaker adidas paling ikonis yang pernah diciptakan. Desainnya tidak banyak berubah selama setengah abad terakhir. Tapi tempat yang telah mereka pijak — itu lain lagi. Sepatu ini bermula di lapangan basket, dan sejak saat itu telah dipakai di mana pun: panggung hip hop, peragaan busana, dan lain-lain. Semua detail klasiknya tidak berubah, dari shell toe berbahan karet hingga 3-Stripes bergerigi. Hanya sedikit perubahan warna, itu saja.",
        "CASUAL TRAINERS CELEBRATING 50 YEARS OF STREETWEAR HISTORY.\nThe adidas Superstar Shoes first stepped onto the basketball hardwood in 1970. It didn't take long for them to make the leap from athletic gear to streetwear staple. These shoes show off the materials, proportions and style that made the original such a legend. They've got a smooth leather upper with sporty 3-Stripes and a heel tab. They're finished off with the world-famous rubber shell toe.",
        "SEPATU TRAIL RUNNING RINGAN YANG SEBAGIAN DIBUAT DARI PARLEY OCEAN PLASTIC.\nMedan terjal memanggil. Pakai sepatu trail running adidas ini agar merasa nyaman dan percaya diri saat mendaki medan bebatuan menuju puncak. Upper engineered mesh menawarkan topangan, elastisitas, dan sirkulasi udara yang sejuk. Tampilan yang seru dan serbaguna cocok untuk jalur pegunungan dan jalanan kota. Midsole super-ringan membuatmu melangkah dengan nyaman, dalam jarak 5K atau berlari sepanjang hari.",
        "SEPATU RUNNING YANG DIRANCANG SECARA PRESISI, SEBAGIAN DARI MATERIAL HASIL DAUR ULANG.\nSepatu Ultraboost telah menjadi pelopor teknologi lari sejak dirilis pada tahun 2015. Versi ini memiliki upper adidas Primeknit yang membalut kaki dengan sensasi yang ringan dan breathable. Midsole cetak 3D memiliki struktur lattice dengan bagian yang lebih padat dan bagian terbuka sebagai bantalan dan topangan khusus. Sepatu ini tidak hanya terlihat seperti sepatu masa depan. Namun, sensasi dipakainya juga terasa demikian.",
        "SEPATU RUNNING RESPONSIF INI DIBUAT DENGAN MATERIAL ALAMI.\nAlam memberi kita begitu banyak hal, dari udara yang kita hirup hingga tanah yang kita pijak. Sepatu running adidas ini dibuat dari material alami dan dapat diperbarui serta diwarnai dengan proses pewarnaan yang lebih ramah lingkungan. Sepatu ini memiliki semua teknologi performa yang disukai pelari, dari adidas PRIMEKNIT yang adaptif hingga BOOST dengan pengembalian energi. Jadi, kamu akan merasa ditopang dan nyaman saat berusaha menaiki bukit untuk menyaksikan matahari terbit.",
        "CLICK INTO GEAR ON FIRM GROUND IN THESE LIGHTWEIGHT BOOTS.\nWhen razor-sharp instincts flow into lightning pace, the pitch becomes your playground. Find your football groove in adidas X. These boots keep things light and comfortable with a soft, minimalist Speedskin upper. Inside, a stretchy sock-like construction locks you in. Underneath, a firm ground outsole ensures you're always ahead of the game.",
        )

    private val imageSepatu = arrayOf(
        R.drawable.campus80s,
        R.drawable.forumlowhebru,
        R.drawable.humanrace,
        R.drawable.mnmblue,
        R.drawable.nizzashoes,
        R.drawable.nmdv3shoes,
        R.drawable.questarflow,
        R.drawable.responseshoes,
        R.drawable.stansmithshoes,
        R.drawable.superstarabstrackshoes,
        R.drawable.superstarblackshoes,
        R.drawable.superstarshoes,
        R.drawable.trailrunning,
        R.drawable.ultra4d,
        R.drawable.ultraboost22shoes,
        R.drawable.xspeedflowboot
    )

    private val priceSepatu = arrayOf(
        170,
        200,
        280,
        160,
        120,
        260,
        120,
        100,
        170,
        160,
        170,
        170,
        200,
        400,
        350,
        120
    )

    private val tipeSepatu = arrayOf(
        "Pria Lifestyle",
        "Pria Lifestyle",
        "Uniseks Lifestyle",
        "Pria Lifestyle",
        "Pria Lifestyle",
        "Pria Lifestyle",
        "Pria Skateboarding",
        "Wanita Running",
        "Pria Lifestyle",
        "Pria Lifestyle",
        "Pria Lifestyle",
        "Wanita Lifestyle",
        "Pria Outdoor",
        "Pria Skateboarding",
        "Pria Running",
        "Uniseks Sepak Bola")

    val listData: ArrayList<Sepatu>
        get() {
            val list = arrayListOf<Sepatu>()
            for (position in nameSepatu.indices){
                val sepatu = Sepatu()
                sepatu.name = nameSepatu[position]
                sepatu.detail = detailSepatu[position]
                sepatu.photo = imageSepatu[position]
                sepatu.price = priceSepatu[position]
                sepatu.tipe = tipeSepatu[position]
                list.add(sepatu)
            }
            return list
        }

}