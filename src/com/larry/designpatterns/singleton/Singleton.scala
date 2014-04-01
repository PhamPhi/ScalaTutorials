package com.larry.designpatterns.singleton

/**
 * @author Larry Pham
 * Description: Singleton Pattern
 */
class Singleton {
  println("Programming Scala, Singleton")
}

// Define the object singleton
object Singleton{
  private val singleton = new Singleton
  def getInstance(): Singleton={
    return singleton
  }
}
