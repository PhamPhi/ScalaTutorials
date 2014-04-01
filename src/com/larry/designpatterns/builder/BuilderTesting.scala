package com.larry.designpatterns.builder

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
object BuilderTesting {
  def main(args: Array[String]) {
    if (args.length != 1) {
      usage()
      sys.exit(0)
    }

    if (args(0).equals("plain")) {

      val textBuilder = new TextBuilder()
      val director = new Director(textBuilder)

      director.construct()

      val result = textBuilder.getResult()
      println(result)
    } else if (args(0).equals("html")) {
      val htmlBuilder = new HtmlBuilder()
      val director = new Director(htmlBuilder)

      director.construct()

      val filename = htmlBuilder.getResult()
      println(filename + "building_skills")
    } else {
      usage()
      sys.exit(0)
    }

  }

  def usage() {
    println("Usage: scala main plain: Larry Skills ")
    println("Usage: scala main html: HTML Larry Skills")
  }
}
