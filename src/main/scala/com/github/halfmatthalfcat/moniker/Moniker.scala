package com.github.halfmatthalfcat.moniker

import scala.io.Source
import scala.util.Random

class Moniker(
  adjectives: Seq[String],
  nouns: Seq[String],
) {
  private[this] val r: Random = new Random()

  private[this] def randomAdjective(): String = {
    adjectives(r.nextInt(adjectives.length + 1))
  }
  private[this] def randomNoun(): String = {
    nouns(r.nextInt(nouns.length + 1))
  }

  /**
   * Get a random adjective-noun combination for the given delimiter
   * @param delimiter An optional delimiter
   *                  Defaults to an empty space
   * @return A random adjective-noun combination
   */
  def getRandom(delimiter: String = " "): String = {
    s"${randomAdjective()}$delimiter${randomNoun()}"
  }

  /**
   * Get a sequence of n random adjective-noun combinations
   * @param delimiter An optional delimiter
   *                  Defaults to an empty space
   * @param count The number of random adjective-noun combinations to return
   *              Defaults to 1
   * @return A sequence of random adjective-noun combinations
   */
  def getRandoms(delimiter: String = " ", count: Int = 1): Seq[String] = {
    Seq.fill(count)(getRandom(delimiter))
  }
}

object Moniker {
  def apply(
    adjectives: Seq[Adjective] = Seq(),
    nouns: Seq[Noun] = Seq(),
  ): Moniker = {
    new Moniker(
      loadAdjectives(adjectives),
      loadNouns(nouns),
    )
  }

  private def loadAdjectives(
    adjectives: Seq[Adjective],
  ): Seq[String] = {
    if (adjectives.isEmpty) {
      Adjective
        .values
        .foldLeft(Seq[String]()) { case (acc: Seq[String], adj: Adjective) =>
          acc ++ Source.fromResource(s"adjectives/${adj.entryName}.txt").getLines
        }
    } else {
      adjectives
        .foldLeft(Seq[String]()) { case (acc: Seq[String], adj: Adjective) =>
          acc ++ Source.fromResource(s"adjectives/${adj.entryName}.txt").getLines
        }
    }
  }

  private def loadNouns(
    nouns: Seq[Noun],
  ): Seq[String] = {
    if (nouns.isEmpty) {
      Noun
        .values
        .foldLeft(Seq[String]()) { case (acc: Seq[String], noun: Noun) =>
          acc ++ Source.fromResource(s"nouns/${noun.entryName}.txt").getLines
        }

    } else {
      nouns
        .foldLeft(Seq[String]()) { case (acc: Seq[String], noun: Noun) =>
          acc ++ Source.fromResource(s"nouns/${noun.entryName}.txt").getLines
        }

    }
  }
}
