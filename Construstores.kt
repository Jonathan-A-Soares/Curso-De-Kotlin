class Casa /*( cor:String, vagasGaragem:Int )*/ {
    //propiedade
    var cor:String 
    var vagasGaragem:Int 
    constructor( cor:String, vagasGaragem:Int )
    {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    
    /*init
     * {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/

    //metodo
    fun detalhesCasa()
    {
        println("cor da casa e $cor, vagas $vagasGaragem ")
    }

    fun abrirJanela ()
    {
        println("Abrir janela")
    }
    fun abrirPorta ()
    {
        println("Abrir Porta")
    }
    fun abrirCasa ()
    {
        this.abrirJanela()
        this.abrirPorta()
    }

}

fun main() 
{
    val casa = Casa( "amarela", 2)

    casa.detalhesCasa()
 
}