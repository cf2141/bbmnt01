











 1990  cat /etc/os-release
 1991  java -version
 1992  mvn -version
 1993  mvn package
 1994  java -version
 1995  sudo apt install openjdk-8-jdk
 1996  sudo update-alternative --config java
 1997  sudo update-alternatives --config java
 1998  ls -l
 1999  cd dev
 2000  ls -l
 2001  cd jwic
 2002  ls -l
 2003  cd jWic5.3.34/
 2004  ls -l
 2005  history mvn
 2006  history
 2007  history | grep mvn
 2008  mvn package
 2009  sudo groupadd tomcat
 2010  sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
 2011  cd /tmp
 2012  sudo apt install curl
 2013  sudo mkdir /opt/tomcat
 2014  curl -O http://mirror.cc.columbia.edu/pub/software/apache/tomcat/tomcat-9/v9.0.10/bin/apache-tomcat-9.0.10.tar.gz
 2015  ls -l
 2016  cd /opt
 2017  ls -l
 2018  curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.115/bin/apache-tomcat-9.0.115-deployer.tar.gz
 2019  cd ~
 2020  ls -l
 2021  cd Downloads/
 2022  ls -l
 2023  curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.115/bin/apache-tomcat-9.0.115-deployer.tar.gz
 2024  ls -l
 2025  sudo tar xzvf apache-tomcat-9.0.115-deployer.tar.gz  -C /opt/tomcat --strip-components=1
 2026  cd /opt/tomcat
 2027  ls -l
 2028  sudo chgrp -R tomcat /opt/tomcat
 2029  sudo chmod -R g+r conf
 2030  ls -l
 2031  cat README.md
 2032  cd ..
 2033  rm -rf tomcat/
 2034  sudo rm -rf tomcat/
 2035  cd ~/
 2036  ls -l
 2037  cd cd Downloads/
 2038  ls -l
 2039  cd Downloads/
 2040  ls -l
 2041  curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.115/bin/apache-tomcat-9.0.115.tar.gz
 2042  sudo mkdir /opt/tomcat
 2043  sudo tar xzvf apache-tomcat-9.0.115.tar.gz  -C /opt/tomcat --strip-components=1
 2044  cd /opt/tomcat
 2045  ls -l
 2046  sudo chgrp -R tomcat /opt/tomcat
 2047  sudo chmod -R g+r conf
 2048  sudo chown -R tomcat webapps/ work/ temp/ logs/
 2049  sudo vi /etc/systemd/system/tomcat.service
 2050  sudo systemctl daemon-reload
 2051  sudo systemctl start tomcat
 2052  systemctl status tomcat.service
 2053  sudo vi /etc/systemd/system/tomcat.service
 2054  sudo systemctl start tomcat
 2055  sudo systemctl daemon-reload
 2056  sudo systemctl start tomcat
 2057  systemctl status tomcat.service
 2058  ls -l bin
 2059  ls -l
 2060  sudo systemctl start tomcat
 2061  systemctl status tomcat.service
 2062  cd ..
 2063  ls -l
 2064  cd tomcat/
 2065  sudo chgrp -R tomcat /opt/tomcat
 2066  sudo chmod -R g+r conf
 2067  sudo chmod g+x conf
 2068  sudo chown -R tomcat webapps/ work/ temp/ logs/
 2069  sudo systemctl daemon-reload
 2070  sudo systemctl start tomcat
 2071  systemctl status tomcat.service
 2072  which java
 2073  history
 2074  sudo update-alternatives --config java
 2075  sudo vi /etc/systemd/system/tomcat.service
 2076  sudo cat /etc/systemd/system/tomcat.service


bnd01@bnd01:/opt/tomcat$ sudo update-alternatives --config java
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
  0            /usr/lib/jvm/java-21-openjdk-amd64/bin/java      2111      auto mode
  1            /usr/lib/jvm/java-21-openjdk-amd64/bin/java      2111      manual mode
* 2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      manual mode

Press <enter> to keep the current choice[*], or type selection number:



bnd01@bnd01:/opt/tomcat$ sudo cat /etc/systemd/system/tomcat.service
[sudo] password for bnd01:

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






 2077  sudo update-alternatives --config java
 2078  sudo vi /etc/systemd/system/tomcat.service
 2079  sudo systemctl daemon-reload
 2080  sudo systemctl start tomcat
 2081  systemctl status tomcat.service
 2082  sudo vi /etc/systemd/system/tomcat.service
 2083  sudo systemctl daemon-reload
 2084  sudo systemctl start tomcat
 2085  systemctl status tomcat.service
 2086  history



ßs
[Unit]
Description=Tomcat - instance %i
After=syslog.target network.target

[Service]
Type=forking

User=tomcat
Group=tomcat

WorkingDirectory=/var/tomcat/%i

Environment="JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/"
Environment="JAVA_OPTS=-Djava.security.egd=file:///dev/urandom"

Environment="CATALINA_PID=/var/tomcat/%i/run/tomcat.pid"
Environment="CATALINA_BASE=/var/tomcat/%i/"
Environment="CATALINA_HOME=/opt/tomcat/"
Environment="CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC"

ExecStart=/opt/tomcat/bin/startup.sh
ExecStop=/opt/tomcat/bin/shutdown.sh

#RestartSec=10
#Restart=always

[Install]
WantedBy=multi-user.target:'



