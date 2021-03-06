package org.allenai.common

import org.allenai.common.testkit.UnitSpec

class FileUtilsSpec extends UnitSpec {

  "FileUtils" should "correctly read plain text resource" in {
    val lines = FileUtils.getResourceAsLines(getClass, "testfile.txt")
    val whatIsExpected = Seq("This is line 1.", "This is line 2.", "...", "This is line N.")
    lines should be(whatIsExpected)
  }

  it should "correctly read CSV resource" in {
    val lines = FileUtils.getCSVContentFromResource(getClass, "testfile.csv")
    val whatIsExpected = Seq(Seq("a1", "b1", "c1"), Seq("a2", "b2", "c2"), Seq("a3", "b3", "c3"))
    lines should be(whatIsExpected)
  }
}
