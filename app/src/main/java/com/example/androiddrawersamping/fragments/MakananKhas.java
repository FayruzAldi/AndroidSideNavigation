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

public class MakananKhas extends Fragment {

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.RVmakananKhas);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        itemsList = new ArrayList<>();
        itemsList.add(new items("Nasi Liwet", "https://www.masakapahariini.com/wp-content/uploads/2021/07/Nasi-Liwet-Sunda.jpg", "Nasi Liwet adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Nasi Liwet terdiri dari nasi yang dimasak dengan santan dan rempah-rempah, biasanya disajikan dengan lauk-pauk seperti ayam goreng, telur, tempe, dan sambal."));
        itemsList.add(new items("Tahu Gimbal", "https://img-global.cpcdn.com/recipes/4b4c942f51f94042/680x482cq70/tahu-gimbal-khas-semarang-foto-resep-utama.jpg", "Tahu Gimbal adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Tahu Gimbal terdiri dari tahu yang digoreng, kemudian disajikan dengan kuah yang kaya rempah seperti petis, cabai, dan bawang goreng."));
        itemsList.add(new items("Tahu Kriuk", "https://static.promediateknologi.id/crop/0x67:1080x795/750x500/webp/photo/2022/08/08/659923502.jpg", "Tahu Kriuk adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Tahu Kriuk terdiri dari tahu yang digoreng kering hingga crispy, kemudian diberi bumbu yang gurih dan pedas."));
        itemsList.add(new items("Sate Maranggi", "https://www.dapurkobe.co.id/wp-content/uploads/sate-maranggi.jpg", "Sate Maranggi adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Sate Maranggi terdiri dari potongan daging sapi yang dimarinasi dengan bumbu khas Maranggi, kemudian dipanggang dan disajikan dengan sambal kecap."));
        itemsList.add(new items("Nasi Babat", "https://asset-2.tstatic.net/tribunjatimtravel/foto/bank/images/Nasi-babat-Ondomohen.jpg", "Nasi Babat adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Nasi Babat terdiri dari nasi yang disajikan dengan babat sapi yang dimasak dengan bumbu rempah dan santan, biasanya disajikan dengan kerupuk."));
        itemsList.add(new items("Gule Kambing", "https://www.dapurkobe.co.id/wp-content/uploads/gulai-kambing.jpg", "Gule Kambing adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Gule Kambing terdiri dari potongan daging kambing yang dimasak dengan kuah gule yang kaya rempah dan santan, biasanya disajikan dengan nasi dan sambal."));
        itemsList.add(new items("Kue Sagon", "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/p1/1005/2023/12/24/Screenshot_20231224-065741_Instagram-3118085400.jpg", "Kue Sagon adalah kue tradisional khas Jawa Tengah, termasuk Kudus. Kue Sagon terbuat dari kelapa parut, gula merah, tepung ketan, dan santan yang dibentuk bulat dan dipanggang hingga matang."));
        itemsList.add(new items("Krecek Kacang", "https://assets.unileversolutions.com/recipes-v2/230937.jpg", "Krecek Kacang adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Krecek Kacang terdiri dari krecek (jeroan sapi yang direbus) yang disajikan dengan kacang hijau yang dimasak dengan bumbu khas, biasanya disajikan dengan nasi."));
        itemsList.add(new items("Gethuk Lindri", "https://asset.kompas.com/crops/toeyJ5c1Ug6FQXCkkiwHea3Oxec=/0x0:1000x667/750x500/data/photo/2021/09/23/614bde3079525.jpg", "Gethuk Lindri adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Gethuk Lindri terbuat dari singkong yang dihaluskan dan dicampur dengan gula, kemudian dibentuk menjadi lindri (silinder) dan dipotong-potong."));
        itemsList.add(new items("Nasi Grombyang", "https://wisatapemalang.com/wp-content/uploads/2020/06/100-Kuliner-Pemalang-Nasi-Grombyang.jpeg", "Nasi Grombyang adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Nasi Grombyang terdiri dari nasi yang dimasak dengan kuah yang kaya rempah dan bumbu, biasanya disajikan dengan lauk-pauk seperti ayam atau daging sapi."));
        itemsList.add(new items("Klepon", "https://thumb.viva.co.id/media/frontend/thumbs3/2023/06/30/649e77cbb6956-kue-klepon_665_374.jpg", "Klepon adalah kue tradisional khas Jawa Tengah, termasuk Kudus. Klepon terbuat dari tepung ketan yang dibentuk bulat, diisi dengan gula merah, kemudian direbus dan dilapisi kelapa parut."));
        itemsList.add(new items("Sate Gurame", "https://dev.ibisnis.com/images/images/6024a5d9b781e.webp", "Sate Gurame adalah makanan khas dari Kudus, Jawa Tengah, Indonesia. Sate Gurame terdiri dari potongan daging ikan gurame yang ditusuk bambu, kemudian dipanggang dengan bumbu pedas."));

        adapter = new AdapterList(itemsList, getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
