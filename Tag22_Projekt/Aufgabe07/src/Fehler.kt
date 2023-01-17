//In dieser Aufgabe sollst du fehlerhaften Code korrigieren.
//
//Wenn du fertig bist, sollte das Programm keine Compiler- noch Laufzeitfehler besitzen und alle Filme in der Liste
// lieblingsFilme in der Konsole ausgeben.
//
//Wenn du nicht direkt auf die Lösung kommst, versuche erst einmal das Programm auszuführen und schau dir die
// Fehlermeldung an oder führe den Mauszeiger über die rot markierten Stellen im Code um nützliche Hinweise zu erhalten.

//todo: ORIGINAL
// fun main() {
//    var lieblingsFilme: List<String> = listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")
//    (i in 0..lieblingsFilme.size)
//    println(lieblingsFilme[i])
//}

fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")

    // Verbesser die For-schleife, sodass alle Filme der Liste lieblingsFilme ausgegeben wird.
    for(i in 0..lieblingsFilme.size-1)
    println(lieblingsFilme[i])
}