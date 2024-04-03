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

public class MinumanKhas extends Fragment {

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        recyclerView = view.findViewById(R.id.RVminumanKhas);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        itemsList = new ArrayList<>();
        itemsList.add(new items("Es Cendol Kudus", "https://assets-pergikuliner.com/dCEENwsFYDNGf2MHB5hmTFwB6S4=/fit-in/1366x768/smart/filters:no_upscale()/https://assets-pergikuliner.com/uploads/image/picture/1638833/picture-1571285574.jpg", "Es Cendol Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Es Cendol Kudus terdiri dari campuran cendol (butiran tepung beras), santan, gula merah cair, dan es serut."));
        itemsList.add(new items("Es Dawet Ayu Kudus", "https://storage.nu.or.id/storage/post/16_9/mid/dawet-ayu-banjarnegera-myfood_1660883851.webp", "Es Dawet Ayu Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Minuman ini terdiri dari dawet (butiran tepung sagu) yang disajikan dengan santan, gula merah cair, es serut, dan tambahan bubuk pandan."));
        itemsList.add(new items("Es Cenil Kudus", "https://cdn.yummy.co.id/content-images/images/20201018/142EwqZXJFcFMJcOmaSytBQd8DTvdGpk-31363033303039313937d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/resize,w_388,h_388,m_fixed,x-oss-process=image/format,webp", "Es Cenil Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Es Cenil Kudus terbuat dari cenil (butiran tepung kanji) yang dimasak dengan air gula merah, kemudian disajikan dengan es serut."));
        itemsList.add(new items("Es Kacang Ijo Kudus", "https://asset.kompas.com/crops/NTPccma9PK7pTkNjYaSDaCo1ufI=/3x0:700x465/750x500/data/photo/2021/04/30/608baafdb7ee6.jpg", "Es Kacang Ijo Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Es Kacang Ijo Kudus terdiri dari kacang hijau yang dimasak dengan santan dan gula merah, kemudian disajikan dengan es serut."));
        itemsList.add(new items("Wedang Jahe Kudus", "https://asset-a.grid.id/crop/0x0:0x0/700x0/photo/2022/10/23/b88eaebe-c8aa-4b70-ba59-e641ec6e-20221023051958.jpeg", "Wedang Jahe Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Wedang Jahe Kudus terbuat dari jahe segar yang direbus dengan tambahan gula merah dan rempah-rempah lainnya."));
        itemsList.add(new items("Es Coklat Kudus", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/28042143/sedang-tren-ini-cara-membuat-es-coklat-yang-segar-dan-kental-halodoc.jpg.webp", "Es Coklat Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Es Coklat Kudus terdiri dari campuran susu, coklat bubuk, es serut, dan sirup coklat."));
        itemsList.add(new items("Es Teh Poci Kudus", "https://cdn.idntimes.com/content-images/post/20230217/325302538-938170374221710-1614704619464833841-n-05ce5ad9472fcb0af2afa7798a46ec73_600x400.png", "Es Teh Poci Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Minuman ini terbuat dari teh poci (teh yang diseduh dengan air panas langsung dalam poci tanah liat) dan disajikan dingin dengan es serut."));
        itemsList.add(new items("Wedang Ronde Kudus", "https://asset.kompas.com/crops/RJ97KL0xzjUKnFnBBOHwNIp60D8=/19x0:1000x654/750x500/data/photo/2021/12/31/61cea13d20626.jpg", "Wedang Ronde Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Minuman ini terdiri dari bola-bola ketan yang diisi dengan pasta kacang tanah, disajikan dalam kuah jahe yang hangat."));
        itemsList.add(new items("Wedang Uwuh Kudus", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/10/03032633/7-Manfaat-Minuman-Wedang-Uwuh-untuk-Kesehatan-Tubuh.jpg", "Wedang Uwuh Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Minuman ini terbuat dari campuran rempah-rempah seperti jahe, cengkeh, kayu manis, dan daun pandan yang direbus dengan gula merah."));
        itemsList.add(new items("Wedang Jahe Merah Kudus", "https://asset.kompas.com/crops/ntXd1Xd22a9XDR8t3VbAtvPJahA=/0x0:1000x667/750x500/data/photo/2020/03/26/5e7c89768dcd8.jpg", "Wedang Jahe Merah Kudus adalah minuman khas dari Kudus, Jawa Tengah, Indonesia. Minuman ini terbuat dari jahe merah segar yang direbus dengan gula merah dan rempah-rempah lainnya."));

        adapter = new AdapterList(itemsList, getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
