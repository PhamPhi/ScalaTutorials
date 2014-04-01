package com.larry.designpatterns.AbstractFactory

import scala.collection.mutable.ArrayBuffer
import java.io.FileWriter

/**
 * Copyright (C) 2011 Techie DB Inc. All rights reserved.
 *
 * Software Development Division,
 * Digital Media & Communications Business, Techie DB Inc.
 *
 * This software and its documentation are confidential and proprietary information of Techie DB Inc. No part of the software and documents may be
 * copied, reproduced, transmitted, translated, or reduced to any electronic medium or machine-readable form without the prior written consent of 
 * Techie DB. Techie DB makes no representations with respect to the contents, and assumes no responsibility for any errors that might appear in the
 * software and documents. This publication and the contents hereof are subject to change without notice.
 *
 * History
 * 2014.01/04/2014.01      larry.pham          Initialize version
 **/
abstract class Page (t: String, a: String){

  protected val title = t
  protected val author = a
  protected val content = new ArrayBuffer[Item]()

  def add(item: Item){
    content += item
  }

  def output(){
    try{
      val fileName = title + ".html"
      val writer = new FileWriter(fileName)
      writer.write(this.makeHTML())
      writer.close()
      println(fileName + "was created one instance")
    }
  }

  def makeHTML(): String

}
