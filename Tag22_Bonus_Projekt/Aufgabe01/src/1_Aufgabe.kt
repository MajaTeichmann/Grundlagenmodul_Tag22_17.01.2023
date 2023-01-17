// todo: In der ersten Aufgabe sollst du die Reihenfolge der Elemente einer Liste umdrehen.
//  Nimm dazu die nameList und speichere die umgedrehte liste in die Variable sortedList.
//  Das Programm gibt "Du hast die Aufgabe gelöst" aus, wenn dein Ergebnis richtig ist.
//  Hinweis zum Verständnis:
//  Die nameList ("Paul","Dieter", "Jannes", "Lukas", "Hans")
//  Soll umgedreht in der sortedList abgespeichert werden, sodass die sortedList so aussieht:
//  ("Hans", "Lukas","Jannes", "Dieter", "Paul")

fun main(){
    var nameList: List<String> = listOf("Paul","Dieter", "Jannes", "Lukas", "Hans")
    var sortedList: MutableList<String> = mutableListOf("","", "", "", "")

    /*
        Hier könt ihr euren Code hinschreiben:
    */

    sortedList = nameList.reversed().toMutableList()

    // Den Code hier drunter nicht ändern!!!

    var finishedlist: List<String> = listOf("Hans", "Lukas","Jannes", "Dieter", "Paul")
    if(sortedList == finishedlist){
        println("Du hast die Aufgabe gelöst")
    }else{
        println("Leider noch nicht richtig, versuchs weiter :D")
    }
}