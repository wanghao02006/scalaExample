package com.leiyu

/**
  * Created by hdp on 16-11-16.
  */
class PackageLearn {

}



package com.horstmann.impatient{
  package people{
    class Paseron
  }
}

package object people{
  val defaultName = "john Q. Public"
}

package people{
  class Person{
    var name = defaultName
  }
}

import java.awt.{Color,Font}