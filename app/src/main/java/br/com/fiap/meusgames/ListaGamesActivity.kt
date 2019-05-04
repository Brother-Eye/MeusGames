package br.com.fiap.meusgames

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.fiap.meusgames.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_games.*

class ListaGamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_games)

        rvJogos.adapter = ListaGamesAdapter(
                meusJogos(),this,{
            Toast.makeText(
                    this,
                    it.nome,
                    Toast.LENGTH_LONG)
                    .show()
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    fun  meusJogos(): List<Jogo>{
        return listOf(
                Jogo(R.drawable.mortalkombat,
                        "Mortal Kombat 11",
                        2019,
                        "Aqui vou descrever o jogo"),
                Jogo(R.drawable.detroitbecomehuman,
                        "Detroit: Become Human",
                        2018,
                            "Aqui vem a descrição do jogo"),
                Jogo(R.drawable.pokemonstadium,
                        "Pokemon Stadium",
                        2000,
                        "Aqui vem a descrição do jogo")


        )
    }
}
