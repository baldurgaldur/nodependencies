package com.jarvis.server.rest.action;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("window")
public class WindowAction
{
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getWindow()
  {
    return "hello world";
  }
}