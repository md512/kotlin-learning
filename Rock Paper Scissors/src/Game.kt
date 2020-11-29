fun main() {
    val options = arrayOf("камень", "ножницы", "бумага")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice, userChoice)
}

fun getGameChoice(optionsParam: Array<String>): String =
        optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while(!isValidChoice) {
        print("Введите один из следующих вариантов:")
        for(item in optionsParam) print(" $item")
        println(".")

        var userInput = readLine()


        if(userInput != null) {
            userInput = userInput.toLowerCase()
            if(userInput in optionsParam) {
                userChoice = userInput
                isValidChoice = true
            } else {
                println("Такого слова нет в списке")
            }
        }

    }
    return userChoice
}

fun printResult(gameChoice: String, userChoice: String) {
    val choices = "Ваш выбор: $userChoice \nВыбор компьютера: $gameChoice \nИтог: "

    if (gameChoice == userChoice) {
        print("$choices ничья")
    } else if ((gameChoice == "камень" && userChoice == "бумага") ||
            (gameChoice == "ножницы" && userChoice == "камень") ||
            (gameChoice == "бумага" && userChoice == "ножницы")) {
        print("$choices вы победили!")
    } else {
        print("$choices вы проиграли :(")
    }
}