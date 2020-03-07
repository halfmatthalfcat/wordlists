package com.github.halfmatthalfcat.moniker

import enumeratum.EnumEntry.Snakecase
import enumeratum._

sealed trait Adjective extends EnumEntry with Snakecase

object Adjective extends Enum[Adjective] {
  val values = findValues

  case object Age               extends Adjective
  case object Algorithms        extends Adjective
  case object Appearance        extends Adjective
  case object Character         extends Adjective
  case object Colors            extends Adjective
  case object Complexity        extends Adjective
  case object Construction      extends Adjective
  case object CorporatePrefixes extends Adjective
  case object Emotions          extends Adjective
  case object Geometry          extends Adjective
  case object Linguistics       extends Adjective
  case object Materials         extends Adjective
  case object MusicTheory       extends Adjective
  case object Physics           extends Adjective
  case object Quantity          extends Adjective
  case object Shape             extends Adjective
  case object Size              extends Adjective
  case object Sound             extends Adjective
  case object Speed             extends Adjective
  case object Taste             extends Adjective
  case object Temperature       extends Adjective
  case object Weather           extends Adjective
}