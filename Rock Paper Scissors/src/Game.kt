fun main() {
    val options = arrayOf("Paper", "Rock", "Scissors")
    val gameChoise = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>): String =
        optionsParam[(Math.random() * optionsParam.size).toInt()]