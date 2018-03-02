package jp.beginner.roppongi.model.ordering.domain.support

trait EntityId extends Any {
  def hashCode: Int

  def equals(obj: scala.Any): Boolean

  def toString: String
}
