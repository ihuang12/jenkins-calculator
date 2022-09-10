pipeline {
  agent any
  stages {
    stage('Versions of Java and Git') {
        steps {
            bat 'java -version'
            bat 'git --version'
        }
    }
    stage('Build') {
      steps {
        git 'https://github.com/ihuang12/jenkins-calculator.git'
    withMaven(maven: 'maven') {
        bat 'mvn clean package'
        }
      }
    }
  }
}
