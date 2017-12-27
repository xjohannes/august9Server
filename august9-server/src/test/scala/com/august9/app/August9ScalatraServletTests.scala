package com.august9.app

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class August9ScalatraServletTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[August9ScalatraServlet], "/*")

  test("GET / on August9ScalatraServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
