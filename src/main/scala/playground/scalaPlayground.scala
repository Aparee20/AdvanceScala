package playground

object scalaPlayground  extends App{

  println("hello scala")

  echo "# AdScala" >> README.md
  git init
    git add README.md
  git commit -m "first commit"
  git remote add origin git@github.com:Aparee20/AdScala.git
  git push -u origin master
  …or push an existing repository from the command line
  git remote add origin git@github.com:Aparee20/AdScala.git
  git push -u origin master

}