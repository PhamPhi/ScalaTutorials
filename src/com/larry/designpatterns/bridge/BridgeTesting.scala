package com.larry.designpatterns.bridge

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
object BridgeTesting {
  def main(args: Array[String]){
    val display1= new Display(new StringDisplayIml("clash, clash"))
    val display2= new DisplayCounter(new StringDisplayIml("crap, crap"))
    val display3= new DisplayCounter(new StringDisplayIml("Fuck 'n Stuff"))

    println()
    display1.display()
    display2.display()
    display3.display()
    display3.multiDisplay(5)
  }
}
