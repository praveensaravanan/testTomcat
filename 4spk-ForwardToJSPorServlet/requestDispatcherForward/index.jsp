requestDispatcherForward Examples </br></br>

<a href="servletForwardToAnotherResource?JSPfromRootContext=true"> servletResponse will be sent To JSP present in the root context.</a> <br> [ request.getRequestDispatcher("/JSPResultPage.jsp").forward(request, response) ] . . [ servletForwardToAnotherResource?JSPfromRootContext=true ]</br><br>

<a href="servletForwardToAnotherResource?JSPfromRootContext=false"> servletResponse will be sent To JSP present in the same context.</a> <br> [ request.getRequestDispatcher("JSPResultPage.jsp").forward(request, response)  ] . . [ servletForwardToAnotherResource?JSPfromRootContext=false ]</br><br>

<a href="servletForwardToAnotherResource?JSPfromRootContext=true&forwardToAnotherServlet=true"> servletResponse will be forwarded to another servlet.</a> <br> [ request.getRequestDispatcher("servletForwardToJSP").forward(request, response)  ]  . . [ servletForwardToAnotherResource?JSPfromRootContext=true&forwardToAnotherServlet=true ]</br><br>

<a href="servletForwardToAnotherResource?JSPfromRootContext=false&forwardToAnotherServlet=true"> servletResponse will be forwarded to another servlet.</a> <br> [ request.getRequestDispatcher("servletForwardToJSP").forward(request, response)  ] . . [ servletForwardToAnotherResource?JSPfromRootContext=false&forwardToAnotherServlet=true ]</br><br>


