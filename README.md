# sparkjava-microservice-example
sample code for spark java microservice by joel patrick llosa for a stackhunter.com blog

here is the output when you run the service then invoke http://localhost:8080/log?m=my%20precious&s=one.ring.to.rule.them.all:

<pre>
[Thread-0] INFO org.eclipse.jetty.util.log - Logging initialized @217ms
[Thread-0] INFO spark.webserver.JettySparkServer - == Spark has ignited ...
[Thread-0] INFO spark.webserver.JettySparkServer - >> Listening on 0.0.0.0:8080
[Thread-0] INFO org.eclipse.jetty.server.Server - jetty-9.3.2.v20150730
[Thread-0] INFO org.eclipse.jetty.server.ServerConnector - Started ServerConnector@1d96ab0{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
[Thread-0] INFO org.eclipse.jetty.server.Server - Started @345ms
message: my precious, stacktrace: one.ring.to.rule.them.all
[qtp28870113-15] INFO spark.webserver.MatcherFilter - The requested route [/favicon.ico] has not been mapped in Spark
</pre>
