def new_download(file)
{
  git "https://github.com/Mitulpawar/${file}"
}
def new_build()
{
  sh 'mvn package'
}
def new_deploy(jobname,id,pathname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${id}:/var/lib/tomcat9/webapps/${pathname}"
}
def new_test(jobname1)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname1}/testing.jar"
}
