//Gegeben ist eine veränderbare Liste namens lieblingsFilme, die Filme auflistet.
//
//Erstelle einmal eine For-Schleife und einmal eine Do-While-Schleife.
//
//Die Schleifen sollen die Liste mit den Lieblingsfilmen durchlaufen und prüfen, ob der Film "Matrix" in der Liste ist.
// Wenn der Film "Matrix" in der Liste ist, soll in der Konsole "Ja, der Film Matrix ist in der Liste." ausgegeben werden.
//Zusätzlich soll die Stelle in der Liste ausgegeben werden, an der sich der Film "Matrix" befindet.
//
//Du darfst für diese Aufgabe nicht die contains()-Funktion für Listen verwenden.

fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Frankenstein", "Jurassic Park", "Matrix", "Harry Potter")

    var film = "Matrix"
    var i = 0
    var j = 0
    var indexOfI = lieblingsFilme.indexOf(film)

    for (film in lieblingsFilme){
        if (i<=0){
            println("Ja, der Film Matrix ist in der Liste.")
            println("Er steht an der ${indexOfI}. Stelle in der Liste!")
            i++
        }
    }

    println("")

    do {
        println("Ja, der Film Matrix ist in der Liste.")
        println("Er steht an der ${indexOfI}. Stelle in der Liste!")
        j++
    } while (film in lieblingsFilme && j<=0)
}