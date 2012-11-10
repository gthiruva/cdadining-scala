package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
//    Ok(views.html.index("Your new application is ready."))
      Ok(views.html.index(""))
  }
  def about = Action {
    Ok(views.html.about("Hi George's html.about!."))
  }
  def careers = Action {
    Ok(views.html.careers("Hi George's html.reserve!."))
  }
  def events = Action {
    Ok(views.html.events("Hi George's html.events!."))
  }
  def investors = Action {
    Ok(views.html.investors("Hi George's html.reserve!."))
  }
  def menu = Action {
    Ok(views.html.menu("Hi George's html.menu!."))
  }
  def mixology = Action {
    Ok(views.html.mixology("Hi George's html.mini!."))
  }
  def order = Action {
    Ok(views.html.order("Hi George's html.order!."))
  }
  def photos = Action {
    Ok(views.html.photos("Hi George's html.photos!."))
  }
  def press = Action {
    Ok(views.html.press("Hi George's html.press!."))
  }
  def reserve = Action {
    Ok(views.html.reserve("Hi George's html.reserve!."))
  }
}
