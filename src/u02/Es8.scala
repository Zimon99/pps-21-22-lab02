package u02

object Es8 extends App:

  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(pred: A => Boolean): Option[A] = opt match
      case Some(a) if pred(a) => opt
      case _ => None()

    def map[A](opt: Option[A])(pred: A => Boolean): Option[Boolean] = opt match
      case Some(a) => Some(pred(a))
      case _ => None()

    def map2[A](opt1: Option[A])(opt2: Option[A]): Option[(A,A)] = (opt1, opt2) match
      case (Some(a), Some(b)) => Some((a,b))
      case _ => None()