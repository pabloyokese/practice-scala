package com.jp.scala.oop.commands
import com.jp.scala.oop.files.Directory
import com.jp.scala.oop.filesystem.State

class Mkdir (name:String) extends Command {
  override def apply(state: State): State = {
    val wd = state.wd
    if(wd.hasEntry(name)){
      state.setMessage("Entry "+ name+" already exits!")
    } else if(name.contains(Directory.SEPARATOR)) {
      state.setMessage(name + "must not contain separators!")
    } else if (checkIllegal(name)) {
      state.setMessage(name + ": illegal entry name")
    }else {
      doMkdDir(state, name)
    }
  }

  def checkIllegal(str: String):Boolean = {
    name.contains(".")
  }

  def doMkdDir(state:State, name:String): State = {

  }
}
