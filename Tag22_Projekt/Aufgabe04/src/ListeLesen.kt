//Gib den Inhalt der Liste fruits einmal mithilfe einer For-Schleife und einmal mithilfe einer Do-While-Schleife in
// der Konsole aus.
//
//Du darfst nicht die ganze Liste einfach als Parameter der println()-Funktion übergeben, sondern sollst mithilfe der
// Schleifen durch die Elemente der Liste durchgehen und diese ausgeben.
//
//Das ist verboten: println(fruits)
//In der Konsole sollte dann folgendes ausgegeben werden:
//Strawberry
//Apple
//Banana
//Lemon
//Strawberry
//Apple
//Banana
//Lemon

fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")
    for (i in fruits){
        println(i)
    }

    println("")

    var i = 0

    do {
        println(fruits[i])
        i++
    }while (i <= fruits.size-1)

}