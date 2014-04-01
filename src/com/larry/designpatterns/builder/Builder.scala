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
abstract class Builder {
  // Define the abstract methods for building the HTML content or TXT files
  def makeTitle(title: String): Unit // Method used for creating the title of Html file
  def makeContent(content: String): Unit // Method used for creating the content of html file or text file
  def makeItems(items: List[String]): Unit // Method used for creating the items by using the content of list of strings
  def close(): Unit // Method close used to close the tag into the html file or text file
}
