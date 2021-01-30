//set -> nao e permite elementos duplicados
//map -> e uma implementaçao chave/valor
fun main(){
    var itens= hashSetOf("a", "b", "c","c")
    for (itens in itens) {
        println(itens)
    }
    println(itens)

    var map = hashMapOf("urso" to "Animal que imberna", "cao" to "melhor amigo do omen W_W")
    println()
    println(map)
    map.put("passro","voa")
    println()
    println(map)
    for (item in map){
        println()
        println(item)
    }
}