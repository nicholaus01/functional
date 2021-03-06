package rsk

import java.util.*

class Meeting{
    var Title: String = ""
    var When:Date = Date()
    var Who = mutableListOf<String>()

    fun create(){
        println("Meeting Title: $Title")
        println("Meeting Date: $When")
        println("Participants:")
        for(i in Who){
            println(i)
        }
    }
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Board Meeting"
    m.When = Date(2017,1,1)
    m.Who.add("Kevin")

    with(m){
        Title = "Board Meeting"
        When = Date(2017,1,1)
        Who.add("John")
    }
    m.apply {
        Title = "Board Meeting"
        When = Date(2017,1,1)
        Who.add("Benjamin")
    }.create()

}