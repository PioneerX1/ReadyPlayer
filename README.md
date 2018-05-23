# ReadyPlayer
Player tracking web app built with Maven, Java Servlet, Spring, and uses Tomcat Local Server

## Requirements
1. Maven (including your own .m2/settings.xml file)
2. Java 
3. Eclipse (recommended since that was the IDE used, but IntelliJ works too)
4. Local Tomcat Server

## Run the App
1. This is a multi-module project, so run "mvn clean install" on the /playerservices, and then on /playerweb.
2. Within Eclipse, run the player.html with Tomcat.
3. Input the new player's info (id, name, score).
4. Run the DisplayPlayerDetailsServlet.java with Tomcat. First time will throw an error, simply add your id parameter after the URL (example: concat "?id=7" if your player's id is 7).
5. You should see the details of your player you previously entered.

## Note
This project also utilizes Spring Inversion of Control and Dependency Injection.
Player object is persisted in a hash map (so only session scope).
Spring beans are wired to auto inject the player data access object into the business object.
