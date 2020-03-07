# scala-moniker

Generate random [monikers](https://www.merriam-webster.com/dictionary/moniker), or nicknames, in Scala.

## Support

|Version|Supported Scala Versions|
|---|---|
|0.0.1|2.13.x, 2.12.x|

## Installation

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.halfmatthalfcat/scala-moniker/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.halfmatthalfcat/scala-moniker)

```scala
"com.github.halfmatthalfcat" %% "scala-moniker" % "0.0.1"
```

## Usage

### Generate a single, random moniker

```scala
import com.github.halfmatthalfcat.moniker._

val moniker: Moniker = Moniker()

val nickname: String = moniker.getRandom()
```

### Generate multiple monikers

```scala
import com.github.halfmatthalfcat.moniker._

val moniker: Moniker = Moniker()

val nicknames: Seq[String] = moniker.getRandoms(count = 10)
```

### Generate using custom lists

You can specify which lists you want to generate from when instantiating
a new instance of Moniker.

```scala
import com.github.halfmatthalfcat.moniker._

val moniker: Moniker = Moniker(
  adjectives = Seq(
    Adjective.Appearance,
    Adjective.Colors,
  ),
  nouns = Seq(
    Noun.Astronomy,
    Noun.Containers,
  ) 
)
```

## Word Lists

The word lists are based on the upstream repository [imsky/wordlists](https://github.com/imsky/wordlists) and are synced
periodically. Any request for more words should be asked/added there.