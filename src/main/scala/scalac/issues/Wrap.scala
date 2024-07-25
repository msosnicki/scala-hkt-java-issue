package scalac.issues

trait Wrap[F[_]] {
  def wrap[A](a: A): F[A]
}
