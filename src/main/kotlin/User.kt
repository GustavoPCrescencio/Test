class User(val name: String,
           var age: Int,
           var birthDay: Int,
           var birthMonth: Int,
           var birthYear: Int) {
    fun showInf () {
        println("""
name: $name
age: $age
birthDay: $birthDay
birthMonth: $birthMonth
birthYear: $birthYear
""")
    }
}