package com.example.prova

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{ calculateData() }
    }

    fun calculateData()
    {
        val stringIntextViewDataMes = binding.textViewDataMes.text.toString()
        val datames = stringIntextViewDataMes.toInt()
        val stringIntextViewData = binding.textViewData.text.toString()
        val datadia = stringIntextViewData.toInt()

        when (datames) {
            1 -> if (datadia > 19)
            {
                val Image: ImageView = binding.imageView
                Image.setImageResource(R.drawable.aquario)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Aquário")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem independentes, criativas, originais e intelectuais. Elas tendem a ser progressistas e humanitárias, buscando sempre o bem comum. No entanto, também podem ser imprevisíveis e rebeldes.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.capricornio)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Capricórnio")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem ambiciosas, persistentes e responsáveis. Elas tendem a ser práticas e focadas em seus objetivos, trabalhando duro para alcançar o sucesso. Geralmente reservados e sérios, mas também podem ser leais e confiáveis.")
            }


            2 -> if (datadia > 18)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.peixes)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Peixes")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem intuitivas, emocionais e sensíveis. Elas tendem a ser criativas e imaginativas, com uma forte conexão com a arte e a espiritualidade. Geralmente empáticos e compassivos, mas também podem ser vulneráveis e indecisos.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.aquario)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Aquário")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem independentes, criativas, originais e intelectuais. Elas tendem a ser progressistas e humanitárias, buscando sempre o bem comum. No entanto, também podem ser imprevisíveis e rebeldes.")
            }


            3 -> if (datadia > 20)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.aries)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Áries")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem corajosas, determinadas e enérgicas. Elas tendem a ser líderes naturais, sempre buscando a próxima grande aventura. Arianos são impulsivos e competitivos, mas também podem ser impacientes e teimosos")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.peixes)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Peixes")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem intuitivas, emocionais e sensíveis. Elas tendem a ser criativas e imaginativas, com uma forte conexão com a arte e a espiritualidade. Geralmente empáticos e compassivos, mas também podem ser vulneráveis e indecisos.")
            }


            4 -> if (datadia > 19)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.touro)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Touro")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem práticas, confiáveis e persistentes. Elas tendem a ser pacientes e perseverantes em seus objetivos, trabalhando duro para alcançar a estabilidade e segurança financeira. Geralmente teimosos e possessivos.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.aries)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Áries")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem corajosas, determinadas e enérgicas. Elas tendem a ser líderes naturais, sempre buscando a próxima grande aventura. Arianos são impulsivos e competitivos, mas também podem ser impacientes e teimosos")
            }


            5 -> if (datadia > 21)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.gemeos)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Gêmeos")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem curiosas, versáteis e comunicativas. Elas tendem a ser inteligentes e adaptáveis, facilmente mudando de ideia ou perspectiva. São sociáveis e gostam de conhecer pessoas novas, mas também podem ser superficiais ou inquietos.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.touro)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Touro")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem práticas, confiáveis e persistentes. Elas tendem a ser pacientes e perseverantes em seus objetivos, trabalhando duro para alcançar a estabilidade e segurança financeira. Geralmente teimosos e possessivos.")
            }


            6 -> if (datadia > 21)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.cancer)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Câncer")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem sensíveis, emocionais e protetoras. Elas tendem a ser cuidadosas e carinhosas com aqueles que amam, mas também podem ser reservadas e vulneráveis. são intuitivos e imaginativos, mas podem ser influenciados pelas emoções.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.gemeos)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Gêmeos")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem curiosas, versáteis e comunicativas. Elas tendem a ser inteligentes e adaptáveis, facilmente mudando de ideia ou perspectiva. São sociáveis e gostam de conhecer pessoas novas, mas também podem ser superficiais ou inquietos.")
            }


            7 -> if (datadia > 23)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.leao)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Leão")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem extrovertidas, generosas e confiantes. Elas tendem a ser líderes naturais e gostam de estar no centro das atenções. são criativos e apaixonados, mas também podem ser egoístas e arrogantes.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.cancer)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Câncer")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem sensíveis, emocionais e protetoras. Elas tendem a ser cuidadosas e carinhosas com aqueles que amam, mas também podem ser reservadas e vulneráveis. são intuitivos e imaginativos, mas podem ser influenciados pelas emoções.")
            }


            8 -> if (datadia > 22)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.virgem)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Virgem")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem práticas, trabalhadoras e detalhistas. Elas tendem a ser organizadas e focadas em seus objetivos, buscando a perfeição em tudo o que fazem. São analíticos e críticos, mas também podem ser tímidos e preocupados demais.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.leao)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Leão")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem extrovertidas, generosas e confiantes. Elas tendem a ser líderes naturais e gostam de estar no centro das atenções. são criativos e apaixonados, mas também podem ser egoístas e arrogantes.")
            }


            9 -> if (datadia > 22)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.libra)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Libra")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem equilibradas, diplomáticas e sociáveis. Elas tendem a ser justas e pacificadoras, buscando sempre o meio-termo em conflitos. São charmosos e românticos, mas também podem ser indecisos e superficiais.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.virgem)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Virgem")
                val textDescricao: TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem práticas, trabalhadoras e detalhistas. Elas tendem a ser organizadas e focadas em seus objetivos, buscando a perfeição em tudo o que fazem. São analíticos e críticos, mas também podem ser tímidos e preocupados demais.")
            }


            10 -> if (datadia > 22)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.escorpiao)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Escorpião")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem intensas, passionais e misteriosas. Elas tendem a ser emocionalmente fortes e decididas em seus objetivos, mas também podem ser vingativas e manipuladoras. São intuitivos e profundos, mas podem ser desconfiados e ciumentos.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.libra)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Libra")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem equilibradas, diplomáticas e sociáveis. Elas tendem a ser justas e pacificadoras, buscando sempre o meio-termo em conflitos. São charmosos e românticos, mas também podem ser indecisos e superficiais.")
            }


            11 -> if (datadia > 21)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.sagitario)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Sagitário")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem aventureiras, otimistas e extrovertidas. Elas tendem a ser expansivas em sua visão de mundo, buscando sempre novas experiências e conhecimentos. São honestos e diretos, mas também podem ser impulsivos e excessivamente confiantes.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.escorpiao)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Escorpião")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem intensas, passionais e misteriosas. Elas tendem a ser emocionalmente fortes e decididas em seus objetivos, mas também podem ser vingativas e manipuladoras. São intuitivos e profundos, mas podem ser desconfiados e ciumentos.")
            }


            12 -> if (datadia > 21)
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.capricornio)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Capricórnio")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem ambiciosas, persistentes e responsáveis. Elas tendem a ser práticas e focadas em seus objetivos, trabalhando duro para alcançar o sucesso. Geralmente reservados e sérios, mas também podem ser leais e confiáveis.")
            }
            else
            {
                val Image: ImageView = findViewById(R.id.imageView)
                Image.setImageResource(R.drawable.sagitario)
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Sagitário")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Pessoas conhecidas por serem aventureiras, otimistas e extrovertidas. Elas tendem a ser expansivas em sua visão de mundo, buscando sempre novas experiências e conhecimentos. São honestos e diretos, mas também podem ser impulsivos e excessivamente confiantes.")
            }


            else -> {
                val textSigno: TextView = binding.textViewSigno
                textSigno.setText("Erro")
                val textDescricao : TextView = binding.descricao
                textDescricao.setText("Erro")
                val toast = Toast.makeText(this, "As informações de dia ou mes estão inválidas", Toast.LENGTH_SHORT)
                toast.show()
            }


        }

    }
}