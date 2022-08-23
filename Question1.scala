def GCD(x: Int, y: Int):Int= y match{
    case 0 => x
    case y if y > x => GCD(y, x)
    case _ => GCD(y, x%y)
}

def prime(x :Int,y:Int = 2):Boolean = y match{
    case z if z==x => true
    case z if GCD(x,z)>1 => false
    case z => prime(x,y+1)
}

object O1 extends App{
    println(prime(16))
    println(prime(13))
    println(prime(11))
}
