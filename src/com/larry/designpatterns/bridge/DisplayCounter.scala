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
 * ${YEAR}.${DATE}.${DAY}      larry.pham          Initialize version
 **/
class DisplayCounter(instance: DisplayImpl) extends Display(instance) {
  /**
   * Method multiDisplay() used to determine the capable display
   * @param times
   */
  def multiDisplay(times: Int) {
    open()
    for (instance <- 0 to times - 1) {
      print()
    }
    close()
  }
}
