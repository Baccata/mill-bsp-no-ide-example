package bar

import cats.effect.IO

case class Bar(io: IO[Int])
