pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''source /etc/profile.d/exports.sh
echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"
cd initial
${M2_HOME}/bin/mvn clean build'''
      }
    }
  }
  environment {
    maven = 'Maven 3.3.9'
    jdk = 'jdk8'
  }
}