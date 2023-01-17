//In dieser Aufgabe sollst du eine For-Schleife schreiben, die die Liste numbers durchläuft, die jeweilige Zahl liest,
// es um 5 erhöht und dann wieder an der Stelle in der Liste speichert. Gib nach der Schleife die Liste in der Konsole
// aus und überprüfe dein Ergebnis.
//Wurden alle Zahlen um 5 erhöht?

fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)
    var size = numbers.size-1

    println(numbers)
    for (i in 0..size){
        numbers[i] += 5
    }
    println(numbers)
}