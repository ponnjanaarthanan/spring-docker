pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''source /etc/profile.d/exports.sh
echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"
cd initial
${M2_HOME}/bin/mvn clean package'''
      }
    }
    stage('Docker Image Build') {
      steps {
        sh '''source /etc/profile.d/exports.sh
echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"
cd initial
${M2_HOME}/bin/mvn docker:build'''
      }
    }
  }
  environment {
    maven = 'Maven 3.3.9'
    jdk = 'jdk8'
  }
}