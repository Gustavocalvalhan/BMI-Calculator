
import scala.io.StdIn.{readInt, readLine}
import scala.math.BigDecimal.double2bigDecimal

object Main extends App {

  var a: String = ""
  var p: String = ""
  var imc: Double = 0
  var aIsDigit: Boolean = false
  var pIsDigit: Boolean = false

  try {

    while (aIsDigit == false) {

      println("please inform your height: ")
      a = readLine()

      if (a.forall(_.isDigit)) {
        aIsDigit = true
      } else {
        println("please inform your height again with just numbers: ")
      }
    }


    while (pIsDigit == false) {

      println("please inform your weight: ")
      p = readLine()

      if (p.forall(_.isDigit)) {
        pIsDigit = true
      } else {
        println("please inform your weight again with just numbers: ")

      }
    }

    imc = (p.toDouble / ((a.toDouble * a.toDouble) / 10000)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;

    if (imc < 17) {
      println("You are very underweight, your BMI is: " + (imc))
    }
    if (imc > 17 && imc <= 18.99) {
      println("Underweight, your BMI is: " + (imc))
    }
    if (imc > 18.5 && imc <= 24.99) {
      println("Congratulations!! you are at your ideal weight your BMI is: " + (imc))
    }
    if (imc > 25 && imc <= 29.99) {
      println("Overweight, your BMI is: " + (imc))
    }
    if (imc > 30 && imc <= 34.99) {
      println("Obesity, your BMI is: " + (imc))
    }
    if (imc > 35 && imc <= 40) {
      println("Severe Obesity, your BMI and: " + (imc))
    }
    if (imc> 40) {
      println("Morbid Obesity: " + (imc))
    }


  }

  catch {
    case _: Throwable => println("Just inform number")
  }
}

