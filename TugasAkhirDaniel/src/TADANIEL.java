/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TADANIEL extends javax.swing.JFrame {

    String map, karakter, weapon, mode;
    String DEATHMATCH, BOMBMISSION, ELIMINATE, CROSSCOUNTER, ALLYMODE, DESTROY, MADNESS, ACEMODE, SHOTGUN, SNIPER, KNUCKLE, DEFENSEMISSION, HEADHUNTER, SPACE, CONVOY, FREEFORALL;
    String ACIDPOL, KEENEYES, LEOPARD, HIDE, CHOU, WOLF, REDBULLS, TARANTULA, DFOX, VIPERRED, RICA, CAYMANGREY;
    String BURNINGHALL, TWOTOWERS, MSTATION, CRACKDOWN, PORTACABA, REDROCK,LIBRARY, MINIINDONESIA, LUXVILLE, BLOWCITY, SAFEHOUSE, STROMTUBE, DOWNTOWN, MIDTOWN, OUTPOST, HOSPITAL, CEMETERY, GUSTAV, AIRPORT, BREAKDOWN, HELISPOT, BLACKPANTHER, DINONEST;
    static String AUG(){
        return "Memiliki damage, akurasi, dan fire speed yang cukup bagus, Aug A3 punya mode laser yang sangat membantu untuk menarget lawan."
                + " Headshot pun jadi mudah karena kamu bisa menarget kepala lawan dengan bantuan laser. Fire speed dari senjata ini juga sangat mengerikan, kekurangannya adalah pada recoil."
                + "Damage:26 F.Speed:92 Accuracy:48 M.Speed:84 V.recoil:57 H.recoil:48 range 106";
    }
    static String AK47(){
        return "AK-47 memiliki damage dan fire range yang mematikan,AK-47 memiliki extension yaitu ammo cadangan tanpa harus reload,akan sangat membantu saat melakukan tembakan."
                + "Kill pada lawan akan sangat mudah bagi pengguna AK-47 jika memiliki kontrol yang baik, kelemahan dari Ak-47 sendiri adalah recoil yang sangat berantakan."
                + "Damage:33 F.Speed:90 Accuracy:46 M.speed:74 V.recoil:69 H.recoil:62 range:140";
    }
    static String F2000(){
        return "F2000 merupakan assault rifle yang memiliki damage dan fire speed yyang tinggi, kekurangannya adalah recoil yang kurang bersahabat bagi penggunanya"
                + "Damage:26 F.speed:93 Accuracy:48 M.speed:78 V.recoil:57 H.recoil:57 range:120";
    }
    static String M4A1(){
        return "M4A1 walau dari segi penampilan kurang menarik, tapi dari segi kekuatan serta akurasi senjata ini bisa disandingkan dengan AUG-A3 . namun sayang karena penampilan senjata ini pun dilupakan.Damage:26 F.Speed:92";
    }
    static String SC2010(){
        return "Senjata SC-2010 ini sangat unggul di segala bidang dari segi damage,akurasi,fire speed, dengan recoil dan akuurasi yang bagus, senjata ini dapat jadi senjata mematikan bagi penggunanya. Damage:30 F.speed:92";           
    }
    static String PINDAD(){
        return "PINDAD SSV2 merupakan senjata yang dibuat di Indonesia, senjata ini menjadi senjata langganan para player Point Blank karena akurasi fire speed dan damage yang sangat besar, pindad sendiri sangat berguna di pertarungan jarak dekat maupun jarak jauh"
                + "Damage:27 F.speed:92";
    }
    static String TAR(){
        return "senjata Tar-21 sekilas penampilannya seperti AUG-A3, namun ada beberapa hal yang membedakan yaitu Cross light . bila di AUG-A3 menggunakan Cross light sedangkan TAR-21 tidak menggunakan. namun dari segi kualitas hampir sama dengan AUG-A3"
                + "Damage:27 F.speed:93";
    }
    static String PARASNIPER(){
        return "Parasniper merupakan assault rifle yang sangat nyaman dipakai untuk jarak jauh, karena range yang jauh dan damage serta recoil yang mensupport senjata ini untuk menembak jarak jauh"
                + "Damage:26 F.speed:92";
    }
    static String SOPMOD(){
        return "Ak-Sopmod adalah senjata jenis assault yang biasanya banyak digunakan oleh major+ mungkin senjata ini telah unggul di beberapa aspek terutama damage dan recoil namun dengan tambahan Title yang cocok membuat senjata ini jadi semakin bagus."
                + "Damage:33 F.speed:91";
    }
    static String K2(){
        return "K2 merupakan senjata gratis yang diberikan oleh game saat baru membuat akun game, senjata ini memiliki damage yang besar namun recoil yangg kurang bagus dan ammo yang sangat sedikit"
                + "Damage:28 F.speed:88";
    }
    static String P90(){
        return "senjata ini adalah senjata andalan bagi mereka yang suka HeadShot karena senjata ini memiliki fire Speed yang besar dan tingkat akurasi tinggi. Namun senjata ini memiliki recoil dan damage yang tidak terlalu besar jadi jika anda menembak jarak jauh tidak terlalu besar dampaknya terhadap musuh."
                + "Damage:24 F.speed:93";
    }
    static String P90MC(){
        return "Senjata ini merupakan adik dari senjata P90 karena P90MC merupakan bentuk penyesuaian senjata P90 dengan tambahan silencer agar lebih stabil saat menembak"
                + "Damage:21 F.speed:93";
    }
    static String KRISS(){
        return"nah senjata ini menjadi kebutuhan para user Pemilik skill dual, yaitu jika no dual no kill senjata ini dibuat agar bisa di duplicate atau dual. keunggulannya memiliki fire speed dan akurasi tinggi namun jika menggunakan dual kriss maka tingkat damage dan akurasinya menjadi berkurang."
                + "Damage:21 F.speed:93";
    }
    static String OA(){
        return"Spesifikasi OA-93 dengan KRISS S.V tidak terlalu berbeda, yang membedakannya adalah yaitu pada saat menggunakan Dual, Akurasi serta damagenya tidak berkurang oleh karena itu OA banyak digemari oleh pengguna pengguna Dual."
                + "Damage:21 F.speed:93";
    }
    static String MP7(){
        return"senjata ini memiliki fire speed,akurasi,dan recoil yang nyaris sempurna dan cocok untuk mengincar bagian kepala lawan. namun senjata ini memiliki jumlah peluru yang sedikit."
                + "Damage:21 F.speed:91";
    }
    static String SPECTRE(){
        return"ini adalah senjata alternatif untuk kamu yang tidak memiliki senjata lain atau kamu mau menyimpan senjata yang bagus untuk masa depan. senjata ini bisa didapatkan bila kita mengambil title sub machine paling awal."
                + "Damage:22 F.speed:92";
    }
    static String MP5K(){
        return "senjata ini masih satu keluarga dengan MP7 namun fiturnya sedikit berbeda dengan MP7 dan cara mendapatkan senjata ini dengan mengambil title sub machine paling awal dan akan mendapatkan MP5K beserta SPECTRE."
                + "Damage:21 f.speed:93";
    }
    static String K1(){
        return "ini dia Legendanya SUB MACHINE GUN, senjata kecil dengan suara agak serak namun ini menjadi senjata awal yang di gunakan user di point blank. walaupun begitu jika anda memiliki skill diatas rata-rata mungkin anda bisa melawan banyak musuh menggunakan K-1 ini."
                + "damage:22 f.speed:92";
    }
    static String BARRETT(){
        return "Jenis senjata AWP yang paling banyak digunakan dan memiliki kualitas sangat baik mungkin cocok jika Barret M84A1 menjadi Awp Terlegends . Dimana damage AWP ini sampai 100 dan akurasi yang sangat besar tidak heran butuh kerja keras untuk mendapatkan AWP ini karena pihak garena memasukan Barret M84A1 kedalam Gacha yang mungkin sangat sulit untuk didapatkan."
                + "Damage:100 F.speed:27";
    }
    static String RANGEMASTER(){
        return "senjata ini memiliki kualitas hampir seperti Barret M84A1,namun tingkat damage dan juga akurasi masih dibawah. dan senjata ini memiliki suara yang sangat keras."
                + "Damage:90 F.speed:0";
    }
    static String TACTILITE(){
        return "Senjata ini merupakan senjata yang paling banyak digunakan padahal senjata ini belum lama ada di Point Blank namun senjata ini memiliki daya tarik tersendiri. Karena tingkat akurasi dan recoil yang memumpuni membuat senjata ini sangat cocok digunakan untuk bermain AWP mode QuickSqoop. Jadi anda tidak perlu membidik\n" +
"musuh karena senjata ini dikenal dengan tingkat akurasi yang tinggi.Damage:97";
    }
    static String CHEYTAC(){
        return "Cheytac M200 merupakan sniper andalan para user AWP setelah tactilite, karena damage yang tinggi serta senjata yang lebih ringan membuat playerr lebih mudah melakukan QS(Quick Scope).Damage:88";
    }
    static String MX(){
        return "MX2010 merupakan sniper yang ringan dan mudah untuk melakukan QS, dengan tambahan silencer pada ujung senjata membuat lawan tidak tahu ditembak dari arah mana, dan menjadikan MX ini lebih stabil. Damage:88";
    }
    static String MAGNUM(){
        return "L115A1 atau yang biasa disebut magnum adalah sniper yang memiliki suara mengerikan, memberikan rasa takut bagi lawan.Sniper ini juga termasuk sniper yang ringan dan memiliki akurasi yang tinggi.Damage:75";
    }
    static String DRAGUNOV(){
        return "Dragunov merupakan sniper semi automatic yang banyak dipakai player pemula.Damage:75 F.Speed:30";
    }
    static String PSG(){
        return "PSG1 memiliki spesifikasi yang mirip dengan Dragunov namun dengan damage yang lebih mematikan. Damage:85 F.speed:30";
    }
    static String SSG(){
        return "Sniper ini biasa dikenal dengan sebutan sniper kayu, sniper yang disediakan oleh game saat baru buat akun, sniper ini kurang digemari pemain karena damage dan akurasi yang kecil.Damage:69";
    }
    static String WALTHER(){
        return "Sniper semi automatic yang memiliki damage lebih dibanding semi automatic lainnya ini bisa menjadi senjata andalan bagi player sniper.Damage:88 F.speed:27";
    }
    
    public void setkarakter(String karakter){
        this.karakter = karakter;
    }
    public String getkarakter(){
        return karakter;
    }
        
    public TADANIEL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulbox = new javax.swing.JTextField();
        mapbox = new javax.swing.JComboBox<>();
        modebox = new javax.swing.JComboBox<>();
        weaponbox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descbox = new javax.swing.JTextArea();
        resetb = new javax.swing.JButton();
        exitb = new javax.swing.JButton();
        charbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulbox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judulbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        judulbox.setText("POINT BLANK ENCYCLOPEDIA");

        mapbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAP", "BURNINGHALL", "TWOTOWERS", "MSTATION", "CRACKDOWN", "PORTACABA", "REDROCK", "LIBRARY", "MINIINDONESIA", "LUXVILLE", "BLOWCITY", "SAFEHOUSE", "STROMTUBE", "DOWNTOWN", "MIDTOWN", "OUTPOST", "HOSPITAL", "CEMETERY", "GUSTAV", "AIRPORT", "BREAKDOWN", "HELISPOT", "BLACKPANTHER", "DINONEST" }));
        mapbox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                mapboxComponentAdded(evt);
            }
        });
        mapbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapboxActionPerformed(evt);
            }
        });

        modebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GAME MODE", "DEATHMATCH", "BOMBMISSION", "ELIMINATE", "CROSSCOUNTER", "ALLYMODE", "DESTROY", "MADNESS", "ACEMODE", "SHOTGUN", "SNIPER", "KNUCKLE", "DEFENSEMISSION", "HEADHUNTER", "SPACE", "CONVOY", "FREEFORALL" }));
        modebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeboxActionPerformed(evt);
            }
        });

        weaponbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WEAPON", "AUG-A3", "AK-47", "F2000", "M4A1", "SC-2010", "PINDAD SSV2", "TAR-21", "SS2-V4 PARASNIPER", "AK SOPMOD", "K-2", "P90", "P90 M.C", "KRISS S.V", "OA-93", "MP7", "SPECTRE", "MP5K", "K-1", "BARRET M84A1", "RANGEMASTER 338", "TACTILITE-T2", "CHEYTAC M2000", "L115A1", "DRAGUNOV", "PSG1", "SSG-69", "WALTHER2000", "MX-2010" }));
        weaponbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weaponboxActionPerformed(evt);
            }
        });

        descbox.setColumns(20);
        descbox.setRows(5);
        descbox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(descbox);
        descbox.getAccessibleContext().setAccessibleParent(descbox);

        resetb.setText("RESET");
        resetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbActionPerformed(evt);
            }
        });

        exitb.setText("EXIT");
        exitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbActionPerformed(evt);
            }
        });

        charbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHARACTER", "ACID POL", "KEEN EYES", "LEOPARD", "HIDE", "CHOU", "WOLF", "RED BULLS", "TARANTULA", "D-FOX", "VIPER RED", "RICA", "CAYMAN GREY" }));
        charbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulbox)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(mapbox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modebox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(weaponbox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(charbox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mapbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weaponbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mapboxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_mapboxComponentAdded
        
    }//GEN-LAST:event_mapboxComponentAdded

    private void resetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbActionPerformed
        mapbox.setSelectedIndex(0);
        modebox.setSelectedIndex(0);
        charbox.setSelectedIndex(0);
        weaponbox.setSelectedIndex(0);
        descbox.setText("");
    }//GEN-LAST:event_resetbActionPerformed

    private void modeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeboxActionPerformed
        mode = (String) modebox.getSelectedItem();
        switch (mode){
            case "DEATHMATCH":
                descbox.setText("Bunuh pemain musuh hingga skor tim-mu mencapai nilai yang ditentukan atau berusahalah menjadi tim dengan skor terbanyak saat waktu permainan habis.");
                break;
            case "BOMBMISSION":
                descbox.setText("Tujuan tim Free Rebels adalah untuk meledakkan area yang disebut bombsite dengan C4, sementara tujuan tim CT-Force adalah mencegah tim Free Rebels meledakkan bombsite.");
                break;
            case "ACEMODE":
                descbox.setText("Bertarung 1 vs 1 dengan pemain lain sampai beberapa ronde dengan senjata apapun");
                break;
            case "CONVOY":
                descbox.setText("Free Rebels harus merebut objek dan CT-Force harus mempertahankan objek tersebut dari Free Rebels.");
                break;
            case "CROSSCOUNTER":
                descbox.setText("Melawan Dinosaurus sampai waktu habis.");
                break;
            case "DEFENSEMISSION":
                descbox.setText("Pertahankan objek yang menjadi sasaran atau menghancurkanya");
                break;
            case "DESTROY":
                descbox.setText("Hancurkan objek yang menjadi target dalam mode ini.");
                break;
            case "ELIMINATE":
                descbox.setText("Habisi semua musuh yang ada untuk memenangkan ronde.");
                break;
            case "FREEFORALL":
                descbox.setText("Habisi semua pemain dan raih skor tertinggi. Tidak ada tim/teman didalam mode ini, semua saling bertarung.");
                break;
            case "HEADHUNTER":
                descbox.setText("Habisi semua musuh dengan tembakan kepala saja.");
                break;
            case "KNUCKLE":
                descbox.setText("Habisi semua musuh dengan kepalan tangan/bare fist saja");
                break;
            case "MADNESS":
                descbox.setText("Habisi semua zombie dan bertahan hingga waktu habis.");
                break;
            case "SHOTGUN":
                descbox.setText("Habisi semua musuh hanya dengan shotgun saja");
                break;
            case "SNIPER":
                descbox.setText("Habisi semua musuh hanya dengan sniper rifle saja");
                break;
            case "SPACE":
                descbox.setText("Habisi musuhmu dan dapatkan Barrett M82A1 atau RPG-7 dalam setiap box didalam map. Gunakan jump untuk melompat tinggi.");
                break;
        }
    }//GEN-LAST:event_modeboxActionPerformed

    private void weaponboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weaponboxActionPerformed
        weapon = (String) weaponbox.getSelectedItem();
        switch (weapon){
            case "AUG-A3":
                descbox.setText(AUG());
                break;
            case "AK-47":
                descbox.setText(AK47());
                break;
            case "F2000":
                descbox.setText(F2000());
                break;
            case "M4A1":
                descbox.setText(M4A1());
                break;
            case "SC-2010":
                descbox.setText(SC2010());
                break;
            case "PINDAD SSV2":
                descbox.setText(PINDAD());
                break;
            case "TAR-21":
                descbox.setText(TAR());
                break;
            case "SS2-V4 PARASNIPER":
                descbox.setText(PARASNIPER());
                break;    
            case "AK SOPMOD":
                descbox.setText(SOPMOD());
                break;
            case "K-2":
                descbox.setText(K2());
                break;
            case "P90":
                descbox.setText(P90());
                break;
            case "P90 M.C":
                descbox.setText(P90MC());
                break;  
            case "KRISS S.V":
                descbox.setText(KRISS());
                break;
            case "OA-93":
                descbox.setText(OA());
                break; 
            case "MP7":
                descbox.setText(MP7());
                break;
            case "SPECTRE":
                descbox.setText(SPECTRE());
                break;    
            case "MP5K":
                descbox.setText(MP5K());
                break;    
            case "BARRET M84A1":
                descbox.setText(BARRETT());
                break;
            case "RANGEMASTER 338":
                descbox.setText(RANGEMASTER());
                break;
            case "TACTILITE T2":
                descbox.setText(TACTILITE());
                break;
            case "CHEYTAC M2000":
                descbox.setText(CHEYTAC());
                break;    
            case "MX-2010":
                descbox.setText(MX());
                break; 
            case "L115A1":
                descbox.setText(MAGNUM());
                break;
            case "DRAGUNOV":
                descbox.setText(DRAGUNOV());
                break;
            case "PSG1":
                descbox.setText(PSG());
                break;    
            case "SSG-69":
                descbox.setText(SSG());
                break;
            case "WALTHER2000":
                descbox.setText(WALTHER());
                break;    
        }
    }//GEN-LAST:event_weaponboxActionPerformed

    private void charboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charboxActionPerformed
        karakter = (String) charbox.getSelectedItem();
        if (karakter==ACIDPOL)
        {
            descbox.setText("Paul lulus sebagai polisi terbaik dari University of Elite Police. Paul memiliki sikap yang dingin. Namun, dikarenakan mempunyai gaya lucu saat berbicara Paul diberi julukan oleh teman-temannya yaitu \"Acid Pool\" . Acid Pool (Paul) mendaftarkan diri untuk bergabung menjadi polisi setelah kelulusannya. Acid Pool (Paul) kemudian diberi tugas untuk masuk ke CT-FORCE, karena Acid Pool (Paul) memiliki kemampuan tinggi dan sering memiliki taktik yang bagus. Untuk membuktikan kesetiaannya dan kepercayaanya kepada pemerintah, dia bersedia dan siap untuk melawan Free Rebels yang sekarang lebih merajalela.");
        }
        else if (karakter==KEENEYES)
        {
            descbox.setText("Keen Eyes (Ayse) merupakan generasi dari keturunan campuran antara penduduk asli dan penduduk pendatang. Keen Eyes (Ayse) memiliki kemampuan yang sangat tinggi dan dia adalah salah satu pimpinan dari kesatuan polisi. Karena alasan-alasan tersebut CT-FORCE tertarik dan berminat untuk merekrut Keen Eyes (Ayse) untuk bergabung.\n" +
"Oleh karena merupakan keturunan campuran dan mempunyai sorotan mata yang sangat tajam maka oleh teman-temannya di CT-FORCE memberi julukan kepadanya dengan julukan \"Keen Eyes\". Keen Eyes (Ayse) adalah satu-satunya keturunan campuran di kepolisian dan CT-FORCE. Karakter Point Blank ini mirip dengan Acid Pool (Paul) tetapi terdapat beberapa perbedaan.");
        }
        else if (karakter==LEOPARD)
        {
            descbox.setText("Pada usia 17 tahun dia melakukan imigrasi ke Amerika Serikat bersama dengan seluruh keluarganya. Karena merupakan keturunan Asia dia selalu diganggu oleh teman sekolahnya. Setelah lulus dari universitas pada 22 tahun dia langsung mendaftar untuk menjadi anggota Angkatan Darat Amerika Serikat. Pada usia 24 tahun dia sudah menjadi anggota dari pasukan khusus Green Berets. Dia kemudian mendapatkan pangkat sersan pada usia 33 tahun. Setelah itu, dia kembali ke tempat kelahirannya untuk menikmati hidup. Tidak lama kemudian terdengar kabar bahwa pemerintah pusat ingin merekrut semua prajurit yang handal untuk membentuk tim untuk melawan para teroris yang semakin merajalela. Tim tersebut dinamakan CT-Force. Green Berets mendapatkan perintah untuk mencari seseorang yang mempunyai kemampuan yang tinggi untuk bergabung dengan CT-Force melawan teroris. Pada saat bergabung dengan CT-Force dia mendapatkan panggilan \"Leopard\".");
        }
        else if (karakter==HIDE)
        {
            descbox.setText("Hide lahir di Inggris, kedua orangtuanya merupakan mantan prajurit di Tokyo. Pada usia 19 tahun dia mendaftarkan diri untuk menjadi prajurit pada Angkatan Darat Inggris. Menginjak usia 22 tahun dia menjadi prajurit yang paling terkenal di Angkatan Darat Inggris karena memiliki kemampuan yang tinggi, terutama dalam pendukung taktis. Di usia 26 tahun dia mendapatkan pertempuran yang keras, sehingga menimbulkan luka pada wajahnya. Karena kemampuan dan pengalamannya, CT-Force tertarik untuk merekrut dirinya. Karena berasal dari negara asing dia diberikan nama panggilan \"Hide\". Akan tetapi karena sifatnya yang penyendiri dia kurang dapat bergaul dengan sesamanya dalam CT-Force Dengan potongan rambut yang pendek dan hitam serta bekas luka pada wajahnya, membuat dia terlihat sangat dingin.");
        }
        else if (karakter==CHOU)
        {
            descbox.setText("Judy Chou merupakan pimpinan proyek dinosaurus dan mempunyai tugas dalam tim CT-Force yaitu untuk mengembalikan masa zaman dinosaurus yang telah punah dan memperbaiki kesalahan dan keburukan yang dimiliki oleh dinosaurus tersebut. Tetapi di suatu hari ternyata proyek ini menyebabkan bencana karena ada perlawanan yang dilakukan oleh dinosaurus yang telah diciptakan oleh Judy Chou.\n" +
"Judy Chou pun merasa bertanggung jawab akan hal ini. Sebenarnya gadis ini sangat senang mempelajari dinosaurus, tapi karena dampaknya yang merugikan tim CT-Force dengan terpaksa dia harus mengambil keputusan untuk ikut andil dalam misi memusnahkan dinosaurus.");
        }
        else if (karakter==WOLF)
        {
            descbox.setText("Wolf adalah petugas militer pemula dari Badan Intelijen Britania Raya. Dengan kegigihannya dalam dunia militer, ia berhasil menunjukan kemampuannya yang luar biasa dalam menahan, mengintai dan membereskan lawan dengan sangat efektif.\n" +
"Oleh karena itu CT-Force merekrut Wolf untuk bergabung menjadi bagian dari mereka dan ditugaskan untuk melawan Free Rebels yang terus bertambah dinegara ini");
        }
        else if (karakter==REDBULLS)
        {
            descbox.setText("Karena hanya seorang imigran dia tinggal di desa kecil bersama orang tuanya.dan imigran lainnya. Dia juga merupakan pemain bola yang hebat. Sesaat setelah menerima gelar MVP pada kejuaraan sepak bola, dia mendengar kabar bahwa kedua orangtuanya terbunuh pada saat mempertahankan desa mereka dari pemerintah yang ingin menghancurkan desa tersebut. Dia segera pulang ke desanya, akan tetapi dia hanya menemukan desanya yang telah hancur lebur. Hatinya penuh dengan amarah dan kebencian kepada pemerintah. Kemudian dia bergabung dengan Free Rebels untuk membalaskan kematian orang tuanya. Memiliki fisik seorang pemain bola dan mempunyai mata yang tajam seperti banteng membuat teman-temannya di Free Rebels memanggilnya \"Red Bulls\"");
        }
        else if (karakter==TARANTULA)
        {
            descbox.setText("Dia terlahir di keluarga imigran. Kehilangan kedua orang tuanya pada waktu kecil karena kecelakaan, kemudian diadopsi oleh keluarga lain. Hari demi hari dilalui di keluarga barunya. Akan tetapi sifat rasis dari ayah angkatnya semakin lama semakin besar dan memperlakukan dirinya secara kasar. Suatu hari dia menemukan revolver di lemari, kemudian dia mengambil pistol itu dan menembakkannya ke dada ayah angkatnya. Akibat insiden ini dia dimasukkan ke dalam penjara. Dalam penjara dia sering dipanggil dengan sebutan \"Tarantula\". Setelah beberapa tahun dia bebas dari penjara.Kemudian dia mendengar kabar bahwa para imigran selalu mendapatkan diskriminasi, hal ini membuatnya sangat marah. Kemudian dia memutuskan untuk bergabung dengan Free Rebels");
        }
        else if (karakter==DFOX)
        {
            descbox.setText("Kedua orang tuanya berasal dari Timur Tengah dan Asia. Meskipun campuran dia memiliki fisik yang baik. Pada usia 20 tahun dia telah menjadi letnan dan telah melakukan banyak misi khusus. Pada usia 25 tahun dia telah menjadi pimpinan tim. Dia terkenal karena tidak pernah meninggalkan jejak di setiap pertempuran. Di usia 26 tahun dia telah menjadi seorang Army Rangers. Tidak lama setelah itu dia mendapatkan suatu tugas rahasia dari pemerintah. Akan tetapi karena ada kesalahan informasi dari pemerintah, seluruh anggota timnya terbunuh. Pemerintah melimpahkan semua kesalahan kepada dirinya atas kejadian itu. Tidak terima perlakuan pemerintah, dia kemudian memberontak dan bergabung dengan Free Rebels. Untuk mengenang dan menghormati teman-temannya yang telah terbunuh di medan perang dia kemudian menamai dirinya Desert Fox, yang kemudian disingkat menjadi \"D-Fox\". Pada suatu misi dia tidak sempat untuk melarikan diri sebelum bomb yang dipasang meledak, sehingga tanganya terluka. Oleh karena itu dia selalu menggunakan sarung tangan.");
        }
        else if (karakter==VIPERRED)
        {
            descbox.setText("Dia mengikuti jejak ayah angkatnya yang berasal dari Prancis untuk menjadi seorang bodyguard. Kemampuan bertarung dan daya tahan tubuhnya telah ditempa dengan baik dari waktu kecil. Dia diadopsi oleh seseorang dari negara lain 25 tahun yang lalu, karena ibunya akan menjalankan suatu misi rahasia. Sekarang dia berusaha untuk mencari dan menemui ibunya kembali. Dia kemudian mendapatkan kabar bahwa ibunya adalah seorang Free Rebels dan telah terbunuh oleh pemerintah pada saat pertempuran demi melindungi imigran dari Amerika Latin. Mendengar itu dia kemudian memutuskan untuk bergabung dengan Free Rebels untuk membantu para imigran yang tertindas dan membalaskan dendam ibunya. Tidak seperti wanita yang lainnya. Dia mempunya kecepatan yang tinggi dan kekuatan yang besar. Dia juga ahli dalam menyusun taktik dan selalu bergerak licin seperti ular pada saat di medan pertempuran. Dia tidak menyukai sinar matahari dan selalu menggunakan kacamata hitam");
        }
        else if (karakter==RICA)
        {
            descbox.setText("Seorang gadis baik yang dahulu menjadi tentara dalam tim CT-Force, tetapi dia mendapat tuduhan dan oleh karena tuduhan itu dia memutuskan untuk keluar dari tentara CT-Force. Dengan rasa bencinya Lopez Rica memberontak bersama dengan Free Rebels, dalam tim Free Rebels dia ditempatkan di bagian infiltrasi laboratorium NDR.\n" +
"Reporter adalah pekerjaan samaran yang dilakukannya, Lopez Rica merupakan wartawan politik suatu koran lokal, dia sangat ahli dalam hal menganalisis dan mencari informasi.");
        }
        else if (karakter==CAYMANGREY)
        {
            descbox.setText("Kedatangannya yang misterius serta penampilannya yang gagah dengan mata yang tajam, Cayman Gray direkrut oleh tim Free Rebels. Tidak ada yang mengetahui nama asli, usia dan kebangsaan dari pria muda ini. Tetapi mereka hanya menyebut kode name yang ia pakai, yaitu \"Cayman Gray\".\n" +
"Menurut rumor yang beredar, orang ini adalah kakak laki-laki dari Viper Red yang juga merupakan bagian dari Free Rebels sejak lama.");
        }
        else
        {
            descbox.setText("");
        }
        
    }//GEN-LAST:event_charboxActionPerformed

    private void exitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitbActionPerformed

    private void mapboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapboxActionPerformed
        map = (String) mapbox.getSelectedItem();
        switch (map){
            case "BURNINGHALL":
                descbox.setText("Map ini bertemakan hall besar yang diserang ole free rebels, dan ct force harus menyelamatkan tempat itu dari free rebels");
                break;
            case "TWOTOWERS":
                descbox.setText("Map yang bertemakan peperangan diatas 2 gedung pencakar langit ini menjadi kegemaran player untuk Sniper mode");
                break;
            case "MSTATION":
                descbox.setText("Mstation bertemakan stasiun kereta yang dikuasai ole Free Rebels, CT force diberi misi untuk merebut Mstation dari Free rebels");
                break;
            case "CRACKDOWN":
                descbox.setText("Map ditengah gurun ini menjadi map favorit bagi player untuk memainkan mode 4v4 dikarenakan bentuk map yang kecil dan simetris");
                break;    
            case "PORTACABA":
                descbox.setText("Map yang berbentuk seperti tempat penyimpanan container ini menjadi sala satu map favorit bagi player sniper di game ini");
                break;    
            case "REDROCK":
                descbox.setText("Red Rock adalah map yang berlokasi di tempat bangunan yang rusak, bangunan ini adalah persembunyian free rebels, CT force diberii tugas untuk menghabisi free rebels");
                break;    
            case "LIBRARY":
                descbox.setText("Map yang bertemakan perpustakaan yang diabaikan ini menjadi pilihan bagi player untuk bermain death match");
                break;    
            case "MINIINDONESIA":
                descbox.setText("Map desert camp yang berbentuk kepulauan yang ada di Indonesia ini menjadi map yang dipili player untuk senjata jarak jau seperti sniper dan assault");
                break;    
            case "LUXVILLE":
                descbox.setText("Map luxville merupakan map bomb mission favorit player point blank, map ini sangat compact dan tidak sulit untuk dihapal");
                break;    
            case "BLOWCITY":
                descbox.setText("Map yang bertemakan kota kecil yang diserang Free Rebels ini menjadi map yang sering digunakan player untuk map pada clan war atau turnamen besar");
                break;
            case "SAFEHOUSE":
                descbox.setText("Map yang satu ini bertemakan tempat persembunyian, map yang cukup rumit bagi pemain yang belum pernah mencoba map ini, struktur map yang rumit memberikan banyak tempat untuk bersembunyi bagi player");
                break;    
            case "STROMTUBE":
                descbox.setText("Map yang bertemakan stasiun ini menjadi salah satu map yang dipilih bagi pengguna senjata jarak jauh seperti assault dan sniper,karena struktur map yang panjang dan terbuka.");
                break;    
            case "DOWNTOWN":
                descbox.setText("Map favorit player setelah luxville untuk bomb mission, map yang besar dan tidak rumit menjadikan map ini pilihan player yang dapat bertarung di lahan terbuka");
                break;    
            case "MIDTOWN":
                descbox.setText("Map yang bertemakan kota menengah ini memiliki struktur yang kecil dan padat, memberikan banyak kesempatan bagi player untuk menbuat serangan kejutan.");
                break;    
            case "OUTPOST":
                descbox.setText("Map bertemakan kasino yang lengkap dengan helikopter dan RPG-7 yang tersedia pada map bisa menjadi alternatif map bomb mission bagi player.");
                break;    
            case "HOSPITAL":
                descbox.setText("Map yang bertemakan rumah sakit yang dikuasai oleh Free rebels ini menjadi map yang cocok bagi pengguna sniper karena struktur map yang lebar dan memiliki tingkatan, memudakan sniper untuk menembak dari jauh.");
                break;    
            case "CEMETERY":
                descbox.setText("Map bertemakan pemakaman yang satu ini masih belum menjadi map populer bagi player, karena map yang tergolong baru ini memiliki tingkat kerumitan yang tinggi dan memiliki banyak spot spot tersembunyi.");
                break;    
            case "GUSTAV":
                descbox.setText("Map ini bertemakan gudang senjata organisasi NAZI, map ini berstruktur besar dan rumit, dan masih baru. map ini belum menjadi pilihan utama bagi pemain pemain pointblank.");
                break;
            case "AIRPORT":
                descbox.setText("Map bandara ini sangat jarang digunakan karena sangat besar dan tidak familiar bagi pemain, map ini terkesan rumit karena jalannya yang berputar putar.");
                break;    
            case "BREAKDOWN":
                descbox.setText("Map untuk mode destroy ini berisi satu generator dan helikopter untuk dihancurkan oleh kedua sisi, map yang berbentuk kota kecil ini menjadi alternatif bagi helispot.");
                break;    
            case "HELISPOT":
                descbox.setText("Map ini menjadi map favorit bagi mereka yang suka mendapat exp yang besar, karena pada map ini sangat mudah untuk mendapat exp, hanya dengan menembak helikopter dengan senjata atau RPG7 yang disediakan di map.");
                break;    
            case "BLACKPANTHER":
                descbox.setText("Map untuk defense mode ini bertemakan CT force yang melindungi fasilitas rahasia yang berusaha untuk dihancurkan oleh Free Rebels.");
                break; 
            case "DINONEST":
                descbox.setText("Map untuk Ally Mode ini bertemakan lab untuk pengembangan dinosaurus, pada map ini manusia melawan dinosaurus, manusia harus melewati gerbang yang dijaga oleh dinosaurus dinosaurus tersebut.");    
                break;
        }
    }//GEN-LAST:event_mapboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TADANIEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TADANIEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TADANIEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TADANIEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TADANIEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> charbox;
    private javax.swing.JTextArea descbox;
    private javax.swing.JButton exitb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulbox;
    private javax.swing.JComboBox<String> mapbox;
    private javax.swing.JComboBox<String> modebox;
    private javax.swing.JButton resetb;
    private javax.swing.JComboBox<String> weaponbox;
    // End of variables declaration//GEN-END:variables
}
