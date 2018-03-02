package jp.beginner.roppongi.model.ordering.domain.stock

case class StockID(value: String) extends AnyVal with EntityId {
  this.canEqual()
}
