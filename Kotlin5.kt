// 5. Написать функцию, которая возвращает число 10.
fun main() {
    val number1 = 3
    val number2 = 4
    println(comparison(number1, number2))
}

fun comparison(number1: Int, number2: Int): Int = if (number1 > number2) {
    1
} else {
    10
}