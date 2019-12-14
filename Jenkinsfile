pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
        archiveArtifacts(allowEmptyArchive: true, artifacts: '**/*.war')
      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('deploy') {
      steps {
        sh 'cp /root/.jenkins/workspace/Maven_master/target/webaplicationmv-1.0-SNAPSHOT.war /opt/wildfly/standalone/deployments/'
      }
    }

  }
}
