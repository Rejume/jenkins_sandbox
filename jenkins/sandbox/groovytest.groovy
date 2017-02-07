
node {
  def ftest = load('jenkins/sandbox/lib/functiontest.groovy')
  ansiColor('xterm'){
    println 'hogehogehogehoge'
    ftest.testfunc1()
  }
}
