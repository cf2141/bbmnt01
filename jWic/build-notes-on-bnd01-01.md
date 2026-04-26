
NAME="Ubuntu"
VERSION="20.04.6 LTS (Focal Fossa)"

    1  sudo apt upgrade
    2  sudo apt update
    3  sudo apt upgrade
    4  java version
    5  sudo apt install openjdk-8-jdk
    6  java -version
    7  sudo apt install maven
    8  git
    9  cd dev
   10  mkdir dev
   11  cd dev
   12  mkdir 2026
   13  cd 2026
   14  mkdir bbmnt
   15  cd bbmnt/
   16  sudo apt install gh
   17  git clone git@github.com:cf2141/bbmnt01.git
   18  cd ~
   19  ssh-keygen -t ed25519 -C "landerson321@protonmail.com"
   20  cd .ssh
   21  ls -l
   22* cat id_ed25519.pub cd
   23  cd ../dev/2026/bbmnt/
   24  git clone git@github.com:cf2141/bbmnt01.git
   25  ls -l
   26  cd bbmnt01/
   27  ls -l
   28  cd jWic/
   29  mvn package
   30  history

   38  sudo mkdir /opt/tomcat

   42  curl -O https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.116/bin/apache-tomcat-9.0.116.tar.gz
   43  sudo tar xzvf apache-tomcat-9.0.116.tar.gz -C /opt/tomcat --strip-components=1

sudo vi /etc/systemd/system/tomcat.service

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
