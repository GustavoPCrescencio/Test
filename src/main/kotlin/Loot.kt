enum class LootType{
    POTION, RING, ARMOR
}
class Loot(val name: String, val tyoe: LootType, val value: Double){
}