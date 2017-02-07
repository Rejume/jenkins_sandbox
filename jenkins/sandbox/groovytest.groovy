
node {
  def ftest = load('https://github.com/Rejume/jenkins_sandbox/jenkins/sandbox/lib/functiontest.groovy')
  ansiColor('xterm'){
    println 'hogehogehogehoge'
    ftest.testfunc1()
  }
}
