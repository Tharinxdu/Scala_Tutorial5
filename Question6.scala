def fibonacci(x:Int):Int=x match{
    case z if z<=1 => z
    case _ => fibonacci(x-1)+fibonacci(x-2)
}   

object O6 extends App{
    println(fibonacci(9))
}