package com.example

import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import java.io.BufferedWriter

class ScalaHelloWorld extends HttpFunction {
  
    override def service(request: HttpRequest, response: HttpResponse) = {
        val writer: BufferedWriter = response.getWriter()
        writer.write("Hello world!")
    }   
}
