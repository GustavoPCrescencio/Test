class Player(val name: String, var level: Int = 4, var lives: Int = 8, var score: Int = 0) {
fun show(){
println("""
name: $name
level: $level
lives: $lives
score: $score
""")
}
}