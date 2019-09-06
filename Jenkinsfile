pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Jenkins Pipeline Minute'
      }
    }
    stage('Test') {
      steps {
        readTrusted '/home/Documents/GitHub/simple-java-maven-app'
      }
    }
  }
}