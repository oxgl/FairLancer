package models

import defs.Types._

/**
 * 	The person object
 *
 * @param personId Id of the person
 * @param title Maybe the title of the person
 * @param firstName Maybe the first name of the person
 * @param lastName Maybe the last name of the person
 */
case class Person(
  personId: GUID,
  title: Option[String],
  firstName: Option[String],
  lastName: Option[String])