import com.larry.designpatterns.singleton.Singleton
import org.scalatest.FlatSpec

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
class SingletonSpec extends FlatSpec{

  "Singleton" should "only instance during while appear onto the runtime " in {
    val singleton  = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()
    assert(singleton == singleton2)
  }
}
