package com.larry.designpatterns.bridge

/**
 * @author Larry Pham
 * @since 2014.04.01
 */
class Display(instance: DisplayImpl) {
  val implement = instance

  def open(){
    implement.rawOpen()
  }

  def print(){
    implement.rawPrint()
  }

  def close(){
    implement.rawClose()
  }

  final def display(){
    open()
    print()
    close()
  }
}
