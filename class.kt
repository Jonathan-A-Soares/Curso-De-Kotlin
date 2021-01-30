class Casa {
    //propiedade
    var cor:String = ""

    //metodo
    fun abrirJanela (){
        println("Abrir janela")
    }
    fun abrirPorta (){
        println("Abrir Porta")
    }
    fun abrirCasa (){
        this.abrirJanela()
        this.abrirPorta()
    }

}

fun main() {
    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirCasa()

    //var casa2 = Casa()
   // casa2.cor = "vermelho"

   
    
    println(casa.cor)
   // println(casa2.cor)
}