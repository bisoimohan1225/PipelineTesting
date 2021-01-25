node{
stage('SCM Checkout'){
  git 'https://github.com/bisoimohan1225/PipelineTesting'
  }
stage("Compile-package"){
def mavenhome = tool name: '', type: 'maven'
sh="${mavenhome}/bin/mvn package"
}
}
