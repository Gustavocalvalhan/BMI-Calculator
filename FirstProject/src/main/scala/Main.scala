
import scala.io.StdIn.{readInt, readLine}
import scala.math.BigDecimal.double2bigDecimal

object Main extends App {

  var a: Double = 0
  var p: Double = 0
  var imc: Double = 0

  println("please inform your height: ")
  a = readInt()

  println("Please inform you weight: ")
  p = readInt()

  imc = (p / ((a * a) / 10000)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;

  if (imc < 17) {
    println("You are very underweight, your BMI is: " + (imc))
  }
    if (imc > 17 && imc <= 18.99) {
      println("Underweight, your BMI is: "+ (imc))
  }
      if (imc > 18.5 && imc <= 24.99) {
        println("Congratulations!! you are at your ideal weight your BMI is: "+ (imc))
  }
        if (imc > 25 && imc <= 29.99) {
          println("Overweight, your BMI is: " + (imc))
  }
          if (imc > 30 && imc <= 34.99) {
            println("Obesity, your BMI is: "+ (imc))
  }
            if (imc > 35 && imc <= 40) {
              println("Severe Obesity, your BMI and: "+ (imc))
    }
              if (imc > 40) {
                println("Morbid Obesity: "+ (imc))
    }

  }