package io.packit.model

data class Container(
    override val id: String,
    override val name: String = "",
    override val length: Float,
    override val width: Float,
    override val height: Float,
    override val weight: Float) : Cuboid {

}
