package org.allenai.common

/** Various convenient utilities for Scala constructs. */
object ScalaUtils {

  /** A common use case for groupBy. Takes in a sequence of pairs, groups them by the first
    * element, and returns a map from the group identifier to a sequence of second elements
    * of the matching pairs. E.g., ((a,1), (b,2), (a,3), (b,4)) turns into {a -> (1,3),
    * b -> (2,4)}
    */
  def toMapUsingGroupByFirst[T1, T2](x: Seq[(T1, T2)]): Map[T1, Seq[T2]] = {
    x.groupBy(_._1).mapValues(_.unzip._2)
  }
}
