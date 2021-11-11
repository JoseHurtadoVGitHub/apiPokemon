package co.edu.eam.mytestapp.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.edu.eam.mytestapp.databinding.ItemPokemonBinding
import co.edu.eam.mytestapp.model.pokemon.Pokemon
import com.bumptech.glide.Glide

class PokemonAdapter(var lista:Array<Pokemon?>):RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemPokemonBinding.inflate( LayoutInflater.from(parent.context), parent, false )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPokemon(lista.get(position))
    }

    override fun getItemCount(): Int = lista.size

    inner class ViewHolder(var view:ItemPokemonBinding):RecyclerView.ViewHolder(view.root){

        fun bindPokemon(pokemon: Pokemon?){
            if(pokemon!=null) {
                Glide.with(view.imgPoke.context)
                    .load(pokemon.image)
                    .into(view.imgPoke)
                view.numPoke.text = pokemon.id.toString()
                view.namePoke.text = pokemon.name
                pokemon.types.forEach {
                    if(it.type.name=="fire"){
                        view.container.setBackgroundColor(Color.parseColor("#FF0135"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fire.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="normal"){
                        view.container.setBackgroundColor(Color.parseColor("#DBD6D4"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/normal.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="water"){
                        view.container.setBackgroundColor(Color.parseColor("#3652FA"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/water.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="grass"){
                        view.container.setBackgroundColor(Color.parseColor("#2FFA2F"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/grass.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="electric"){
                        view.container.setBackgroundColor(Color.parseColor("#DDFA43"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/electric.png")
                            .into(view.iconPoke)
                    }



                    if(it.type.name=="ice"){
                        view.container.setBackgroundColor(Color.parseColor("#44FAF5"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ice.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="fighting"){
                        view.container.setBackgroundColor(Color.parseColor("#F03713"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fighting.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="poison"){
                        view.container.setBackgroundColor(Color.parseColor("#A811DB"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/poison.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="ground"){
                        view.container.setBackgroundColor(Color.parseColor("#DECCA2"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ground.png")
                            .into(view.iconPoke)
                    }
                    if(it.type.name=="flying"){
                        view.container.setBackgroundColor(Color.parseColor("#A308FC"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/flying.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="psychic"){
                        view.container.setBackgroundColor(Color.parseColor("#DB0E7F"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/psychic.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="bug"){
                        view.container.setBackgroundColor(Color.parseColor("#A3FF3C"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/bug.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="rock"){
                        view.container.setBackgroundColor(Color.parseColor("#DB1D02"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/rock.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="ghost"){
                        view.container.setBackgroundColor(Color.parseColor("#9501FF"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ghost.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="dark"){
                        view.container.setBackgroundColor(Color.parseColor("#DB4104"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/dark.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="dragon"){
                        view.container.setBackgroundColor(Color.parseColor("#7048FF"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/dragon.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="steel"){
                        view.container.setBackgroundColor(Color.parseColor("#BBDE90"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/steel.png")
                            .into(view.iconPoke)
                    }

                    if(it.type.name=="fairy"){
                        view.container.setBackgroundColor(Color.parseColor("#DB6E9C"))
                        Glide.with(view.iconPoke.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fairy.png")
                            .into(view.iconPoke)
                    }



                }
            }
        }
    }

}