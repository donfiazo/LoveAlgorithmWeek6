fun main() {

    println(inLove(4,4))
    println(inLove(3,11))
    println(inLove(22,17))

}

fun inLove(flower1: Int, flower2: Int): Boolean {
    return !(flower1 % 2 == 0 && flower2 % 2 == 0 || flower1 % 2 != 0 && flower2 % 2 != 0)
}
