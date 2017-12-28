import com.august9.app._
import org.scalatra._
import javax.servlet.ServletContext

import com.august9.app.controllers.ProjectController
import org.json4s.{DefaultFormats, Formats}

class ScalatraBootstrap extends LifeCycle {
  implicit val formats: Formats = DefaultFormats
  override def init(context: ServletContext) {
    //context.mount(new August9ScalatraServlet, "/*")
    context.mount(new ProjectController, "/project/*")
  }
}
