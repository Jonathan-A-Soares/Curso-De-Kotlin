/*
Private - visivel apenas dentr oda class
Protected - funciona como "private" mas e visivel em subclasses
Public - visivel em todo luga
Interna - lembra o public mas usa visibilidade e restrigida ao modulo, sendo etao visivel dentro de um mesmo modulo
*/

open class Animal
{
  protected  var nome = "marley"
      fun dormir ()
    {
            println("dormir ")
    }
    
}

class Cao : Animal()
{ 
        fun exibeNome(){
            println("metodo exibe nome $nome")
        }
    }

fun main (){
    val cao = Cao()
    cao.exibeNome()
        //println(animal.nome)
}