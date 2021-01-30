fun main(){
    var x = 0
    println("------------------------------------------")
    while(x < 5){
        println("X ainda nao e 5")
        x ++
        
    }
    println("agora x e 5")
    println("------------------------------------------")
    x = 0
    for ( y in 1..5 ){
        println("y ainda nao e 5")
        
    }
     println("agora y e 5")
     println("------------------------------------------")
     
     var postagem = arrayOf("ola", "eae", "oi")
     for (postagem in postagem){
         println(postagem)
     }
}