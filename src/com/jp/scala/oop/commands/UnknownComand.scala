package com.jp.scala.oop.commands
import com.jp.scala.oop.filesystem.State

class UnknownComand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
