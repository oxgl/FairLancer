package models

import slick.jdbc.H2Profile.api._
import slick.lifted.{ ProvenShape, ForeignKeyQuery }

class Persons(tag: Tag) extends Table[(Int, String, String)](tag, "PERSONS") {

  // Primary key
  def id: Rep[Int] = column[Int]("PERSON_ID", O.PrimaryKey)
  def firstName: Rep[String] = column[String]("FIRST_NAME")
  def lastName: Rep[String] = column[String]("LAST_NAME")

  def * = (id, firstName, lastName)

}

/*
class Users(tag: Tag) extends Table[(Int, String)](tag, "USERS") {

}*/ 