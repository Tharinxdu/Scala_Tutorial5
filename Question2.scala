def GCD(x: Int, y: Int):Int= y match{
    case 0 => x
    case y if y > x => GCD(y, x)
    case _ => GCD(y, x%y)
}

def prime(x :Int,y:Int = 2):Boolean = y match{
    case z if z==x => true
    case z if GCD(x,z)>1 => false
    case z => prime(x,z+1)
}

def primeSeq(x:Int):Unit = x match{
    case x if x<=1 => println("")
    case x if prime(x) => println(x);primeSeq(x-1);
    case _ => primeSeq(x-1)
}

object O2 extends App{
    primeSeq(10)
}