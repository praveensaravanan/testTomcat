This is a very basic servlet to forward the response to another servlet or to JSP.

request.getRequestDispatcher(“url”) means the dispatch is relative to the current HTTP request.
EG:RequestDispatcher reqDispObj = request.getRequestDispatcher("/home.jsp");
getServletContext().getRequestDispatcher(“url”) means the dispatch is relative to the root of the ServletContext.
EG:RequestDispatcher reqDispObj = getServletContext().getRequestDispatcher("/ContextRoot/home.jsp");
