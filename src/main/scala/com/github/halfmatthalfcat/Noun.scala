package com.github.halfmatthalfcat

import enumeratum._
import enumeratum.EnumEntry.Snakecase

sealed trait Noun extends EnumEntry with Snakecase

object Noun extends Enum[Noun] {
  val values = findValues

  case object `3dGraphics`        extends Noun
  case object `3dPrinting`        extends Noun
  case object Accounting          extends Noun
  case object Algorithms          extends Noun
  case object ApexPredators       extends Noun
  case object Architecture        extends Noun
  case object Astronomy           extends Noun
  case object Automobiles         extends Noun
  case object Birds               extends Noun
  case object Buildings           extends Noun
  case object CarParts            extends Noun
  case object Cats                extends Noun
  case object Cheese              extends Noun
  case object Chemistry           extends Noun
  case object Coding              extends Noun
  case object Condiments          extends Noun
  case object Construction        extends Noun
  case object Containers          extends Noun
  case object Corporate           extends Noun
  case object CorporateJob        extends Noun
  case object Cotton              extends Noun
  case object DataStructures      extends Noun
  case object Design              extends Noun
  case object Dogs                extends Noun
  case object Driving             extends Noun
  case object FastFood            extends Noun
  case object Filmmaking          extends Noun
  case object Fish                extends Noun
  case object Food                extends Noun
  case object Fortifications      extends Noun
  case object Fruit               extends Noun
  case object Furniture           extends Noun
  case object Gaming              extends Noun
  case object Geography           extends Noun
  case object Ghosts              extends Noun
  case object History             extends Noun
  case object Houses              extends Noun
  case object Infrastructure      extends Noun
  case object Insurance           extends Noun
  case object LinearAlgebra       extends Noun
  case object MachineLearning     extends Noun
  case object Meat                extends Noun
  case object Metals              extends Noun
  case object MilitaryAirforce    extends Noun
  case object MilitaryArmy        extends Noun
  case object MilitaryNavy        extends Noun
  case object Minerals            extends Noun
  case object MusicInstruments    extends Noun
  case object MusicProduction     extends Noun
  case object MusicTheory         extends Noun
  case object Phones              extends Noun
  case object Physics             extends Noun
  case object PhysicsOptics       extends Noun
  case object PhysicsUnits        extends Noun
  case object PhysicsWaves        extends Noun
  case object Plants              extends Noun
  case object Radio               extends Noun
  case object RealEstate          extends Noun
  case object Screenwriting       extends Noun
  case object Seasonings          extends Noun
  case object SetTheory           extends Noun
  case object Shopping            extends Noun
  case object Spirits             extends Noun
  case object Sports              extends Noun
  case object Startups            extends Noun
  case object Storage             extends Noun
  case object Travel              extends Noun
  case object Typography          extends Noun
  case object VCS                 extends Noun
  case object Water               extends Noun
  case object WebDevelopment      extends Noun
  case object Wine                extends Noun
  case object Wood                extends Noun
  case object Writing             extends Noun
}
