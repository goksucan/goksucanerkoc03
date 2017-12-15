package com.lello.gokkucan.zhongguoshu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_peppe.*

class Peppe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peppe)
        val mystring = getResources().getString(R.string.sourcan)
        val nfs = getResources().getString(R.string.nfs)
        val xiaocan = getResources().getString(R.string.xiaocan)
        val idari = getResources().getString(R.string.idari)
        val habitat = getResources().getString(R.string.habitat)
        var chunjie = getResources().getString(R.string.chunjie)
        var qingming = getResources().getString(R.string.qingming)
        var dragon = getResources().getString(R.string.dragon)
        var social = getResources().getString(R.string.social)

        var sayfa = 1
        var sayfalar = arrayOf(R.drawable.bebeler, R.drawable.tbcnm, R.drawable.xiaocum, R.drawable.mapc, R.drawable.animal,
                R.drawable.hppcn, R.drawable.qingming, R.drawable.dragonboat, R.drawable.tech   )
        var metinler = arrayOf(mystring, nfs, xiaocan, idari, habitat, chunjie,qingming, dragon, social)
        var basliklar = arrayOf("Çin'in Nüfusu", "Çin'in Kuruluşu", "Deng XiaoPing", "Çin'in İdari Yapısı",
                "Çin'in Coğrafyası", "Bahar Bayramı (春节)", "QingMing Bayramı (清明节)",
                "Dragon Boat Festival (端午节)", "Sosyal Medya")
        baslikTutucu.setText(basliklar[0])
        metinTutucu.setText(metinler[0])
        ileriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa < sayfalar.size) {
                    sayfa++
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                    baslikTutucu.setText(basliklar[sayfa-1])
                } else {
                    Toast.makeText(this@Peppe, "Son sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

        geriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa > 1) {
                    sayfa--
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                    baslikTutucu.setText(basliklar[sayfa-1])
                } else {
                    Toast.makeText(this@Peppe, "İlk sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}
