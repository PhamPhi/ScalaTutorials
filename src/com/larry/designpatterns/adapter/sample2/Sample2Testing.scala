package com.larry.designpatterns.adapter.sample2

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
object Sample2Testing {

  def main(args: Array[String]){
    // Declaring the new instance of PrintBanner class with its content: "Sample2 Testing..."
    val params = new PrintBanner("Sample2 Testing... ")
    // Print the content to the console by 2 format way: by using parentheses and also asterisk
    println()
    params.printWeak()
    params.printStrong()
  }
}