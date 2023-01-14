package my.areas
import math.{Pi => pi,pow}

class Circle(radius:Double) {

  def perimetr(): Double ={
    2*pi*radius
  }

  def area(): Double = {
    pi*pow(radius,2)
  }
}
