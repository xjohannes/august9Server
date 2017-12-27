package com.august9.app

import org.scalatra._

class August9ScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
