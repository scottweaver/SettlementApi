/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class SessionMetadata (
  /* Indicates the type of message this.  Can be either `settlement` and `reconciliation`. */
  messageFormat: SessionMetadataEnums.MessageFormat,
  /* API version.  Current version is 1.0. */
  version: String,
  /* Timestamp, in [RFC-3339](https://tools.ietf.org/html/rfc3339) timestamp format, when this message was created and sent to the receiving party. */
  timestamp: DateTime
) extends ApiModel

object SessionMetadataEnums {

  type MessageFormat = MessageFormat.Value
  object MessageFormat extends Enumeration {
    val Settlement = Value("settlement")
    val Reconciliation = Value("reconciliation")
  }

}

