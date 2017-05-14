package io.packit.model

interface Cuboid<T> {

  val id: String
  val name: String

  val length: Float
  val width: Float
  val height: Float

  val weight: Float

  fun rotateAboutX(): T
  fun rotateAboutY(): T
  fun rotateAboutZ(): T

}
