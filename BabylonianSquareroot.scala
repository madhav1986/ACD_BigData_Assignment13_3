object BabylonianSquareroot 
{
  def sqaureRoot(n:Float):Float=
  {
     var x:Float = n
     var y:Float = 1
     val e:Double = 0.000001 /* e decides the accuracy level*/
     while(x - y > e)
        {
        x = (x + y)/2
        y = n/x
        }
          x
  }
  
  def main(args: Array[String])
  {
   	val a:Float=args(0).toFloat 
	println(sqaureRoot(a))
  }
}
