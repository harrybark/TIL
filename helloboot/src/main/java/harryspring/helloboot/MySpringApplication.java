package harryspring.helloboot;

import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MySpringApplication {

    public static void run(Class<?> applicationClass, String... args) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext(){
            @Override
            protected void onRefresh() {
                super.onRefresh();
                ServletWebServerFactory serverFactory = this.getBean(ServletWebServerFactory.class);
                DispatcherServlet dispatcherServlet = this.getBean(DispatcherServlet.class);
                dispatcherServlet.setApplicationContext(this);

                WebServer webServer = serverFactory.getWebServer(servletContext -> {
                    servletContext.addServlet("dispatcherServlet", dispatcherServlet
                    ).addMapping("/*");
                });


				/*
				WebServer webServer = serverFactory.getWebServer(servletContext -> {
					servletContext.addServlet("dispatcherServlet",
							new DispatcherServlet(this)
					).addMapping("/*");
				});
				 */
                webServer.start();
            }
        };
        applicationContext.register(applicationClass);
        applicationContext.refresh();

        /* Servlet Container 실행 */
		/*
		ServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
		WebServer webServer = serverFactory.getWebServer(servletContext -> {
			// ServletContextInitializer는 onStartUp 만 실행하는 functional Interface에 해당한다.
			servletContext.addServlet("hello-servlet", new HttpServlet() {
				@Override
				protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					if ( req.getRequestURI().equals("/hello-servlet") && req.getMethod().equals(GET.name())) {
						String name = req.getParameter("name");

						HelloController helloController = applicationContext.getBean(HelloController.class);
						String ret = helloController.hello(name);

						//default status = 200
						//resp.setStatus(OK.value());
						resp.setContentType(TEXT_PLAIN_VALUE);
						resp.getWriter().println(ret);
					} else if (req.getRequestURI().equals("/user")) {

					} else {
						resp.setStatus(NOT_FOUND.value());
					}
				}
			}).addMapping("/hello-servlet");


			servletContext.addServlet("dispatcherServlet",
					new DispatcherServlet(applicationContext)
			).addMapping("/*");
		});
		webServer.start();
		*/
    }
}
