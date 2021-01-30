/*Enum (enumeraçao) -> e um tipo de dados
que cosiste em um conjunto de constante
 */
enum class StatusPedido{
    PRECESSANDO, APROVADO, REPROVADO
}
class Pedido{
    var status:StatusPedido =StatusPedido.PRECESSANDO
}
fun main(){
    val pedido = Pedido()
    
    if(pedido.status == StatusPedido.PRECESSANDO){
        println("pedido sendo PRECESSANDO")
    }else if(pedido.status == StatusPedido.APROVADO){
        println("pedido sendo Aprovado")
    }else {
         println("pedido sendo reprovado")
    }
    
    pedido.status = StatusPedido.APROVADO
    
    
     if(pedido.status == StatusPedido.PRECESSANDO){
        println("pedido sendo processado")
    }else if(pedido.status == StatusPedido.APROVADO){
        println("pedido sendo Aprovado")
    }else {
         println("pedido sendo reprovado")
    }
}