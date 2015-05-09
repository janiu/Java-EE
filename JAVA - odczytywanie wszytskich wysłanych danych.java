PrintWriter out=response.getWriter();
Enumeration en=request.getParameterNames();

while(en.hasMoreElements())
{
			Object objOri=en.nextElement();
			String param=(String)objOri;
			String value=request.getParameter(param);
			out.println(firstName);	
}		
