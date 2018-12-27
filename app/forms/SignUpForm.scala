package forms

import play.api.data.Form
import play.api.data.Forms._

/**
 * The form which handles the sign up process.
 */
object SignUpForm {

  /**
   * A play framework form.
   */
  val form = Form(
    mapping(
      "country" -> nonEmptyText,
      "companyId" -> nonEmptyText(minLength = 6, maxLength = 20),
      "companyName" -> nonEmptyText(maxLength = 64),
      "firstName" -> nonEmptyText(minLength = 1, maxLength = 100),
      "lastName" -> nonEmptyText(minLength = 1, maxLength = 100),
      "email" -> email,
      "password" -> nonEmptyText)(Data.apply)(Data.unapply))

  /**
   * The form data.
   *
   * @param firstName The first name of a user.
   * @param lastName The last name of a user.
   * @param email The email of the user.
   * @param password The password of the user.
   */
  case class Data(
    country: String,
    companyId: String,
    companyName: String,
    firstName: String,
    lastName: String,
    email: String,
    password: String)
}
