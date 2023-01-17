// Erstelle eine Do-While-Schleife, die alle Ganzzahlen von 1 bis einschließlich 100 in der Konsole ausgibt.
//
//In der Konsole sollte dann folgendes zu sehen sein:
//1
//2
//3
//...
//100

var i = 1

fun main(){
    do {
        println(i)
        i++
    }while (i in 1..100)
}