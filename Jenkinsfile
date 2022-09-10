pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git 'https://github.com/ihuang12/jenkins-calculator.git'
        sh 'mvn clean package'
      }
    }
  }
}
