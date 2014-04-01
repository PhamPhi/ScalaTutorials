package com.larry.designpatterns.builder

import java.io.{IOException, FileWriter, PrintWriter}


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
class HtmlBuilder extends Builder{

  private var fileName : String = null
  private var writer : PrintWriter = null

  def makeTitle(title: String){
    fileName = title + ".html"
    try{
      writer = new PrintWriter(new FileWriter(fileName))
    }catch{
      case e: IOException =>
           e.printStackTrace()
    }
    writer.println("<html><head><title>" + title + "</title></head><body>")
    writer.println("<h1>"+ title +"</h1>")
  }

  def makeContent(content: String){
    writer.println("<p>"+ content +"</p>")
  }

  def makeItems(items: List[String]){
    writer.println("<ul>")
    for (i <- 0 to items.length -1){
      writer.println("<li>" + items(i) + "</li>")
    }
    writer.println("</ul>")
  }

  def close(){
    writer.println("</body></html>")
    writer.close()
  }

  def getResult(): String = {
    return fileName
  }

}
