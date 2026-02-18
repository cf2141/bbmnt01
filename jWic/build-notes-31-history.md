    1  which java
    2  ls -l /home/usr/lib
    3  which java
    4  java --version
    5  java -v
    6  java
    7  java --version
    8  java -version
    9  which java
   10  systemclt status tomcat
   11  sudo systemclt status tomcat
   12  sudo systemctl status tomcat
   13  sudo su -
   14  netstat -ntlp
   15  cd /opt/tomcat/
   16  sudo vi conf/server.xml
   17  netstat -ntlp
   18  sudo vi conf/server.xml
   19  netstat -ntlp
   20  sudo ufw status
   21  sudo vi conf/server.xml
   22  netstat -ntlp
   23  ip a
   24  sudo iptables -A INPUT -i eno1 -p tcp --dport 80 -j ACCEPT
   25  sudo iptables -A INPUT -i eno1 -p tcp --dport 8080 -j ACCEPT
   26  sudo iptables -A PREROUTING -t nat -i eno1 -p tcp --dport 80 -j REDIRECT --to-port 8080 
   27  netstat -ntlp
   28  cd logs
   29  sudo tail -f logs/catalina.out
   30  ls -l
   31  pwd
   32  mkdir downloads
   33  cd downloads/
   34  curl
   35  curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.115/bin/apache-tomcat-9.0.115.tar.gz
   36  sudo mkdir /opt/tomcat
   37  sudo tar xzvf apache-tomcat-9.0.115.tar.gz  -C /opt/tomcat --strip-components=1
   38  cd /opt/tomcat
   39  sudo chgrp -R tomcat /opt/tomcat
   40  sudo groupadd tomcat
   41  sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
   42  sudo chgrp -R tomcat /opt/tomcat
   43  sudo chmod -R g+r conf
   44  sudo chown -R tomcat webapps/ work/ temp/ logs/
   45  sudo vi /etc/systemd/system/tomcat.service
   46  sudo apt install openjdk-8-jdk
   47  sudo systemctl status tomcat
   48  sudo systemctl start tomcat
   49  sudo systemctl daemon-reload
   50  sudo systemctl start tomcat
   51  journalctl -xeu tomcat.service
   52  cd logs
   53  sudo su -
   54  sudo vi /etc/systemd/system/tomcat.service
   55  sudo systemctl daemon-reload
   56  sudo systemctl start tomcat
   57  sudo systemctl status tomcat
   58  sudo vi /etc/systemd/system/tomcat.service
   59  sudo systemctl daemon-reload
   60  sudo systemctl start tomcat
   61  sudo vi /etc/systemd/system/tomcat.service
   62  sudo systemctl daemon-reload
   63  sudo systemctl start tomcat
   64  sudo vi /etc/systemd/system/tomcat.service
   65  sudo systemctl daemon-reload
   66  sudo systemctl start tomcat
   67  sudo vi /etc/systemd/system/tomcat.service
   68  sudo systemctl daemon-reload
   69  sudo systemctl start tomcat
   70  sudo vi /etc/systemd/system/tomcat.service
   71  sudo systemctl daemon-reload
   72  sudo systemctl start tomcat
   73  ls -l
   74  sudo vi /etc/systemd/system/tomcat.service
   75  sudo systemctl daemon-reload
   76  sudo systemctl start tomcat
   77  ls -l
   78  ls -l conf
   79  sudo ls -l conf
   80  sudo vi /etc/systemd/system/tomcat.service
   81  sudo chgrp -R tomcat /opt/tomcat
   82  sudo chmod -R g+r conf
   83  sudo vi /etc/systemd/system/tomcat.service
   84  sudo systemctl daemon-reload
   85  sudo systemctl start tomcat
   86  sudo systemctl status tomcat
   87  ls -l conf
   88  ls -l
   89  sudo systemctl daemon-reload
   90  sudo systemctl status tomcat
   91  sudo systemctl start tomcat
   92  sudo chmod -R g+r conf
   93  sudo chown -R tomcat: /opt/tomcat/*
   94  sudo sh -c 'chmod +x /opt/tomcat/updated/bin/*.sh'
   95  ls -l
   96  sudo systemctl start tomcat
   97  sudo groupadd tomcat
   98  sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
   99  sudo chgrp -R tomcat /opt/tomcat
  100  sudo chmod -R g+r conf
  101  sudo chown -R tomcat webapps/ work/ temp/ logs/
  102  sudo systemctl daemon-reload
  103  sudo vi /etc/systemd/system/tomcat.service
  104  sudo systemctl daemon-reload
  105  sudo systemctl start tomcat
  106  netsat -nltp
  107  netstat -nltp
  108  sudo apt install net-tools
  109  netstat -nltp
  110  sudo systemctl start tomcat
  111  sudo systemctl daemon-reload
  112  sudo systemctl start tomcat
  113  ps -ef | grep java
  114  sudo systemctl daemon-reload
  115  sudo systemctl start tomcat
  116  journalctl -xeu tomcat.service
  117  sudo systemctl enable tomcat
  118  sudo systemctl start tomcat
  119  sudo vi /etc/systemd/system/tomcat.service
  120  sudo systemctl enable tomcat
  121  sudo vi /etc/systemd/system/tomcat.service
  122  sudo systemctl daemon-reload
  123  sudo systemctl enable tomcat
  124  sudo systemctl art tomcat
  125  sudo systemctl start tomcat
  126  sudo vi /etc/systemd/system/tomcat.service
  127  sudo systemctl daemon-reload
  128  sudo systemctl start tomcat
  129  sudo systemctl enable tomcat
  130  sudo systemctl start tomcat
  131  sudo systemctl enable tomcat
  132  sudo vi /etc/systemd/system/tomcat.service
  133  sudo systemctl daemon-reload
  134  sudo systemctl enable tomcat
  135  sudo vi /etc/systemd/system/tomcat.service
  136  sudo systemctl enable tomcat
  137  sudo systemctl daemon-reload
  138  sudo systemctl start tomcat
  139  sudo systemctl stop tomcat
  140  sudo vi /etc/systemd/system/tomcat.service
  141  sudo systemctl daemon-reload
  142  sudo systemctl start tomcat
  143  sudo vi /etc/systemd/system/tomcat.service
  144  sudo update-alternatives --config java
  145  sudo vi /etc/systemd/system/tomcat.service
  146  sudo systemctl daemon-reload
  147  sudo systemctl start tomcat
  148  sudo ls -l
  149  sudo vi conf/server.xml
  150  sudo systemctl stop tomcat
  151  sudo systemctl start tomcat
  152  curl localhost:8080
  153  sudo ufw status
  154  sudo ufw enable
  155  sudo ufw allow 8080/tcp
  156  curl localhost:8080
  157  curl 10.10.89.92:8080
  158  sudo ufw allow 22/tcp
  159  sudo vi /etc/systemd/system/tomcat.service
  160  sudo systemctl daemon-reload
  161  sudo systemctl stop tomcat
  162  sudo systemctl start tomcat
  163  sudo systemctl stop tomcat
  164  sudo systemctl start tomcat
  165  sudo vi /etc/systemd/system/tomcat.service
  166  sudo systemctl stop tomcat
  167  sudo vi /etc/systemd/system/tomcat.service
  168  sudo systemctl start tomcat
  169  sudo systemctl stop tomcat
  170  sudo systemctl start tomcat
  171  sudo apt update
  172  sudo apt upgrade
  173  sudo apt-get install vlc -y
  174  sudo apt install libdvdnav4 libdvdread4 gstreamer1.0-plugins-bad gstreamer1.0-plugins-ugly libdvd-pkg
  175  sudo apt install ubuntu-restricted-extras
  176  cd ~
  177  ls -l
  178  mkdir dev
  179  cd dev
  180  mkdir 2026
  181  cd 2026
  182  sudo apt install git
  183  gh repo clone cf2141/bbmnt01
  184  sudo apt install gh
  185  gh repo clone cf2141/bbmnt01
  186  gh auth login
  187  git clone cf2141/bbmnt01
  188  git clone https://github.com/cf2141/jWic.git
  189  ls -l
  190  git clone https://github.com/cf2141/bbmnt01.git
  191  ls -l
  192  ls -l bbmnt01
  193  ls -l bbmnt01/jWic/
  194  sudo apt install ant
  195  ls -l
  196  cd jWic/
  197  ls -l
  198  cat README.md 
  199  ls -l
  200  ant build
  201  cat readme.txt
  202  and
  203  ant
  204  fnd . -name build.*
  205  find . -name build.*
  206  cd ../bbmnt01/
  207  ls -l
  208  cd jWic/
  209  ls -l
  210  sudo apt install mvn
  211  sudo apt install maven
  212  cd ../../jWic/
  213  mvn package
  214  cd ../bbmnt01/jWic/
  215  mvn package
  216  find . -name samples.war
  217  cp .target-mvn/jwic-samples/samples.war 
  218  ls /opt/tomcat/webapps/
  219  sudo cp .target-mvn/jwic-samples/samples.war /opt/tomcat/webapps/
  220  ls -l
  221  ls -l audio-rnd/
  222  ls -l
  223  ls -l audio-test
  224  cd /opt/tomcat/
  225  ls -l
  226  sudo ls -l webapps/
  227  sudo ls -l webapps/samples
  228  sudo ls -l webapps/samples/audio-test
  229  ls -l
  230  cd ~/dev/2026
  231  ls -l
  232  cd ../../downloads/
  233  ls -l
  234  pwd
  235  cd ..
  236  ls -l
  237  sudo ls -l /opt/tomcat/webapps/samples
  238  sudo ls -l /opt/tomcat/webapps/samples/audio-test
  239  sudo cp TryOrCry-1o2.mp3 /opt/tomcat/webapps/samples/audio-test/.
  240  sudo cd /opt/tomcat/webapps/samples/audio-test/
  241  cd /opt/tomcat/webapps/samples/audio-test/
  242  sudo su -
  243  ls -al
  244  cd .ssh
  245  ls -l
  246  cat id_ed25519
  247  ssh-keygen -t ed25519 -C "tr9210@gmx.com"
  248  ls -l
  249  cat id_ed25519-tr9210.pub 
  250  cat id_ed25519.pub 
  251  cd ..
  252  ls -l
  253  cd dev
  254  ls -l
  255  cd 2026
  256  ls -l
  257  mkdir 0217-jWic-plus
  258  cd 0217-jWic-plus/
  259  sudo apt update && sudo apt upgrade -y
  260  sudo apt install gh -y
  261  gh repo clone cf2141/bbmnt01
  262  gh auth login
  263  gh repo clone cf2141/bbmnt01
  264  ls -l
  265  gh repo clone cf2141/jWic
  266  ls -l
  267  cd bbmnt01/
  268  ls -l
  269  cd jWic/
  270  ls -l
  271  mvn package
  272  ls -l
  273  git status
  274  git config --global core.excludesfile ~/.target-mvn
  275  git status
  276  git config --global core.excludesfile ~/.target-mvn/jwic-samples
  277  git status
  278  git add build-notes-30.md
  279  git commit -m "this is so annoying, the way the continually change things"
  280  git config --global user.email "tr9210@gmx.com"
  281  git config --global user.email "john galt"
  282  git commit -m "this is so annoying, the way the continually change things"
  283  git push
  284  history
  285  ls -l
  286  history > build-notes-31-history.md
