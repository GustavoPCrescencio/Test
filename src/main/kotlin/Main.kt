fun main(){
val tim = Player("Tim",1,0,0)
//    var sword = Weapon("Sword", 10)
//    tim.weapon = sword
//    tim.show()
//    val louise = Player("Louise",1,1,34)
//    louise.weapon = tim.weapon
//    louise.show()
//    println("${louise.name}")
//    tim.show()
//var spear = Weapon("Spear",11)
//tim.weapon = spear
//    println("${spear.name}")
//    tim.show()
//    spear.damageInflicted = 15
//    tim.show()
    val healthPotion = Loot("Health Potion", LootType.POTION, 10.0)
//   tim.inventory.add(healthPotion)
//tim.showInventory()
//println(tim)
    tim.inventory.add(healthPotion)
    tim.showInventory()
    println(tim.toString())
}