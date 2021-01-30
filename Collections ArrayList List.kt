//List -> inmutavel
//ArrayList -> mutavel
fun main() {
    var listaItens = arrayListOf("SP", "RJ", "MG")
    
    println(listaItens)
    println(listaItens.size)
    listaItens.add ("BA")
    println(listaItens)
    println(listaItens.size)
    listaItens.remove ("SP")
    println(listaItens)
    println(listaItens.size)
    
}