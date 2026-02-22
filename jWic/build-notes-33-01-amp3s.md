root@bnd01:/opt/tomcat/webapps/01-amp3s# cat 01-amp3s.json
{
  "echo-list":[
      "TryOrCry-1o2.mp3",
      "jc-gooch-side-1.mp3",
      "jc-gooch-side-2.mp3"
  ]
}


root@bnd01:/opt/tomcat/webapps/01-amp3s# cat echolist.html
<html>
  <head>
  </head>
  <body>
    Echo List
    <audio controls>
	<source src="/01-amp3s/TryOrCry-1o2.mp3" type="audio/mpeg">
    </audio>
  </body>
</html>


