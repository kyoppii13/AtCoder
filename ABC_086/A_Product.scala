object A_Product{
  def main(args: Array[String]): Unit = {
    val strAry = io.StdIn.readLine()
    println(solve(strAry))
    
  }
  def solve(input: String): String =
    if(input.split(" ").map(_.toInt).product%2==0){"Even"}else{"Odd"}
}
