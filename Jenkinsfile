pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh '''source "/etc/profile"
echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"'''
      }
    }
    stage('Build') {
      steps {
        sh '''cd initial
${M2_HOME}/bin/mvn clean build'''
      }
    }
  }
  environment {
    maven = 'Maven 3.3.9'
    jdk = 'jdk8'
  }
}