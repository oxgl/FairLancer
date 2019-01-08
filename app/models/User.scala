package models

import defs.Types._

import com.mohiva.play.silhouette.api.{ Identity, LoginInfo }

/**
 * The user object.
 *
 * @param userID The unique ID of the user.
 * @param loginInfo The linked login info.
 * @param email Maybe the email of the authenticated provider.
 * @param avatarURL Maybe the avatar URL of the authenticated provider.
 * @param activated Indicates that the user has activated its registration.
 */
case class User(
  userID: GUID,
  loginInfo: LoginInfo,
  email: Option[String],
  avatarURL: Option[String],
  activated: Boolean) extends Identity {

  /**
   * Tries to construct a name.
   *
   * @return Maybe a name.
   */
  /*  def name = fullName.orElse {
    firstName -> lastName match {
      case (Some(f), Some(l)) => Some(f + " " + l)
      case (Some(f), None) => Some(f)
      case (None, Some(l)) => Some(l)
      case _ => None
    }
  }*/
}
