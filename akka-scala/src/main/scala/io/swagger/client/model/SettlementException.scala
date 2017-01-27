/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class SettlementException (
  /* Uniquely identifies this Transaction within Vyze's settlement system (SFH).    This is a  monotonically increasing, positive number.  During settlement reconcilliation, the `settlement_id` on every `SettlementException` MUST exist with the Vyze SFH system.  If it does not, the entire settlement session will be failed.  */
  settlementId: String,
  /* Timestamp, in [RFC-3339](https://tools.ietf.org/html/rfc3339) timestamp format, of when the lender failed to fund this Trasnaction.  */
  exceptionDate: DateTime,
  /* Lender-defined code that categorizes the reason for this exception.  */
  reasonCode: String,
  /* A concise explanation of why this Settlement failed.  */
  reasonDescription: String
) extends ApiModel


