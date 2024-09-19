fun compressString(input: String): String {
    if (input.isEmpty()) return ""
    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }

    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }

    return result.toString()
}

fun main() {
    println("Данная программа подсчитывает количество подряд идущих одинаковых символов во введенной строке.")

    while (true) {
        println("Введите строку символов (или введите 'exit' для выхода):")
        val input = readln().trim()

        if (input.isEmpty()) {
            println("Ошибка: строка не должна быть пустой. Попробуйте снова.")
            continue
        }

        if (input.equals("exit", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }

        val compressed = compressString(input)
        println("Сжатая строка: $compressed")
    }
}