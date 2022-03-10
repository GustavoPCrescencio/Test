class Player (val name: String, var lives: Int, var level: Int, var score: Int){
var weapon: Weapon = Weapon("hand",1)
   val inventory = ArrayList<Loot>()
    fun show() {
if (lives > 0) {
    println("$name's alive")
}else{
    println("$name's dead")
}
    }
    override fun toString(): String {
        return """
           name: $name
           lives: $lives
           level: $level
           score: $score
           weapon name: ${weapon.name}
           weapon damage: ${weapon.damageInflicted}
        """
    }
    fun showInventory (){
        println("$name's Inventory")
    println(inventory.get(0))
        println("===================================")
    }
}