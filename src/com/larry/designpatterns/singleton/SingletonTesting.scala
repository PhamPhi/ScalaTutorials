package com.larry.designpatterns.singleton

/**
 * @author Larry Pham
 * @define The Singleton Pattern Teesting..
 */
object SingletonTesting {
  def main(args: Array[String]){
    println("Start...")

    val object1= Singleton.getInstance()
    val object2= Singleton.getInstance()
    if (object1 == object2){
      println("Just only object instance can be runt on ")
    }else{
      println("Wrong singleton pattern's principle")
    }
    println("Ending...")
  }
}
