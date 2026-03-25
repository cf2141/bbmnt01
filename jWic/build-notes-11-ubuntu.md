

1. reinstall ubuntu 24.04 desktop
2. apt install   openssh-server openssh-client
3. install brave
4. sudo apt install vlc
5. nvlc TryOrCry-1o2.mp3


6. cd ~/Downloads
7. curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.115/bin/apache-tomcat-9.0.115.tar.gz
8. sudo tar xzvf apache-tomcat-9.0.115.tar.gz  -C /opt/tomcat --strip-components=1
9. cd /opt/tomcat
10. sudo chgrp -R tomcat /opt/tomcat
11. sudo chmod -R g+r conf
12. sudo chown -R tomcat webapps/ work/ temp/ logs/
13. sudo vi /etc/systemd/system/tomcat.service


[Unit]
Description=Tomcat - instance %i
After=syslog.target network.target

[Service]
Type=forking

#Environment=JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
Environment=JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
Environment=CATALINA_HOME=/opt/tomcat
Environment=CATALINA_BASE=/opt/tomcat
Environment='CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC'
Environment='JAVA_OPTS=-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom'

ExecStart=/opt/tomcat/bin/startup.sh
ExecStop=/opt/tomcat/bin/shutdown.sh

User=tomcat
Group=tomcat
UMask=0007
RestartSec=10
Restart=always

[Install]
WantedBy=multi-user.target

14. sudo systemctl daemon-reload
15. sudo systemctl start tomcat

16.    64  sudo tar xzvf apache-tomcat-9.0.115.tar.gz  -C /opt/tomcat --strip-components=1
   65  cd /opt/tomcat
   66  sudo chgrp -R tomcat /opt/tomcat
   67  sudo chmod -R g+r conf
   68  sudo chown -R tomcat webapps/ work/ temp/ logs/
   69  sudo vi /etc/systemd/system/tomcat.service
   70  sudo systemctl daemon-reload
   71  sudo systemctl start tomcat
   72  systemctl status tomcat.service
   73  sudo vi /etc/systemd/system/tomcat.service
   74  sudo systemctl daemon-reload
   75  systemctl status tomcat.service
   76  sudo systemctl start tomcat
   77  systemctl status tomcat.service




