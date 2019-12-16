pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('deploy') {
      steps {
        sh 'cp /root/.jenkins/workspace/Maven_master/target/junit-1.war /opt/wildfly/standalone/deployments/'
      }
    }

  }
}