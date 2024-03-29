package com.example

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._

// we don't implement our route structure directly in the service actor because
// we want to be able to test it independently, without having to spin up an actor
class MyServiceActor extends Actor with MyService {

  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(myRoute)
}

// this trait defines our service behavior independently from the service actor
trait MyService extends HttpService {

  val myRoute =
    path("") {
      get {
        parameter("q") { q => 
          if (q.equals("Quelle est ton adresse email")) 
        	  complete {
        		 "mon.adresse@domaine.tld"
        	  }
          else
            // TODO add logger to analyze received request if different from the ones expected 
            complete {
        		 ""
        	  }
        }
      }
    }
}