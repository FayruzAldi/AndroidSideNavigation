package com.example.androiddrawersamping.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasandroidnavigationdrawer.AdapterList;
import com.example.tugasandroidnavigationdrawer.R;
import com.example.tugasandroidnavigationdrawer.items;

import java.util.ArrayList;
import java.util.List;

public class MakananFavorit extends Fragment {

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_favorit, container, false);

        recyclerView = view.findViewById(R.id.RVmakananFavorit);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        itemsList = new ArrayList<>();
        itemsList.add(new items("Sate Ayam", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/14053934/Mudah-Dibuat-di-Rumah-Ini-Resep-Sate-Ayam-Bumbu-Kacang-yang-Lezat-.jpg", "Sate ayam adalah makanan yang terkenal di Indonesia. Daging ayam yang dipotong-potong kemudian ditusuk dan dipanggang dengan bumbu kacang yang khas."));
        itemsList.add(new items("Nasi Goreng", "https://cdn1-production-images-kly.akamaized.net/EjwV7j3Y4JrlqUFuavke4NtRWtM=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3108566/original/079979700_1587487794-Sajiku_1.jpg", "Nasi goreng adalah makanan khas Indonesia yang terbuat dari nasi yang digoreng bersama bumbu-bumbu tertentu seperti bawang merah, bawang putih, dan kecap."));
        itemsList.add(new items("Mie Goreng", "https://allofresh.id/blog/wp-content/uploads/2023/09/cara-membuat-mie-goreng-4-1-scaled.jpg", "Mie goreng merupakan hidangan mi yang digoreng dalam minyak goreng panas. Biasanya mie goreng diolah bersama dengan bumbu-bumbu dan tambahan seperti telur, sayuran, dan daging."));
        itemsList.add(new items("Ayam Bakar", "https://www.sasa.co.id/medias/page_medias/Screen_Shot_2023-01-09_at_17_40_36_(1)_(1)_(1)_(1)_(1)_(1)_(1)_(1).png", "Ayam bakar adalah hidangan ayam yang dipanggang atau dibakar dengan menggunakan bumbu tertentu, sehingga menghasilkan cita rasa yang khas."));
        itemsList.add(new items("Nasi Padang", "https://cdn.rri.co.id/berita/1/images/1689391542821-images_(22)/1689391542821-images_(22).jpeg", "Nasi Padang adalah hidangan nasi khas dari Padang, Sumatera Barat, Indonesia, yang disajikan dengan berbagai macam lauk pauk."));
        itemsList.add(new items("Soto Ayam", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/17043644/Praktis-dan-Simpel-Ini-Resep-Soto-Ayam-Lamongan-yang-Menggugah-Selera-.jpg", "Soto ayam adalah hidangan sup ayam yang populer di Indonesia. Biasanya disajikan dengan tambahan bawang goreng, irisan ketupat, dan sambal."));
        itemsList.add(new items("Bakso", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/25041221/ini-resep-kuah-bakso-sap-yang-mudah-dibuat-di-rumah.jpg", "Bakso adalah bola daging yang umumnya terbuat dari daging sapi giling yang dicampur dengan tepung tapioka."));
        itemsList.add(new items("Rendang", "https://www.warisankuliner.com/gfx/recipes/temp_thumb-1658299943.jpg", "Rendang adalah masakan daging asli Indonesia yang berasal dari Minangkabau, Sumatera Barat. Daging dimasak dalam waktu yang lama dengan bumbu rempah-rempah yang kaya."));
        itemsList.add(new items("Gado-Gado", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Gado_gado.jpg/1200px-Gado_gado.jpg", "Gado-gado adalah salah satu makanan khas Indonesia yang terdiri dari sayuran yang direbus dan dicampur dengan bumbu kacang khas."));
        itemsList.add(new items("Pecel Lele", "https://asset.kompas.com/crops/QT6V0LoKz42gr5uezLBcGZyBBLw=/0x0:1000x667/750x500/data/photo/2021/03/21/60569b33a2b3d.jpeg", "Pecel lele adalah hidangan lele yang digoreng kering dan disajikan dengan sambal kacang dan lalapan."));
        itemsList.add(new items("Martabak Manis", "https://www.dapurkobe.co.id/wp-content/uploads/martabak-8-rasa.jpg", "Martabak manis adalah kue khas Indonesia yang berbentuk seperti panekuk, terbuat dari adonan tepung terigu, telur, gula, dan ragi."));
        itemsList.add(new items("Pisang Goreng", "https://i.pinimg.com/originals/ee/22/06/ee2206feff17d1976d014d352cc362c0.png", "Pisang goreng adalah makanan ringan yang terbuat dari pisang yang digoreng dalam minyak panas."));
        itemsList.add(new items("Ikan Bakar", "https://asset.kompas.com/crops/J0ARoySS4ZFviSelgHTMsxHPNv0=/0x0:1000x667/750x500/data/photo/2020/12/17/5fdb3cd0c1525.jpg", "Ikan bakar adalah hidangan ikan yang dipanggang atau dibakar dengan bumbu rempah dan bahan tambahan lainnya."));

        adapter = new AdapterList(itemsList, getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
