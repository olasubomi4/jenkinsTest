pipeline {
    agent any
       triggers {
            githubPush()
        }
     tools {
            maven 'mv'  // Use the name given in Global Tool Configuration
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
            stage('hello') {
                    steps {
                        echo 'hello test 3'
                    }
                }
                stage('Print Current Directory') {
                            steps {
                                script {
                                    def currentDir = pwd()
                                    echo "Current directory: ${currentDir}"
                                }
                            }
                        }
                     stage('Deploy') {
                         steps {
                             script {
                              dir('target') {
                                 sh 'java -jar jenkinsTest-0.0.1-SNAPSHOT.jar'
                                 }
                             }
                         }
                     }


    }
}