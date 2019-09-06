pipeline {
  agent none
  stages {
    stage('Build') {
      steps {
        echo 'Jenkins Pipeline Minute'
      }
    }
    stage('Test') {
      environment {
        CI = 'true'
      }
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }
  }
}