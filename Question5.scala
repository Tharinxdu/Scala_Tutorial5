def checkEven(x:Int):Boolean=x match{
    case z if z%2==0 => true
    case _ =>false
}

def sumEven(x:Int):Int=x match{
    case 0 => 0
    case 1 => 0
    case z if checkEven(z) => z+sumEven(z-1)
    case _ => sumEven(x-1)
}

object O5 extends App{
    println(sumEven(10))
}