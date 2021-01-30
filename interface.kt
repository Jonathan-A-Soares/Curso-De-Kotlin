/*Pode—se dizer, a grosso modo, que uma interface é urn contrato que quando assurnido
por uma classe deve ser implementado.
Interface é utilizada pois podenos ter muitos objetos (classes) que podem possuir a
mesma aeo (Métodos) porém, poder executå—las de raneira diferente

*/ 
interface Presidente{
    fun ganharElecao()
}

open class Cidadao{
    fun direitosDeveres(){
        println("todo cidadao tem direitos e deverres!")
    }

}
class Obama:Cidadao(),Presidente{
	override fun ganharElecao(){
        println("ganhar eleicao nos EUA")
    }
}
class Joao:Cidadao(),Presidente{
	override fun ganharElecao(){
        println("ganhar eleicao no Brasil")
    }
}
fun main(){

    val joao = Joao()
    joao.direitosDeveres()
    joao.ganharElecao()
    
    val obama = Obama()
    obama.direitosDeveres()
    obama.ganharElecao()

}