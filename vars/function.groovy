def new_download(file)
{
  git "https://github.com/Mitulpawar/${file}"
}
def new_build(repo)
{
  sh 'mvn package'
}
