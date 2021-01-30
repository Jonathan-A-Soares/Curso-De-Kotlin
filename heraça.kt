open class Animal
{
     open fun dormir ()
    {
            println("dormir ")
    }
     fun correr ()
    {
            println("correr ")
    }

}

class Cao : Animal()
{ 
    override fun dormir ()
    {
        	super.dormir()
            println("como cao ")
    }
    fun latir(){
        println("latir")
    }
}

class Passaro : Animal()
{ 
  override fun dormir ()
    {
        	super.dormir()
            println("como passaro ")
    }
    fun voar(){
        println("voar")
    }
}


fun main ()
{
    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.dormir()
    passaro.correr()
    passaro.voar()
}