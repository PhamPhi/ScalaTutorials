import com.larry.designpatterns.adapter.sample1.PrintBanner
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
class ApdapterSample1Spec extends FlatSpec {

  "Apdapter Sample1 " should "contains 2 methods" in {
    val params = new PrintBanner("Sample1 testing")
    params.printWeak()
    params.printStrong()
  }

  "Adapter Sample2 also " should "contains 2 method" in {
    val params = new  PrintBanner("Sample 2 testing")
    params.printWeak()
    params.printStrong()
  }
}
