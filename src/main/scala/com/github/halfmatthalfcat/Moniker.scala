package com.github.halfmatthalfcat

import scala.io.Source
import scala.util.Random

class Moniker(
  adjectives: Seq[Adjective],
  nouns: Seq[Noun],
) {
  private[this] lazy val cachedAdjectives: Seq[String] =
    Moniker.loadAdjectives(adjectives)
  private[this] lazy val cachedNouns: Seq[String] =
    Moniker.loadNouns(nouns)

  private[this] def randomAdjective(): String = {
    val r: Random = new Random()
    cachedAdjectives(r.nextInt(cachedAdjectives.length + 1))
  }
  private[this] def randomNoun(): String = {
    val r: Random = new Random()
    cachedNouns(r.nextInt(cachedNouns.length + 1))
  }

  def getRandom(delimiter: String = " "): String = {
    s"${randomAdjective()}$delimiter${randomNoun()}"
  }

  def getRandoms(delimiter: String = " ", count: Int = 1): Seq[String] = {
    Seq.fill(count)(getRandom(delimiter))
  }
}

object Moniker {
  def apply(
    adjectives: Seq[Adjective] = Seq(),
    nouns: Seq[Noun] = Seq(),
  ): Moniker = new Moniker(adjectives, nouns)

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
