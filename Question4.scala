def evenOrodd(x:Int):String=x match{
    case 0 => "Even"
    case 1 => "Odd"
    case _ => evenOrodd(x-2)
}

object O4 extends App{
    println(evenOrodd(5))
}