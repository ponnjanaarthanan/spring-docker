pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh '''echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"'''
      }
    }
    stage('Build') {
      steps {
        sh '''cd initial
mvn clean build'''
      }
    }
  }
  environment {
    maven = 'Maven 3.3.9'
    jdk = 'jdk8'
  }
}