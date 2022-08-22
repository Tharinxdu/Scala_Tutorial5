def sum(x:Int):Int= x match{
    case 0 => 0
    case x => x+sum(x-1)
}

object O3 extends App{
    println(sum(5))
}