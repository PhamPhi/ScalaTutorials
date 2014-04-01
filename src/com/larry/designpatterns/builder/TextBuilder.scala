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
class TextBuilder extends Builder {
  private val buffer = new StringBuffer()

  def makeTitle(title: String){
    buffer.append("====================================================\n")
    buffer.append("[" + title + "]\n")
    buffer.append("\n")
  }

  def makeContent(content: String){
    buffer.append("." + content + "\n")
    buffer.append("\n")
  }

  def makeItems(items: List[String]){
    for  ( i <- 0 to items.length -1){
      buffer.append("." + items(i) + "\n")
    }
    buffer.append("\n")
  }

  def close(){
    buffer.append("=====================================================\n")
  }

  def getResult(): String = {
    return buffer.toString()
  }
}
