package co.edu.eam.mytestapp.model.pokemon

class Pokemon(var id:Int, var name:String, var weight:Int, var types:List<Types>) {
    var image:String = ""

    override fun toString(): String {
        return "Pokemon(id=$id, name='$name', weight=$weight, image='$image')"
    }

}