//Schau dir den Codeausschnitt an.
//
//Was wird hier ausgegeben?
//Notiere dir deine Antwort. (z.B. in einem Kommentar)
//Führe dann den Code aus.
//
//Wird das ausgegeben, was du dir notiert hast?

// -> 6
fun main() {
    var ergebnis: Int = 0
    var i: Int = 0
    do {
        ergebnis += i
        i++
    } while (i <= 5)
    println(i)
}